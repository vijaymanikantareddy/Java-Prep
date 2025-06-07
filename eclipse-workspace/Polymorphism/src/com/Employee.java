package com;

// public > protected > default > private
// Access modifier with more access

public class Employee {
	public void m1() {
		System.out.println("This is M1");
	}

	protected void m2() {
		System.out.println("This is M2");
	}

	private void m3() {
		System.out.println("This is M3");
	}

	void m4() {
		System.out.println("This is M4");
	}
}
