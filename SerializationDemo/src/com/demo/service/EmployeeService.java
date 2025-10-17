package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	boolean deleteById(int id);

	boolean modifyById(int id, double sal);

	List<Employee> displayAll();

	Employee displayByID(int id);

	void readFile(String string);

	void writeFile(String fname);

}
