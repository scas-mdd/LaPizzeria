package com.pizzeria.customer;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Email;
@Entity
@Table(name="Customer")
@NamedQueries({
	@NamedQuery(name="Customer.findById",query="select c from Customer where c.id = :id")})
public class Customer implements Serializable{
	public Customer(){}
	@Id
	@GeneratedValue
	@Column(name="customer_id")
	private Integer customerId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	@Email
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="address_id")
	private Integer address_id;
	
	@Column(name="last_login")
	private Date last_login;

	/**
	 * @return the customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

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
	 * @return the last_login
	 */
	@Temporal(TemporalType.TIMESTAMP)
	public Date getLast_login() {
		return last_login;
	}

	/**
	 * @param last_login the last_login to set
	 */
	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}
	
}
