package com;

public class Student {
	private int studentid;
	private String name;

	public Student() {
		
	}

	public Student(int studentid, String name) {
		super();
		this.studentid = studentid;
		this.name = name;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + "]";
	}
	

}
