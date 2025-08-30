package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employees;

public class Application {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employees.class);

		SessionFactory sessionFactory = cfg.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Employees emp = new Employees(12, "fgh@gmail.com", 29000);

		session.beginTransaction();
		// Insert
		session.persist(emp);

		session.getTransaction().commit();
		System.out.println("Inserted!!!");
	}
}
