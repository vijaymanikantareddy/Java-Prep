package com;

public abstract class Animal {
	Animal(){
		System.out.println("This is Animal");
	}
	public abstract void sound();

	public void sleeping() { 
		System.out.println("Sleeping....");
	}
	
	public static void fun() {
		System.out.println("Fun method");
	}
}
