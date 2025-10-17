package com.demo.service;
import com.demo.dao.*;
import java.util.*;
import com.demo.beans.*;

public class EmployeeServiceImp implements EmployeeService{
	EmployeeDao edao = new EmployeeDaoImp();
	
	@Override
	public void readFile(String fname) {
		edao.readFile(fname);
	}
	
	@Override
	public boolean addNewEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id of employee");
		int id = sc.nextInt();
		System.out.println("Entre name");
		String name = sc.next();
		System.out.println("Enter designation");
		String desg = sc.next();
		System.out.println("Enter salary");
		double sal = sc.nextDouble();
		Employee e = new Employee(id,name,desg,sal);
		return edao.save(e);
	}

	@Override
	public boolean deleteById(int id) {
		return edao.deleteById(id);
	}

	@Override
	public boolean modifyById(int id, double sal) {
		return edao.modifyById(id,sal);
	}

	@Override
	public List<Employee> displayAll() {
		return edao.dispalyAll();
	}

	@Override
	public Employee displayByID(int id) {
		return edao.displayById(id);
	}

	@Override
	public void writeFile(String fname) {
		edao.writeFile(fname);
	}
	
	

}
