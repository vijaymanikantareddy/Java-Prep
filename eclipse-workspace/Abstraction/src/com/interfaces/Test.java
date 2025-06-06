package com.interfaces;

public class Test {
	public static void main(String[] args) {
		Airtel airtel = new Airtel();
		airtel.calling();
		airtel.messaging();
		airtel.data();
		airtel.recharge();

		Jio jio = new Jio();
		jio.calling();
		jio.messaging();
		jio.data();
		jio.recharge();
	}
}
