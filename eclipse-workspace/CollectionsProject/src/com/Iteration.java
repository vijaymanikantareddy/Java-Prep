package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteration {
	public static void main(String[] args) {
		Student st1 = new Student(1, "Vijay");
		Student st2 = new Student(2, "Ajay");
		Student st3 = new Student(3, "Jay");
		Student st4 = new Student(4, "Jaya");

		ArrayList<Student> students = new ArrayList<Student>();
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);

		System.out.println(students);

//		for(Student st: students) {
//			System.out.println(st);
//		}

		// Iterator
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		
		System.out.println("------------------");

		ListIterator<Student> listIterator = students.listIterator();
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.hasPrevious());
		System.out.println(listIterator.previous());
		System.out.println(listIterator.hasPrevious());
		System.out.println(listIterator.previous());
		System.out.println(listIterator.hasPrevious());
		System.out.println(listIterator.hasNext());

	}
}

class Student {
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
