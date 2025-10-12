package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmpDaoInterface {

	boolean addNewEmployee(Employee e);

	Set<Employee> displayAll();

	Employee serachById(int id);

	Set<Employee> searchByName(String nm);

	boolean updateSalary(int id, double sal);

	boolean deleteById(int id);

	boolean deleteBySalary(double sal);

	Set<Employee> searchBySalary(double sal);

	List<Employee> sortBySalary();

	List<Employee> sortByName();

	Set<Employee> sortById();

}
