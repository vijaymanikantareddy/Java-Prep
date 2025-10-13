package com.flm.dao;

import org.hibernate.Session;

import com.flm.model.Resident;
import com.flm.util.HibernateUtil;

public class ResidentDao {
	public boolean isValid(String username, String password) {

		try (Session session = HibernateUtil.getConnection().openSession()) {
			Resident resident = session
					.createQuery("From Resident where username=:username and password=:password", Resident.class)
					.setParameter("username", username).setParameter("password", password).uniqueResult();

			if (resident != null) {
				return true;
			}

			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
}
