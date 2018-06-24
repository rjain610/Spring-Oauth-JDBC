package com.rahul.oauth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "email")
	private String email;
	@Column(name = "name")
	private String name;
	@Column(name = "password")
	private String password;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "active")
	private int active;
	
	
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Users(Users user) {
		this.active = user.active;
		this.email = user.email;
		this.id = user.id;
		this.lastName = user.lastName;
		this.name = user.name;
		this.password = user.password;
	
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getActive() {
		return active;
	}


	public void setActive(int active) {
		this.active = active;
	}



	
	
}
