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

	public List<Complaint> getComplaintsByUserAndStatus(int residentId, String status) {
		try (Session session = HibernateUtil.getConnection().openSession()) {
			List<Complaint> list = session.createQuery("From Complaint Where userId=:residentId and status=:status")
					.setParameter("residentId", residentId).setParameter("status", status).list();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Complaint getComplaintById(int complaintId) {

		try (Session session = HibernateUtil.getConnection().openSession()) {
			Complaint complaint = (Complaint) session.createQuery("From Complaint where complaintId=:complaintId")
					.setParameter("complaintId", complaintId).uniqueResult();
			return complaint;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void updateComplaint(Complaint complaint) {
		Transaction ts = null;
		try (Session session = HibernateUtil.getConnection().openSession()) {

			ts = session.beginTransaction();
			session.merge(complaint);

			ts.commit();
		} catch (Exception e) {
			if (ts.isActive() && ts != null) {
				ts.rollback();
			}
			e.printStackTrace();
		}
	}
}
