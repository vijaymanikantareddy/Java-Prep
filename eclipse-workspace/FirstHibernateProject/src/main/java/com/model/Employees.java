package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employees {
	
	@Id
	private int empId;
	private String email;
	private double salary;

	public Employees() {

	}

	public Employees(int empId, String email, double salary) {
		super();
		this.empId = empId;
		this.email = email;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", email=" + email + ", salary=" + salary + "]";
	}

}
