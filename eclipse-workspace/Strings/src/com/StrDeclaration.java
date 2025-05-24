package com;

public class StrDeclaration {
	public static void main(String[] args) {
		String a = "Hello";
		String b = new String("Hello");
		String c = new String(a);
		String d = c;
//		System.out.println(a == b);
//		System.out.println(b == c);
//		System.out.println(a == c);
//		System.out.println(a == d);
//		System.out.println(a.equals(b));
		String s1 = "FLM";
		String s2 = "FLM";
		System.out.println(s1 == s2);
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
	}
}
