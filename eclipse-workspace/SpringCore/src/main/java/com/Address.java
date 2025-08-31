package com;

public class Address {
	private int addrId;
	private String street;

	public Address() {

	}

	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", street=" + street + "]";
	}

	public Address(int addrId, String street) {
		super();
		this.addrId = addrId;
		this.street = street;
	}

	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
}
