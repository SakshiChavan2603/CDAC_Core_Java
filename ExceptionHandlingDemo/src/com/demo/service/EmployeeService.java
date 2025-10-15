package com.demo.service;
import java.util.*;
import com.demo.beans.Person;
import com.demo.exceptions.NegativeSalaryException;

public class EmployeeService {
	Scanner sc = new Scanner(System.in);
//	public void acceptData() throws NegativeSalaryException {
//		Person p = new Person(1,"Sakshi",-2000);
//		p.setSalary(-2000);
//	}
	
	public void acceptData(double sal) throws NegativeSalaryException {
		Person p = new Person(1,"Sakshi",sal);
		p.setSalary(sal);
	}
}
