package com;

public class FuelCar implements Vehicle, Car {

	@Override
	public void carName() {
		System.out.println("This is my Car Name");
	}

	@Override
	public void start() {
		System.out.println("Vehicle is Started");
	}

}
