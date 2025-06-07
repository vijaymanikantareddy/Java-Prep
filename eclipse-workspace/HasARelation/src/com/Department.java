package com;

public class Department {
	private String name;
	private int countOfStudents;
	

	// has a relation
	private Professor professor;
	
	public Department() {
		
	}

	public Department(String name, int countOfStudents, Professor professor) {
		super();
		this.name = name;
		this.countOfStudents = countOfStudents;
		this.professor = professor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCountOfStudents() {
		return countOfStudents;
	}

	public void setCountOfStudents(int countOfStudents) {
		this.countOfStudents = countOfStudents;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", countOfStudents=" + countOfStudents + ", professor=" + professor + "]";
	}
	
	

}
