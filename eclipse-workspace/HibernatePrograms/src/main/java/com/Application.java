package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Student;
import com.util.HibernateUtil;

public class Application {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		Student student = new Student("Jay", 89);
		session.beginTransaction();
		session.persist(student);
		
		session.getTransaction().commit();
		session.close();
		System.out.println("Data Inserted!!!");
	}
}
