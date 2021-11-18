package com.sellitall.commerce.service;

import java.util.UUID;

import org.springframework.data.domain.Page;

import com.sellitall.commerce.model.dto.CommerceDto;
import com.sellitall.commerce.model.entities.Commerce;
import com.sellitall.commerce.model.entities.CommerceRegistration;

public interface CommerceService {

	CommerceRegistration createCommerce(CommerceDto commerceDto);
	
	Page<Commerce> getCommerce(int start, int end, String sortBy);
	
	Commerce getCommerce(UUID commerceId);
}
