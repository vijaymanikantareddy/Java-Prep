package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Car;
import com.model.Order;
import com.model.Passport;
import com.model.Person;
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
			cfg.addAnnotatedClass(Person.class);
			cfg.addAnnotatedClass(Order.class);
			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}
}
