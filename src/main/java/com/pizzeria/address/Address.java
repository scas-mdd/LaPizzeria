package com.pizzeria.address;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name="Address")
public class Address {
	
	@Id
	@GeneratedValue
	@Column(name="address_id")
	private Integer address_id;
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="postal_code")
	private Integer postal_code;
	
	@Column(name="phone")
	private Integer phone;
	
	@Column(name="last_update")
	private Date last_update;

	/**
	 * @return the address_id
	 */
	public Integer getAddress_id() {
		return address_id;
	}

	/**
	 * @param address_id the address_id to set
	 */
	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the postal_code
	 */
	public Integer getPostal_code() {
		return postal_code;
	}

	/**
	 * @param postal_code the postal_code to set
	 */
	public void setPostal_code(Integer postal_code) {
		this.postal_code = postal_code;
	}

	/**
	 * @return the phone
	 */
	public Integer getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	/**
	 * @return the last_update
	 */
	public Date getLast_update() {
		return last_update;
	}

	/**
	 * @param last_update the last_update to set
	 */
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	
	
}
