package com;

// POJO - Plain Old Java Object

public class Professor {
	private String name;
	private String subject;
	private int experience;

	public Professor() {

	}

	public Professor(String name, String subject, int experience) {
		super();
		this.name = name;
		this.subject = subject;
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Professor [name=" + name + ", subject=" + subject + ", experience=" + experience + "]";
	}

}
