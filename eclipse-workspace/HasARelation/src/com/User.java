package com;

public class User {
	private String id;
	private String name;
	private String pasword;
	private Address address;

	public User() {

	}

	public User(String id, String name, String pasword, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.pasword = pasword;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
