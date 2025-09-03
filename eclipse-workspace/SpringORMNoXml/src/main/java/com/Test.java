package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.EmployeeDao;
import com.model.Employee;
import org.hibernate.SessionFactory;


public class Test {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
		EmployeeDao employeeDao = container.getBean("employeeDao", EmployeeDao.class);
		Employee employee = employeeDao.getEmployee(2);
		System.out.println(employee);

		employeeDao.saveEmployee(new Employee("22twentytwo@gmail", 15550));
		System.out.println("Executed Successfully");
	}
}
