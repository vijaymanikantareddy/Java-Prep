package com.nativequery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import com.model.Student;
import com.util.HibernateUtil;

public class NativeQueries {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		NativeQuery<Student> query = session.createNativeQuery("select * from student", Student.class);
		List<Student> list = query.list();
		System.out.println(list);
	}
}
