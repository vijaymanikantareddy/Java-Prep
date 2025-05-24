package com;

public class Son extends Father {
	public int t = 10;
	Son(int a){
		this.t = a;
//		this();
		System.out.println("Para Son Constructor" + this.t);
	}
	Son(){
		this(5);
		System.out.println("Son Constructor");
	}
	
	public void m2() {
		this.t = 14;
		System.out.println("Son Class");
		sme();
	}
	public static void sme() {
		Son s = new Son();
		s.t = 12;
		System.out.println("static method "+ s.t);
	}
}
