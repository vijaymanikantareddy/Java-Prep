package com;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

public class HashSetOperation {
	public static void main(String[] args) {
		Set<Students> stu = new HashSet<Students>();
		Students s1 = new Students(1, "AAA");
		Students s2 = new Students(2, "BBB");
		Students s3 = new Students(2, "BBB");

		stu.add(s1);
		stu.add(s2);
		stu.add(s3);

		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(stu);
		
		
		Set<Integer> se = new LinkedHashSet<Integer>();
		se.add(null);
		se.add(null);
		System.out.println(se);
	}
}

class Students {
	int id;
	String name;

	public Students() {
		super();
	}

	public Students(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
}