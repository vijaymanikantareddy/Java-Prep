package com.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Passport;
import com.model.User;
import com.util.HibernateUtil;

public class OneToOneMapping {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

//		insert(session);

//		select(session);

//		delete(session);

//		Passport passport = session.find(Passport.class, 1024);
//		System.out.println(passport);
//		System.out.println(passport.getUser().getName());
	}

	private static void delete(Session session) {
		session.beginTransaction();
		session.remove(new User(4, "", new Passport(1000, "")));
		session.getTransaction().commit();
	}

	private static void select(Session session) {
		User user = session.find(User.class, 6);
		System.out.println(user);
	}

	private static void insert(Session session) {
		Passport passport = new Passport(1025, "Chennai");
		User user = new User("Vijay");
		user.setPassport(passport);
		passport.setUser(user);
		session.beginTransaction();
		session.persist(user);
		session.getTransaction().commit();
	}
}
