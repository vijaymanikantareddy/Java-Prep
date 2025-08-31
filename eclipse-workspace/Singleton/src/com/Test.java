package com;

public class Test {
	public static void main(String[] args) {
//		Employee emp1 = new Employee();
//		Employee emp2 = new Employee();
//		System.out.println(emp1.hashCode());
//		System.out.println(emp2.hashCode());
//		System.out.println(emp1 == emp2);
		
		Employee empl = Employee.getEmployee();
		Employee empl2 = Employee.getEmployee();
		System.out.println(empl.hashCode());
		System.out.println(empl2.hashCode());
		System.out.println(empl == empl2);
	}
}
