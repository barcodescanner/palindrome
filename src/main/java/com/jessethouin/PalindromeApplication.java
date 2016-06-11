package com.jessethouin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class PalindromeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PalindromeApplication.class, args);
	}

	@Bean
	public Docket swaggerSpringMvcPlugin() {
		ApiInfo apiInfo = new ApiInfoBuilder()
				.title("NASA Patent Holder Palindrome Generator")
				.description("Create palindromes based on names of NASA patent holders")
				.contact("jesse@jessethouin.com ")
				.version("Version 1.0")
				.license("© 2016 Jesse Thouin")
				.licenseUrl("http://thouin.ddns.net/license")
				.termsOfServiceUrl("http://thouin.ddns.net/tos")
				.build();

		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo)
				.enable(true)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
	}

}
