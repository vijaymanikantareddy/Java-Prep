package com.model;

public class CarId {
	private int id;
	private String engineNumber;

	public CarId(int id, String engineNumber) {
		super();
		this.id = id;
		this.engineNumber = engineNumber;
	}

	public CarId() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	@Override
	public String toString() {
		return "CarId [id=" + id + ", engineNumber=" + engineNumber + "]";
	}
}
