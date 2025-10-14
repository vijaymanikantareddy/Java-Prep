package com.flm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.flm.model.Complaint;
import com.flm.util.HibernateUtil;

public class ComplaintDao {
	public List<Complaint> getComplaintsByUser(int residentId) {
		try (Session session = HibernateUtil.getConnection().openSession()) {
			List<Complaint> list = session.createQuery("From Complaint Where userId=:residentId")
					.setParameter("residentId", residentId).list();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void saveComplaint(Complaint complaint) {
		Transaction ts = null;
		try (Session session = HibernateUtil.getConnection().openSession()) {

			ts = session.beginTransaction();
			session.persist(complaint);

			ts.commit();
		} catch (Exception e) {
			if (ts.isActive() && ts != null) {
				ts.rollback();
			}
			e.printStackTrace();
		}
	}
}
