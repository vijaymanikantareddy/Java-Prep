package com.nativequery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.NativeQuery;

import com.model.Student;
import com.util.HibernateUtil;

public class NativeQueries {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

//		select(session);
//		insertQuery(session);
	}

	private static void insertQuery(Session session) {
		session.beginTransaction();
		MutationQuery query = session.createNativeMutationQuery("insert into student(name, marks) values(?1, ?2)");
		query.setParameter(1, "Kishore");
		query.setParameter(2, 76);
		query.executeUpdate();
		session.getTransaction().commit();
		System.out.println("Inserted Successfully!!!");
	}

	private static void select(Session session) {
		NativeQuery<Student> query = session.createNativeQuery("select * from student", Student.class);
		List<Student> list = query.list();
		System.out.println(list);
	}
}
