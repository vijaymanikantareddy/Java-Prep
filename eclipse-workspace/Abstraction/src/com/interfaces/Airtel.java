package com.interfaces;

public class Airtel implements Trai {

	@Override
	public void calling() {
		System.out.println("Call at 1ps/1sec");
	}

	@Override
	public void data() {
		System.out.println("2G Internet");
	}

	@Override
	public void messaging() {
		System.out.println("100 sms");

	}

	@Override
	public void recharge() {
		System.out.println("1GB at 100Rs");
	}

}
