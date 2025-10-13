package com.flm.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.flm.model.Resident;
import com.flm.util.HibernateUtil;

public class ResidentDao {

	public Resident isValid(String username, String password) {

		try (Session session = HibernateUtil.getConnection().openSession()) {
			Resident resident = session
					.createQuery("From Resident where username=:username and password=:password", Resident.class)
					.setParameter("username", username).setParameter("password", password).uniqueResult();

			return resident;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public void saveResident(Resident resident) {
		Transaction ts = null;
		try (Session session = HibernateUtil.getConnection().openSession()) {

			ts = session.beginTransaction();
			session.persist(resident);

			ts.commit();
		} catch (Exception e) {
			if (ts.isActive() && ts != null) {
				ts.rollback();
			}
			e.printStackTrace();
		}
	}
}
