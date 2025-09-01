package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
		Student student = container.getBean("student", Student.class);
		System.out.println(student);
		System.out.println(student.getAddr());
		
		SimTest simTest = container.getBean("simTest", SimTest.class);
		simTest.callSim();
	}
}
