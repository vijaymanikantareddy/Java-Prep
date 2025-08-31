package com;

public class Student {
	private int studentid;
	private String name;
	private Address addr;

	public Student(int studentid, String name, Address addr) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.addr = addr;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Student() {

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
		return "Student [studentid=" + studentid + ", name=" + name + ", address=" + addr + "]";
	}

}
