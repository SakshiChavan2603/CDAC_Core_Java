package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	boolean deleteById(int id);

	boolean modifyById(int id, double sal);

	List<Employee> dispalyAll();

	Employee displayById(int id);

	void readFile(String fname);

	void writeFile(String fname);

}
