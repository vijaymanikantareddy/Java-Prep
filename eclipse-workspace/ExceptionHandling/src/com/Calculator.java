package com;

import java.util.Scanner;

// unchecked exception
// run time exception

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter number 1: ");
			int number1 = sc.nextInt();

			System.out.println("Enter number 2: ");
			int number2 = sc.nextInt();

			System.out.println(number1 / number2);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		System.out.println("Byee");

		sc.close();
	}
}
