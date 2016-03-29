package com.fndong.user;
// Generated Mar 11, 2016 2:47:24 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class User implements java.io.Serializable {
	private Integer userId;
	private String password;
	private String name;
	private String email;

	public User() {
	}

	public User(String password, String name, String email) {
		this.password = password;
		this.name = name;
		this.email = email;
	}


	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
