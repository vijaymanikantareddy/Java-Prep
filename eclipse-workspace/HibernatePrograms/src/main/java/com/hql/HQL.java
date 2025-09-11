package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.SelectionQuery;

import com.model.Student;
import com.util.HibernateUtil;

public class HQL {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

//		select(session);
//		selectWithWhere(session);
//		insertQuery(session);
//		updateQuery(session);
//		deleteQuery(session);
	}

	private static void deleteQuery(Session session) {
		session.beginTransaction();
		MutationQuery query = session.createMutationQuery("Delete from Student where studentId=?1");
		query.setParameter(1, 4);
		query.executeUpdate();
		session.getTransaction().commit();
	}

	private static void updateQuery(Session session) {
		session.beginTransaction();
		MutationQuery query = session.createMutationQuery("Update Student set name=?1 where studentId=?2");
		query.setParameter(1, "Ramudu");
		query.setParameter(2, 4);
		query.executeUpdate();
		session.getTransaction().commit();
	}

	private static void insertQuery(Session session) {
		session.beginTransaction();
		MutationQuery query = session.createMutationQuery("Insert into Student(name, marks) values(?1, ?2)");
		query.setParameter(1, "Ram");
		query.setParameter(2, 99);
		query.executeUpdate();
		session.getTransaction().commit();
	}

	private static void selectWithWhere(Session session) {
		SelectionQuery<Student> query = session.createSelectionQuery("From Student where studentId=?1 and name=?2",
				Student.class);
		query.setParameter(1, 2);
		query.setParameter(2, "Ajay");
		System.out.println(query.list());
	}

	private static void select(Session session) {
		SelectionQuery<Student> query = session.createSelectionQuery("from Student", Student.class);
		List<Student> list = query.list();
		System.out.println(list);
	}
}
