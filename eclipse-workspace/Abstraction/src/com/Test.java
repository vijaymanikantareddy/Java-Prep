package com;

public class Test {
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.sound();
		lion.sleeping();
		
		Animal a = new Lion();
		a.sound();
		
		Animal.fun();
	}
}
