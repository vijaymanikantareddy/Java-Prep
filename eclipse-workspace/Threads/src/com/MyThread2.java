package com;

public class MyThread2 extends Thread {
	
	@Override
	public void run() {
		Thread.currentThread().setName("My Thread 2");
		String name = Thread.currentThread().getName();
//		System.out.println(name);
		System.out.println("----" + name);
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("Thread 2");
		}
	}
}
