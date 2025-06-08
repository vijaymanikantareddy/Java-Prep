package com;

import java.util.Arrays;

public class Company {
	String name;
	Employee[] employees;

	public Company() {

	}

	public Company(String name, Employee[] employees) {
		super();
		this.name = name;
		this.employees = employees;
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "ABC", 100);
		Employee emp2 = new Employee(2, "CDE", 123);
		Employee emp3 = new Employee(3, "PQR", 200);

		Employee[] emps = new Employee[3];
		emps[0] = emp1;
		emps[1] = emp2;
		emps[2] = emp3;

		Company company = new Company();
		company.name = "Meta";
		company.employees = emps;

		System.out.println(company);

		Company company2 = new Company("Google", emps);

		System.out.println(company2);
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", employees=" + Arrays.toString(employees) + "]";
	}

}
