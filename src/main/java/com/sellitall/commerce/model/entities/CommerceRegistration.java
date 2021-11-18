package com.sellitall.commerce.model.entities;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import com.sellitall.commerce.model.constants.CommerceStatuses;

public class CommerceRegistration {
	
	private String emailAddress;
	
	private String shortName;
	
	private String longName;
	
	private String rnc; // ?
	
	private Long commerceId;
	
	private CommerceStatuses status = CommerceStatuses.PENDING;
	
	private Address commerceAddress;
	
	private LocalDateTime registrationDate;
	
	private Set<Contact> contactList = new HashSet<>();
}
