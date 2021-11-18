package com.sellitall.commerce.model.entities;

import com.sellitall.commerce.model.constants.PhoneTypes;

public class PhoneNumber {

	private String phoneNumber;
	
    private PhoneTypes phoneType;
    
    private boolean makePublic; //if the public can contact this number of just for admin use.
}
