package com.jessethouin.util;

import com.jessethouin.model.Patents;
import org.apache.commons.collections4.list.SetUniqueList;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by jesse on June 11, 2016.
 *
 */
public class NASAUtil {
	public static SetUniqueList<String> getInventorNames(String nasaPatentsUrl, String nasaPatentsKey, String search, Integer limit) {
		SetUniqueList<String> names = SetUniqueList.setUniqueList(new ArrayList<>());
		ResponseEntity<Patents> nasaResponse = getNasaResponse(nasaPatentsUrl, nasaPatentsKey, search, limit);
		nasaResponse.getBody().getResults().forEach(result -> result.getInnovator().forEach(innovator -> {
			String concatenatedName = innovator.getFname() + innovator.getLname();
			concatenatedName = concatenatedName.replaceAll("[^a-zA-Z]", "");
			names.add(StringUtils.deleteWhitespace(concatenatedName));
		}));
		return names;
	}

	private static ResponseEntity<Patents> getNasaResponse(String nasaPatentsUrl, String nasaPatentsKey, String search, Integer limit) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<>(headers);
		ParameterizedTypeReference<Patents> responseType = new ParameterizedTypeReference<Patents>() {
		};

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(nasaPatentsUrl);
		if (StringUtils.isNotEmpty(search)) {
			builder = builder.queryParam("query", search);
		}
		builder = null != limit ? builder.queryParam("limit", limit) : builder.queryParam("limit", 1);
		builder = builder.queryParam("api_key", nasaPatentsKey);
		String url = builder.toUriString();
		return restTemplate.exchange(url, HttpMethod.GET, entity, responseType);
	}
}