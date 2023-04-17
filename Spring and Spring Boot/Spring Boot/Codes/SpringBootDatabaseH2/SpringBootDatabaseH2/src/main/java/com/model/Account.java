package com.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SuppressWarnings("serial")
@EntityScan
public class Account implements Serializable{
	
	@Id
	@GeneratedValue
	Long id;
	String fname, lname, email;

	public Account() {
		
	}
	
	public Account(String fname, String lname, String email) {
		super();		
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + "]";
	}

}
