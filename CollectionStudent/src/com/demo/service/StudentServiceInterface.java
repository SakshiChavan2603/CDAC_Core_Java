package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface StudentServiceInterface {
	boolean addNewStudent();
	
	List<Student> displayAll();
	
	Student searchById(int id);
	
	List<Student> searchByName(String name);
	
	boolean updateByMarks1(int id,float m1);
	
	boolean updateByMarks2(int id,float m2);
	
	boolean deleteById(int id);
	
	boolean deleteByAvgMarks();
	
	List<Student> searchByMarks1(float m1);
	
	List<Student> searchByMarks2(float m2);
	
	List<Student> sortById();
	
	List<Student> sortByName();
	
	List<Student> sortByMarks1();
	
	List<Student> sortByMarks2();

}
