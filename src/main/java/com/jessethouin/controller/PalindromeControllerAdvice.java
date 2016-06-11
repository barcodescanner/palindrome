package com.jessethouin.controller;

import com.fasterxml.jackson.databind.JsonMappingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by jesse on June 11, 2016.
 *
 */
@ControllerAdvice
@EnableSwagger2
public class PalindromeControllerAdvice {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@ExceptionHandler
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<String> onUnhandledException(Exception e) {
		String msg = "An uncaught exception occurred during the palindrome process. " + e.getMessage();
		logger.error(msg, e);
		return new ResponseEntity<>(msg, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<String> onUnhandledException(HttpMessageNotReadableException e) {
		String msg = "The consistency of NASA's API leaves a lot to be desired. " +
				"You're probably seeing this message because the Publications " +
				"represented in the JSON response can have empty arrays inside " +
				"of empty arrays, which should not be returned at all.\r\r" + e.getMessage();
		logger.error(msg, e);
		return new ResponseEntity<>(msg, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<String> onUnhandledException(JsonMappingException e) {
		String msg = "The consistency of NASA's API leaves a lot to be desired. " +
				"You're probably seeing this message because the Publications " +
				"represented in the JSON response can have empty arrays inside " +
				"of empty arrays, which should not be returned at all.\r\r" + e.getMessage();
		logger.error(msg, e);
		return new ResponseEntity<>(msg, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
