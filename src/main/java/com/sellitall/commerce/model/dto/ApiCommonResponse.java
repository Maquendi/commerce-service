package com.sellitall.commerce.model.dto;

import org.springframework.http.HttpStatus;

public class ApiCommonResponse {
	
	private HttpStatus status;
	
	private ApiContext contex;
	
	private ApiCommonResponse(ResponseBuilder builder) {
		this.status = builder.status;
		this.contex = new ApiContext(builder.payload, builder.exception);
	}
	
	
	public static class ResponseBuilder{
		
		private HttpStatus status;
		
		private boolean hasError = false;
		
		private long duration;
		
		private Object payload;
		
		private ApiException exception;
		
		
		public ResponseBuilder status(HttpStatus status) {
			this.status = status;
			return this;
		}
		
		public ResponseBuilder payload(Object payload) {
			this.payload = payload;
			return this;
		}
		
		public ResponseBuilder duration(long duration) {
			this.duration = duration;
			return this;
		}
		
		public ResponseBuilder exception(Exception exception) {
			this.exception = new ApiException(exception.getClass().getSimpleName(), exception.getMessage(), exception.getCause().toString());
			return this;
		}


		public ApiCommonResponse build() {
			// TODO Auto-generated method stub
			return new ApiCommonResponse(this);
		}
		
		
	}
	
}
