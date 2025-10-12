package com.demo.beans;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private double salary;
	private LocalDate dt;
	
	//default constructor
	public Employee() {
		super();
	}
	//parameterized constructor
	public Employee(int id, String name, double salary, LocalDate dt) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dt = dt;
	}
	public Employee(int id2) {
		id = id2;
	}
	public Employee(double salary2) {
		salary = salary2;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDt() {
		return dt;
	}
	public void setDt(LocalDate dt) {
		this.dt = dt;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.id == ((Employee) obj).id) {
			return true;
		}else if(this.salary == ((Employee) obj).salary) {
			return true;
		}else {
			return false;
		}
		
	}
	//toString method
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dt=" + dt + "]";
	}
	
	
	@Override
	public int compareTo(Employee obj) {
//		if(this.salary<obj.salary) {
//			return -1;
//		}else if(this.salary>obj.salary){
//			return 1;
//		}else{
//			return 0;
//		}
		
		return (int)(this.salary - obj.salary);
	}
	
	
	
}
