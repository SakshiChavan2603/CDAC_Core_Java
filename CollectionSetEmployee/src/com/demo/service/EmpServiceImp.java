package com.demo.service;

import com.demo.dao.EmpDaoImp;
import com.demo.dao.EmpDaoInterface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;

public class EmpServiceImp implements EmpServiceInterface{
	private EmpDaoInterface edao;
	
	public EmpServiceImp() {
		edao = new EmpDaoImp();
	}

	@Override
	public boolean addNewEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id =sc.nextInt();
		System.out.println("Enter name ");
		String nm=sc.next();
		System.out.println("Enter Salary");
		double sal=sc.nextDouble();
		System.out.println("Enter Date (dd/mm/yyyy)");
		String dt=sc.next();
		LocalDate ldate = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e = new Employee(id,nm,sal,ldate);
		return edao.addNewEmployee(e);
	}

	@Override
	public Set<Employee> displayAll() {
		return edao.displayAll();
	}

	@Override
	public Employee serachById(int id) {
		return edao.serachById(id);
	}

	@Override
	public Set<Employee> searchByName(String nm) {
		return edao.searchByName(nm);
	}

	@Override
	public boolean updateSalary(int id, double sal) {
		return edao.updateSalary(id,sal);
	}

	@Override
	public boolean deleteById(int id) {
		return edao.deleteById(id);
	}

	@Override
	public boolean deleteBySalary(double sal) {
		return edao.deleteBySalary(sal);
	}

	@Override
	public Set<Employee> searchBySalary(double sal) {
		return edao.searchBySalary(sal);
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
	public Set<Employee> sortById() {
		return edao.sortById();
	}
}