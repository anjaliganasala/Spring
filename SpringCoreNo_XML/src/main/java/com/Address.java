package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Value("${id}")
	private int addrId; 
	
	@Value("${street}")
	private String street;
	
	public Address() {
		
	}
    
	public Address(int addrId, String street) {
		super();
		this.addrId = addrId;
		this.street = street;
	}

	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", street=" + street + "]";
	}
	
	
	
}
