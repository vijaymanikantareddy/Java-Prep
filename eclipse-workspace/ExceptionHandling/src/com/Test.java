package com;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc;
		try {
			System.out.println("Enter Age: ");
			sc = new Scanner(System.in);
			int age = sc.nextInt();
			if (age > 18) {
				System.out.println("You can vote");
			} else {
				throw new InvalidAgeException("NOT Eligible to Vote");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
