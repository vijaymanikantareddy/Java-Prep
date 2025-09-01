package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component("student")
public class Student {

	@Value("${id}")
	private int studentid;

	@Value("${name}")
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

	@Autowired
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

	@PostConstruct
	public void init() {
		System.out.println("PostConstruct Called ");
	}

}
