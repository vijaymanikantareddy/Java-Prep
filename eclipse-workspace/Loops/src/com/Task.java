package com;
import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		
		// FRONTLINES
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		for(int i = 0 ; i < input.length() ; i++) {
			System.out.println(input.charAt(i));
		}
	
	}
}
