package com;

public class Test {
	public static void main(String[] args) {

		String name = Thread.currentThread().getName();
		System.out.println(name);

		MyThread1 myThread1 = new MyThread1();
		myThread1.start();
		

		Test.sayHi();
		
		MyThread2 myThread2 = new MyThread2();
		myThread2.start();
//		myThread1.run();
		

	}

	static void sayHi() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hiii");
		}
	}
}