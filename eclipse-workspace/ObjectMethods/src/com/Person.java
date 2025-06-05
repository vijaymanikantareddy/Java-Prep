package com;

import java.util.Objects;

public class Person {
	int age;
	String name;

	Person() {

	}

	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public static void main(String args[]) {
		Person person1 = new Person();
		person1.age = 10;
		person1.name = "Peru";

		Person person2 = new Person(30, "Africa");

		Person person3 = new Person();
		person3.setAge(10);
		person3.setName("Peru");

		boolean isSame = person1.equals(person3);

		System.out.println(isSame);

		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		System.out.println(person3.hashCode());
		
		
		System.out.println(person1);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.age, this.name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return this.age == other.age && this.name.equals(other.name);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
