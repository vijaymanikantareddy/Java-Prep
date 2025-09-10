package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;

	private String email;

	@Column(name = "salary")
	private int sal;

	public Employee(String email, int sal) {
		super();
		this.email = email;
		this.sal = sal;
	}

	public Employee() {

	}

	public Employee(int empId, String email, int salary) {
		super();
		this.empId = empId;
		this.email = email;
		this.sal = salary;
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
		return sal;
	}

	public void setSalary(int salary) {
		this.sal = salary;
	}

	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", email=" + email + ", salary=" + sal + "]";
	}

}
