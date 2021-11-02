package com.te.practice.comparator;

public class Student  {
	int id;
	String name;
	double marks;
	int age;

	public Student(int id, String name,double marks,  int age) {
		this.id = id;
		this.name = name;
		this.marks=marks;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		Student s=(Student)obj;
		return this.id==s.id;
	}
	
}
