package com.sellitall.commerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sellitall.commerce.model.dto.ApiCommonResponse;
import com.sellitall.commerce.model.dto.CommerceDto;
import com.sellitall.commerce.service.CommerceService;

@RestController
@RequestMapping("/commerce")
public class CommerceController {

	private CommerceService commerceService;
	
	
	public CommerceController(CommerceService commerceService) {
		this.commerceService = commerceService;
	}
	
	
	
	@GetMapping("/{commerceId}")
	public ResponseEntity<ApiCommonResponse> getCommerce(@PathVariable("commerceId") String commerceId) {
		
		return null;
	}
	
	@GetMapping(params = { "page", "size" })
	public ResponseEntity<ApiCommonResponse> getCommerceAll(@RequestParam("page") int page, 
			  @RequestParam("size") int size) {
		
		
		
		ApiCommonResponse apiCommonResponse = new ApiCommonResponse.ResponseBuilder()
		       .status(HttpStatus.OK)
		       .duration(0)
		       .payload()
		       .build();
		return ResponseEntity.ok(apiCommonResponse);
	}
	
	
	@PostMapping
	public ResponseEntity<ApiCommonResponse> createCommerce(@RequestBody CommerceDto comerceDto) {
		
		return null;
	}
	
	
	
}
