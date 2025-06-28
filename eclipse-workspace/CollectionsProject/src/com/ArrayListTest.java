package com;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList li = new ArrayList();
		li.add('a');
		li.add(120);
		li.add(true);
		li.add("hii");
		li.add(new Employee("Vijay", 1234));
		
		li.add(1, 987);
		li.set(1,  "Hello");
		li.remove(1);
		System.out.println(li);
		System.out.println(li.size());
		System.out.println(li.get(3));
		System.out.println(li.isEmpty());
		System.out.println(li.indexOf(120));
		System.out.println(li.contains(987));
		
		
		ArrayList<Integer> ar = new ArrayList<>();
	}
}

class Employee {
	String name;
	int empid;

	public Employee() {
		super();
	}

	public Employee(String name, int empid) {
		super();
		this.name = name;
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + "]";
	}

}