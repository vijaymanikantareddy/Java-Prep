package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Context Loaded");

		studentDetails(container);
		
		employeeDetails(container);

	}

	private static void employeeDetails(ApplicationContext container) {
		Employee emp = container.getBean("emp", Employee.class);
		System.out.println(emp.getHobbies());
	}

	private static void studentDetails(ApplicationContext container) {
		Student student = container.getBean("st", Student.class);
		System.out.println(student);
		
//		Student student2 = container.getBean("st2", Student.class);
//		System.out.println(student2);
//		System.out.println(student == student2);
	}
}
