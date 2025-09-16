package com.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Car {
	@EmbeddedId
	private CarId carId;
	private String companyName;
	private double price;

	public Car() {
	}

	public Car(CarId carId, String companyName, double price) {
		super();
		this.carId = carId;
		this.companyName = companyName;
		this.price = price;
	}

	public CarId getCarId() {
		return carId;
	}

	public void setCarId(CarId carId) {
		this.carId = carId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", companyName=" + companyName + ", price=" + price + "]";
	}

}
