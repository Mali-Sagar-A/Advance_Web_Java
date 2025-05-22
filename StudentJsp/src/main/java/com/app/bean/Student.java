package com.app.bean;

import java.io.Serializable;

public class Student implements Serializable{
	
	private String firastName;
	private String lastName;
	private String email;
	
	public Student() {}

	public String getFirastName() {
		return firastName;
	}

	public void setFirastName(String firastName) {
		this.firastName = firastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}

