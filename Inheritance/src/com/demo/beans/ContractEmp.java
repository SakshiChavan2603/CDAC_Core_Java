package com.demo.beans;

import java.util.Date;

public class ContractEmp extends Employee {
	private float hrs;
	private double hrscharges;
	
	public ContractEmp(String name, Date bdate, String dept, String desg, float hrs, double hrscharges) {
		super("c",name,bdate,dept,desg);
		this.hrs = hrs;
		this.hrscharges = hrscharges;
	}

	public float getHrs() {
		return hrs;
	}

	public void setHrs(float hrs) {
		this.hrs = hrs;
	}

	public double getHrscharges() {
		return hrscharges;
	}

	public void setHrscharges(double hrscharges) {
		this.hrscharges = hrscharges;
	}
	
	public double  calculateSal() {
		return hrs*hrscharges;
	}
	
	public String toString() {
		return super.toString() + "Hrs: " + hrs + "Hrs Charges " + hrscharges;
	}
}
