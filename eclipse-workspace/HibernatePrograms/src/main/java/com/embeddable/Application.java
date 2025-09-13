package com.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Car;
import com.model.CarId;
import com.util.HibernateUtil;

public class Application {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

//		insertQuery(session);
		Car car = session.find(Car.class, new CarId(1, "1hsdfwerd131"));
		System.out.println(car);
	}

	private static void insertQuery(Session session) {
		session.beginTransaction();
		Car car = new Car(new CarId(1, "1hsdfwerd131"), "Maruti ", 886568);
		session.persist(car);
		session.getTransaction().commit();
	}
}
