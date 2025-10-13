package com.flm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "complaint")
public class Complaint {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "complaint_id")
	private int complaintId;

	private int userId;

	private String category;

	private String subject;

	private String description;

	private String status;

	public Complaint() {

	}

	public Complaint(int complaintId, int userId, String category, String subject, String description, String status) {
		super();
		this.complaintId = complaintId;
		this.userId = userId;
		this.category = category;
		this.subject = subject;
		this.description = description;
		this.status = status;
	}

	public Complaint(int userId, String category, String subject, String description, String status) {
		super();
		this.userId = userId;
		this.category = category;
		this.subject = subject;
		this.description = description;
		this.status = status;
	}

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Complaint [complaintId=" + complaintId + ", userId=" + userId + ", category=" + category + ", subject="
				+ subject + ", description=" + description + ", status=" + status + "]";
	}

}
