package com;

import java.util.Scanner;
public class NumberOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int digits = 0;
		while(num > 0) {
			digits++;
			num /= 10;
		}
		System.out.println("Number of Digits: "+ digits);
		sc.close();
	}
}
