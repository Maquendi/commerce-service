package com.sellitall.commerce.model.dto;

public class ApiException {
 
	private String errorType;
	
	private String message;
	
	private String errorCause;
	
	public ApiException(String errorType, String msg, String cause) {
		this.errorType = errorType;
		this.message = msg;
		this.errorCause = cause;
	}
}
