package com.pizzeria.address.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.pizzeria.address.Address;

public class AddressServiceImpl implements AddressService{
	@PersistenceContext
	EntityManager em;
	Log log = LogFactory.getLog(AddressServiceImpl.class);
	public Address saveOrUpdate(Address address) {
		// TODO Auto-generated method stub
		if(address.getAddress_id() == null){
			log.info("Inserting address");
			em.persist(address);
		}
		else{
			log.info("Updating address");
			em.merge(address);
		}
		log.info("Address saved with id"+address.getAddress_id());
		return address;
	}

	public Address findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
