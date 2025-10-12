package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentDaoInterface {

	boolean save(Student s);

	List<Student> findAll();

	Student findById(int id);

	List<Student> findByName(String name);

	boolean changeMarks1(int id, float m1);
	
	boolean changeMarks2(int id, float m2);

	boolean deleteById(int id);

	boolean deleteByAvgMarks();

	List<Student> searchByMarks1(float m1);

	List<Student> searchByMarks2(float m2);
	
	List<Student> sortById();

	List<Student> sortByNAme();

	List<Student> sortByM1();
	
	List<Student> sortByM2();
}
