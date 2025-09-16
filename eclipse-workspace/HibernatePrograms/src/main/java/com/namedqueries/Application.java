package com.namedqueries;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.model.Student;
import com.util.HibernateUtil;

public class Application {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		Query<Student> query = session.createNamedQuery("allstudents", Student.class);
		List<Student> list = query.list();
		System.out.println(list);
	}
}
