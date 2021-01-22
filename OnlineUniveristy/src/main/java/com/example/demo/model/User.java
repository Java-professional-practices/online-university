package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mytable")



public class User {
	@Id
	private int id;
	private String firstname;
	private String lastname;
	private String username;
	private int age;
	private String password;
	private String email;
	private String address;
	private String phoneno;
	public User() {}
	
	public User(int id,String firstname, String lastname, String username, int age, String password,String email,String address,String phoneno) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.age = age;
		this.password = password;
		this.email=email;
		this.address=address;
		this.phoneno=phoneno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getPhoneno()
	{
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno=phoneno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}