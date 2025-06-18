package com;

public class MyThread1 extends Thread {
	
	@Override
	public void run() {
		Thread.currentThread().setName("My Thread 1");
		String name = Thread.currentThread().getName();
		System.out.println(name);
		System.out.println("----" + name);
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("Thread 1");
		}
	}
}
