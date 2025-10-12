package com.demo.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

import com.demo.beans.Employee;
import com.demo.comparators.MyComparatorName;
import com.demo.comparators.MyCompartorId;

public class EmployeeDaoImp implements EmployeeDao{
	static List<Employee> elist;
	
	static {
		elist = new ArrayList<>();
		elist.add(new Employee(1,"Sakshi",897656,LocalDate.of(2003, 10, 02)));
		elist.add(new Employee(2,"Sanika",697656,LocalDate.of(2004, 9, 03)));
		elist.add(new Employee(3,"Shruti",397656,LocalDate.of(2005, 8, 05)));
		elist.add(new Employee(4,"Kanchan",90000,LocalDate.of(2005, 8, 05)));
		elist.add(new Employee(5,"Prachi",90000,LocalDate.of(2005, 8, 05)));
	
	}

	@Override
	public boolean save(Employee e) {
		elist.add(e);
		return true;
	}

	@Override
	public List<Employee> displayEmp() {
		return elist;
	}

	@Override
	public Employee findById(int id) {
		int pos = elist.indexOf(new Employee(id));
		if(pos != -1) {
			return elist.get(pos);
		}else {
			return null;
		}
	}

	@Override
	public List<Employee> findByName(String nm) {
		List<Employee> temp = elist.stream()
								   .filter(emp->emp.getName().equals(nm))
								   .collect(Collectors.toList());
		if(temp.size()>0) {
			return temp;
		}
		return null;
	}

	@Override
	public boolean changeSalary(Employee e,double salary) {
		if(e!=null) {
			e.setSalary(salary);
			return true;
		}
		return false;
	}

	@Override
	public boolean removeById(int id) {
		return elist.remove(new Employee(id));
	}

	@Override
	public boolean removeBySalary(double salary) {
		return elist.remove(new Employee(salary));
	}

	@Override
	public List<Employee> findBySalary(double salary) {
		List<Employee> emplist = elist.stream()
									  .filter(emp->emp.getSalary() == salary)
									  .collect(Collectors.toList());
		return emplist;
	}

	@Override
	public List<Employee> sortBySalary() {
		List<Employee> list = new ArrayList();
		for(Employee e: elist) {
			list.add(e);
		}
		
		list.sort(null);
		return list;
	}

	@Override
	public List<Employee> sortByName() {
		List<Employee> list = new ArrayList();
		for(Employee e: elist) {
			list.add(e);
		}
//		list.sort(new MyComparatorName());
		
		Comparator<Employee> c = (obj1,obj2)->{
								return obj1.getName().compareTo(obj2.getName());
								};
		
		return list;
	}

	@Override
	public List<Employee> sortById() {
		List<Employee> list = new ArrayList();
		for(Employee e: elist) {
			list.add(e);
		}
		
//		list.sort(new MyCompartorId());
		
		Comparator<Employee> c = (obj1,obj2)->{
								return obj1.getId() - obj2.getId();
								};
		list.sort(c);
		return list;
	}
}
