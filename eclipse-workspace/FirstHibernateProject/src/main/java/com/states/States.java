package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Employee;
import com.util.HibernateUtil;

public class States {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Employee emp = new Employee(15, "fifteen@gmail.com", 15500); // Transient
		Employee emp2 = new Employee(14, "fourteen@gmail.com", 14000);
		emp2.setSalary(25000);
		
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		session.persist(emp); // Persistent
		
		emp.setSalary(15465); // Dirty Checking
		
		session.getTransaction().commit();
		session.close();
		// Detached
	}
}
