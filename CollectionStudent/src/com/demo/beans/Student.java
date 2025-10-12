package com.demo.beans;


public class Student  implements Comparable<Student>{
	private int id;
	private String name;
	private float m1;
	private float m2;
	
	//default constructor
	public Student() {
		super();
	}
	
	//parameterized constructor
	public Student(int id, String name, float m1, float m2) {
		super();
		this.id = id;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
	}
	
	public Student(int id2) {
		this.id = id2;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.id == ((Student)obj).id;
	}

	//getter setter
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
	public float getM1() {
		return m1;
	}
	public void setM1(float m1) {
		this.m1 = m1;
	}
	public float getM2() {
		return m2;
	}
	public void setM2(float m2) {
		this.m2 = m2;
	}
	
	//toString
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.getId() - o.getId();
	}
	
	
}
