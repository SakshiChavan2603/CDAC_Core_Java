package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImp;
import com.demo.beans.Employee;
import java.util.List;

public class EmpServiceImp implements EmployeeServiceInt {
	Scanner sc = new Scanner(System.in);
	private EmployeeDao edao;
	
	public EmpServiceImp() {
		edao = new EmployeeDaoImp();
	}
	
	@Override
	public boolean addNewEmployee() {
		System.out.println("Enter the id");
		int id = sc.nextInt();
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Entre the salary");
		double salary = sc.nextDouble();
		System.out.println("Enter the birth date");
		String dt = sc.next();
		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e = new Employee(id,name,salary,ldt);
		return edao.save(e);
		
	}
	
	@Override
	public List<Employee> displayAll() {
		return edao.displayEmp();
	}
	
	@Override
	public Employee serachById(int id) {
		return edao.findById(id);
	}
	
	@Override
	public List<Employee> searchByName(String nm) {
		return edao.findByName(nm);
	}
	
	@Override
	public boolean updateSalary(Employee e, double salary) {
		return edao.changeSalary(e,salary);
	}

	@Override
	public boolean deleteById(int id) {
		return edao.removeById(id);
	}

	@Override
	public boolean deleteBySalary(double salary) {
		return edao.removeBySalary(salary);
	}

	@Override
	public List<Employee> searchBySalary(double salary) {
		return edao.findBySalary(salary);
	}

	@Override
	public List<Employee> sortBySalary() {
		return edao.sortBySalary();
	}

	@Override
	public List<Employee> sortByName() {
		return edao.sortByName();
	}

	@Override
	public List<Employee> sortById() {
		return edao.sortById();
	}
	
	
	
	
	
	
	

}
