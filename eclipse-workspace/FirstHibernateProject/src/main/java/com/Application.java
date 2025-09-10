package com;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import com.model.Employee;
import com.util.HibernateUtil;

public class Application {
	public static void main(String[] args) {

//		getData(2);
		insertData();
//		updateData();
//		deleteData();
	}

	private static void insertData() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Employee emp = new Employee("ins@gmail.com", 988);

		session.beginTransaction();
		// Insert
		session.persist(emp);

		session.getTransaction().commit();
		System.out.println("Inserted!!!");
	}

	public static void getData(int id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Employee employee = session.find(Employee.class, id);
		System.out.println(employee);
	}

	public static void updateData() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		Employee emp = session.find(Employee.class, 2);
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

		Employee emp = session.find(Employee.class, 120);
		session.beginTransaction();

		session.remove(emp);

		session.getTransaction().commit();
		System.out.println("Deleted!!!");

	}
}
