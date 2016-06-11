package com.jessethouin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
}
