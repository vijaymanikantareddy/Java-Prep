package com.flm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "resident")
public class Resident {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int residentId;

	private String username;

	private String password;

	private String email;

	private String phone;

	private String role;

	public Resident() {

	}

	public Resident(int residentId, String username, String password, String email, String phone, String role) {
		super();
		this.residentId = residentId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.role = role;
	}

	public Resident(String username, String password, String email, String phone, String role) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.role = role;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Resident [residentId=" + residentId + ", username=" + username + ", password=" + password + ", email="
				+ email + ", phone=" + phone + ", role=" + role + "]";
	}
}
