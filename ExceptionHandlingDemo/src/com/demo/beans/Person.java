package com.demo.beans;

import com.demo.exceptions.NegativeSalaryException;

public class Person {
	private int id;
	private String iname;
	private double salary;
	public Person() {
		super();
	}
	public Person(int id, String iname, double salary) {
		super();
		this.id = id;
		this.iname = iname;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) throws NegativeSalaryException{
		if(salary<0) {
			throw new NegativeSalaryException("Salary can't be -ve");
		}else if(salary<2000) {
			throw new NegativeSalaryException("Salary must be greater than 2000");
		}
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", iname=" + iname + ", salary=" + salary + "]";
	}
	
	
}
