package com.sellitall.commerce.model.entities;

import java.util.UUID;

import com.sellitall.commerce.model.constants.CommerceStatuses;

public class Commerce {
	
	private String shortName;
	
	private String longName;
	
	private String BusinessLine; // a brief description of what business is about.
	
	private String rnc; // ?
	
	private UUID commerceId;
	
	private CommerceStatuses status;
	
	private Address commerceAddress;
}
