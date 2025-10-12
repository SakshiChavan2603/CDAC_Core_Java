package com.demo.dao;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;

import com.demo.beans.Employee;

public class EmpDaoImp implements EmpDaoInterface{
	static Set<Employee> eset;
	
	static {
		eset = new HashSet<>();
		
		eset.add(new Employee(101,"Sakshi",50000,LocalDate.of(2003,11,02)));
		eset.add(new Employee(111,"Sanika",45000,LocalDate.of(2004,12,02)));
		eset.add(new Employee(103,"Shruti",60000,LocalDate.of(2013,10,03)));
		eset.add(new Employee(105,"Anushka",90000,LocalDate.of(2005,9,25)));
	}

	@Override
	public boolean addNewEmployee(Employee e) {
		return eset.add(e);
	}

	@Override
	public Set<Employee> displayAll() {
		return eset;
	}

	@Override
	public Employee serachById(int id) {
		Optional<Employee> e = eset.stream().filter(emp->emp.getId() == id).findFirst();
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}

	@Override
	public Set<Employee> searchByName(String nm) {
		Set<Employee> eset1 = eset.stream()
							  .filter(emp->emp.getName().equals(nm))
							  .collect(Collectors.toSet());
		if(eset1.size()>0) {
			return eset1;
		}
		return null;
	}

	@Override
	public boolean updateSalary(int id, double sal) {
		Employee e = serachById(id);
		if(e!=null) {
			e.setSalary(sal);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		return eset.remove(new Employee(id));
	}

	@Override
	public boolean deleteBySalary(double sal) {
		return eset.removeIf(emp->emp.getSalary()>sal);
	}

	@Override
	public Set<Employee> searchBySalary(double sal) {
		Set<Employee> es = eset.stream().filter(emp->emp.getSalary() == sal).collect(Collectors.toSet());
		if(es.size()>0) {
			return es;
		}
		return null;
	}

	@Override
	public List<Employee> sortBySalary() {
		List<Employee> elist = new ArrayList<>();
		for(Employee e: eset) {
			elist.add(e);
		}
		
		Comparator<Employee> c = (o1,o2)->
					{return (int)(o1.getSalary() - o2.getSalary());};
		elist.sort(c);
		return elist;
	}

	@Override
	public List<Employee> sortByName() {
		List<Employee> elist = new ArrayList<>();
		for(Employee e: eset) {
			elist.add(e);
		}
		
		Comparator<Employee> c = (o1,o2)->{
			return o1.getName().compareTo(o2.getName());
		};
		
		elist.sort(c);
		return elist;
	}

	@Override
	public Set<Employee> sortById() {
		Set<Employee> tset = new TreeSet<>();
		for(Employee e: eset) {
			tset.add(e);
		}
		return tset;
	}
	
	
	
	
	
	
}
