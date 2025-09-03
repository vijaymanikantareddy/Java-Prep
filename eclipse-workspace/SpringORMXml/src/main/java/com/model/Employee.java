package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", email=" + email + ", salary=" + salary + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String email;
	private int salary;

	public Employee() {

	}

	public Employee(String email, int salary) {
		super();
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
