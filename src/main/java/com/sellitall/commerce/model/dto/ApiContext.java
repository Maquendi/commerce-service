package com.sellitall.commerce.model.dto;

public class ApiContext {
 
	private boolean hasError;
	
	private long duration;
	
	private Object payload;
	
	private ApiException exception;
	
	public ApiContext(Object payload, ApiException exception) {
		this.payload = payload;
		this.exception = exception;
	}
}
