package com;

public class Test {
	public static void main(String[] args) {

		Professor professor = new Professor();
		professor.setName("YYYY");
		professor.setExperience(10);
		professor.setSubject("Java");

		Department department = new Department();
		department.setName("CSE");
		department.setCountOfStudents(200);
		department.setProfessor(professor);

		Department department2 = new Department();
		department2.setName("ECE");
		department2.setCountOfStudents(300);
		department2.setProfessor(new Professor("ABC", "Python", 20));

		Department department3 = new Department("IT", 120, new Professor("TVS", "DSA", 9));
		
		System.out.println(department);
		System.out.println(department2);
		System.out.println(department3);

	}
}
