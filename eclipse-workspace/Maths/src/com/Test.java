package com;

import java.util.Random;

public class Test {
	public static void main(String... args) {
		System.out.println(Math.abs(-10));
		System.out.println(Math.max(10, 11));
		System.out.println(Math.min(131, 21));
		System.out.println(Math.round(24242.23232));
		System.out.println(Math.ceil(5.1));
		System.out.println(Math.floor(5.99));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.cbrt(125));
		System.out.println(Math.tan(Math.PI / 4));
		System.out.println(Math.random()); // 0 to 1
		System.out.println((int) (Math.random() * 100));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		Random rand = new Random();
		System.out.println(rand.nextInt(10, 15));
	}
}
