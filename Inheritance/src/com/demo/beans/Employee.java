package com.demo.beans;

import java.util.Date;

abstract public class Employee extends Person {	
	private String dept;
	private String desg;
	
	public Employee(String empType, String name, Date bdate, String dept, String desg) {
		super(empType,name,bdate);
		this.dept = dept;
		this.desg = desg;
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}
	
	abstract public double calculateSal();

	@Override
	public String toString() {
		return  super.toString()+"Departmet: " + dept + "Designation: "+ desg;
	}	
}
