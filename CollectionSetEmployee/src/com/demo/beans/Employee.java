package com.demo.beans;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private double salary;
	private LocalDate jdate;
	public Employee() {
		super();
	}
	public Employee(int id, String name, double salary, LocalDate jdate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.jdate = jdate;
	}
	public Employee(int id2) {
		id = id2;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getJdate() {
		return jdate;
	}
	public void setJdate(LocalDate jdate) {
		this.jdate = jdate;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", jdate=" + jdate + "]";
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return this.id == ((Employee)obj).id;
	}
	
	@Override
	public int compareTo(Employee o) {
//		return  this.id - o.id;
		return o.id - this.id;
	}
	
}
