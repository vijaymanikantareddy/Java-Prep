package com.namedqueries;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.model.Student;
import com.util.HibernateUtil;

public class Application {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		select(session);
		update(session);
	}

	private static void update(Session session) {

		session.beginTransaction();
		MutationQuery query2 = session.createNamedMutationQuery("updatestudent");
		query2.setParameter("name", "Siva");
		query2.setParameter("studentId", 3);
		query2.executeUpdate();
		session.getTransaction().commit();
	}

	private static void select(Session session) {
		Query<Student> query = session.createNamedQuery("allstudents", Student.class);
		List<Student> list = query.list();
		System.out.println(list);
	}
}
