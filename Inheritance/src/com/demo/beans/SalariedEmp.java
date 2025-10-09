package com.demo.beans;

import java.util.Date;

public class SalariedEmp extends Employee{
	private double salary;
	private double bonus;
	
	public SalariedEmp(String name, Date bdate, String dept, String desg, double salary) {
		super("s",name,bdate,dept,desg);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bouns) {
		this.bonus = bouns;
	}
	
	public double calcBonus(float percent) {
		bonus = percent * salary;
		return bonus;
	}
	public double calculateSal() {
		return bonus+salary+0.10*salary+0.15*salary- 0.08*salary;
	}
	
	public String toString() {
		return super.toString() + "Salary: " + salary + "Bonus: " + bonus;
	}
	
}
