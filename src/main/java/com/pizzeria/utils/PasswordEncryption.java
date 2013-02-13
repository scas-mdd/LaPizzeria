package com.pizzeria.utils;

public class PasswordEncryption {
	/**
	 * Constructor
	 */
	public PasswordEncryption(){
	}
	/**
	 * Encrypt string
	 * @param plain password
	 * @return encrypted password
	 */
	public String encryptPassword(String plain){
		return BCrypt.hashpw(plain, BCrypt.gensalt(12));
	}
	/**
	 * 
	 * @param plain
	 * @return true if the password matches
	 */
	public boolean verifyPassword(String plain){
		String hashed = encryptPassword(plain);
		return BCrypt.checkpw(plain, hashed);
	}
}
