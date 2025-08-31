package com;

import java.util.List;
import java.util.Map;

public class Employee {
	private int empId;

	private List<String> skills;
	
	private Map<Integer, String> hobbies;

	public Map<Integer, String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Map<Integer, String> hobbies) {
		this.hobbies = hobbies;
	}

	public Employee() {

	}

	public Employee(int empId, List<String> skills) {
		super();
		this.empId = empId;
		this.skills = skills;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", skills = " + skills + ", hobbies = " + hobbies + "]";
	}

	
}
