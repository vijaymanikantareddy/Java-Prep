package com;

public class Test {
	public static void main(String[] args) {
		int a = 10;
		Integer b = new Integer(20);
		System.out.println(a);
		System.out.println(b);

		// Auto Boxing
		Integer c = Integer.valueOf(a);
		System.out.println(c);

		Integer e = a;
		System.out.println(e);

		// Auto Unboxing
		int d = b.intValue();
		System.out.println(d);

		int f = b;
		System.out.println(f);

		String s = "200";
		int num = Integer.parseInt(s);

		System.out.println(s + 2);
		System.out.println(num + 2);

		String numString = String.valueOf(num);
		System.out.println(numString + 3);

	}
}
