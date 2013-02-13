package com.pizzeria.customer.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pizzeria.customer.Customer;
@Service("jpaCustomerService")
@Repository
@Transactional
public class CustomerServiceImpl implements CustomerService{
	private Log log = LogFactory.getLog(CustomerServiceImpl.class);
	
	@PersistenceContext
	private EntityManager em;
	@Transactional(readOnly=true)
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional(readOnly=true)
	public Customer findById(Integer id) {
		// TODO Auto-generated method stub
		/*
		TypedQuery<Customer> query = em.createNamedQuery("Customer.findById",Customer.class);
		query.setParameter("id", id);
		return query.getSingleResult();
		*/
		log.info("Searching customer by id");
		Customer customer = em.find(Customer.class, id);
		return customer;
	}
	@Transactional
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public Customer saveOrUpdate(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
