package com.demo.comparators;

import java.util.Comparator;

import com.demo.beans.Employee;

public class MyComparatorName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
