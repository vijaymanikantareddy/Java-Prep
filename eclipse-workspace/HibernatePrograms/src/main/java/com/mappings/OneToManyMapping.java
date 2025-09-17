package com.mappings;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Order;
import com.model.Person;
import com.util.HibernateUtil;

public class OneToManyMapping {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

//		insert(session);

//		select(session);

//		update(session);
	}

	private static void update(Session session) {
		session.beginTransaction();

		Person person = session.find(Person.class, 1);
		person.setName("Venkat");
		List<Order> orders = person.getOrders();
		Order order = orders.get(0);
		order.setProductName("Realme Mobile");
		session.merge(person);
		session.getTransaction().commit();
	}

	private static void select(Session session) {
		Person person = session.find(Person.class, 1);
		System.out.println(person);
		System.out.println(person.getOrders());
	}

	private static void insert(Session session) {
		Person person = new Person("Vijay", "9876543210");
		Order order1 = new Order("Redmi Mobile", 1);
		Order order2 = new Order("Iqoo Mobile", 3);

		order1.setPerson(person);
		order2.setPerson(person);

		List<Order> orders = new ArrayList<Order>();
		orders.add(order1);
		orders.add(order2);

		person.setOrders(orders);

		session.beginTransaction();
		session.persist(person);
		session.getTransaction().commit();
	}

}
