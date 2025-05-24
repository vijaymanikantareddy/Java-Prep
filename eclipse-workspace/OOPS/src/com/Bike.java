package com;

public class Bike {
	// Fields
	String color;
	int gear;	
	int speed;	
	double petrolCapacity;
	
	// Methods
	void increaseGear() {
		gear++;
	}
	
	void accelarate() {
		speed += 20;
	}
	
	void applyBrake() {
		gear--;
		speed -= 10;
	}
}
