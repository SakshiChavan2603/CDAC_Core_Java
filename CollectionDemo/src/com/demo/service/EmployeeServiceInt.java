package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeServiceInt {
	boolean addNewEmployee();
	
	List<Employee> displayAll();
	
	Employee serachById(int id);
	
	List<Employee> searchByName(String nm);
	
	boolean updateSalary(Employee e, double salary);
	
	boolean deleteById(int id);
	
	boolean deleteBySalary(double salary);
	
	List<Employee> searchBySalary(double salary);
	
	List<Employee> sortBySalary();
	
	List<Employee> sortByName();
	
	List<Employee> sortById();
	
}
