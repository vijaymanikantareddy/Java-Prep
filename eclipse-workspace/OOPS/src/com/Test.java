package com;

public class Test {
	public static void main(String[] args) {
		Bike myBike = new Bike();
		myBike.color = "Red";
		myBike.gear = 0;
		myBike.speed = 0;
		myBike.petrolCapacity = 12.0;
		
		System.out.println(myBike.color);
		System.out.println(myBike.gear);
		
		myBike.increaseGear();
		System.out.println(myBike.gear);
		
		System.out.println(myBike.speed);


		System.out.println(myBike.speed);
		
		System.out.println(myBike.petrolCapacity);
	}
}
