package com.sellitall.commerce.service;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.sellitall.commerce.model.dto.CommerceDto;
import com.sellitall.commerce.model.entities.Commerce;
import com.sellitall.commerce.model.entities.CommerceRegistration;

@Service
public class CommerceServiceImpl implements CommerceService {

	@Override
	public CommerceRegistration createCommerce(CommerceDto commerceDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Commerce> getCommerce(int start, int end, String sortBy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Commerce getCommerce(UUID commerceId) {
		// TODO Auto-generated method stub
		return null;
	}

}
