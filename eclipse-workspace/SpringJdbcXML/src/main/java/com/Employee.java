package com;

public class Employee {
	private int empId;
	private String email;
	private int salary;

	public Employee() {

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

	public Employee(int empId, String email, int salary) {
		super();
		this.empId = empId;
		this.email = email;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", email=" + email + ", salary=" + salary + "]";
	}

}
