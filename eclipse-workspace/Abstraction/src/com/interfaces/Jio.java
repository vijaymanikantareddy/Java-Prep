package com.interfaces;

public class Jio implements Trai {

	@Override
	public void calling() {
		System.out.println("Unlimited Calling");
	}

	@Override
	public void data() {
		System.out.println("4G 1GB/Day");
	}

	@Override
	public void messaging() {
		System.out.println("Unlimited SMS");
	}

	@Override
	public void recharge() {
		System.out.println("150Rs per Month");
	}

}
