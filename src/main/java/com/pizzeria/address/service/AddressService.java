package com.pizzeria.address.service;

import com.pizzeria.address.Address;

public interface AddressService {

	public Address saveOrUpdate(Address address);
	
	public Address findById(Integer id);
	
	
}
