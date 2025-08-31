package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Context Loaded");

		Student student = ctx.getBean("st", Student.class);
		System.out.println(student);
		
		Student student2 = ctx.getBean("st2", Student.class);
		System.out.println(student2);
		System.out.println(student == student2);

	}
}
