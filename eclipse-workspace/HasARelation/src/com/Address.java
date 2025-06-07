package com;

public class Address {
	private String pincode;
	private String streetName;
	private String city;
	private String state;

	public Address() {

	}

	public Address(String pincode, String streetName, String city, String state) {
		super();
		this.pincode = pincode;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
