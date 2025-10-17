package com.demo.beans;

public class Employee {
	private int id;
	private String name;
	private String desg;
	private double sal;
	public Employee() {
		super();
	}
	public Employee(int id, String name, String desg, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.desg = desg;
		this.sal = sal;
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
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desg=" + desg + ", sal=" + sal + "]";
	}
}
