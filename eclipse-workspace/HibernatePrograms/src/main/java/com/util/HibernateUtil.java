package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Car;
import com.model.Passport;
import com.model.Student;
import com.model.User;

public class HibernateUtil {
	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Student.class);
			cfg.addAnnotatedClass(Car.class);
			cfg.addAnnotatedClass(User.class);
			cfg.addAnnotatedClass(Passport.class);

			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}
}
