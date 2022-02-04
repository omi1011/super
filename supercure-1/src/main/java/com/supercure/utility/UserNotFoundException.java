package com.supercure.utility;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RestControllerAdvice
public class UserNotFoundException extends RuntimeException {

	private String msg;
	public UserNotFoundException(String msg) {
		super();
		this.msg = msg;
	}
	
	
	
	
	
}
