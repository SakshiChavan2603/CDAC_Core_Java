package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {
	boolean save(Employee e);
	
	List<Employee> displayEmp();
	
	Employee findById(int id);
	
	List<Employee> findByName(String nm);
	
	boolean changeSalary(Employee e,double salary);
	
	boolean removeById(int id);
	
	boolean removeBySalary(double salary);
	
	List<Employee> findBySalary(double salary);

	List<Employee> sortBySalary();

	List<Employee> sortByName();

	List<Employee> sortById();
}
