package com.pizzeria.customer.service;

import java.util.List;

import com.pizzeria.customer.*;
public interface CustomerService {
	
	public List<Customer> findAll();
	
	public Customer findById(Integer id);
	
	public void delete(Customer customer);
	
	public Customer saveOrUpdate(Customer customer);
}
