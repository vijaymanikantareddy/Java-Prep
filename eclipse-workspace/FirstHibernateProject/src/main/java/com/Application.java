package com;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import com.model.Employees;
import com.util.HibernateUtil;

public class Application {
	public static void main(String[] args) {

//		getData(2);
//		insertData();
//		updateData();
		deleteData();
	}

	private static void insertData() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Employees emp = new Employees(120, "afafakdfajfajdfldsf@gmail.com", 999000);

		session.beginTransaction();
		// Insert
		session.persist(emp);

		session.getTransaction().commit();
		System.out.println("Inserted!!!");
	}

	public static void getData(int id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Employees employees = session.find(Employees.class, id);
		System.out.println(employees);
	}

	public static void updateData() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		Employees emp = session.find(Employees.class, 2);
		emp.setEmpId(2);
		emp.setSalary(24999);
		session.beginTransaction();

		session.merge(emp);

		session.getTransaction().commit();
		System.out.println("Updated!!!");
	}

	public static void deleteData() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		Employees emp = session.find(Employees.class, 120);
		session.beginTransaction();

		session.remove(emp);

		session.getTransaction().commit();
		System.out.println("Deleted!!!");

	}
}
