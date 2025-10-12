package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.dao.StudentDaoImp;
import com.demo.dao.StudentDaoInterface;

public class StudentServiceImp implements StudentServiceInterface{
	private StudentDaoInterface sdao;
	
	public StudentServiceImp() {
		sdao = new StudentDaoImp();
	}

	@Override
	public boolean addNewStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student id");
		int id = sc.nextInt();
		System.out.println("Enter student name");
		String name = sc.next();
		System.out.println("Enter student marks1");
		float m1 = sc.nextFloat();
		System.out.println("Enter student marks2");
		float m2 = sc.nextFloat();
		Student s = new Student(id,name,m1,m2);
		return sdao.save(s);
	}

	@Override
	public List<Student> displayAll() {
		return sdao.findAll();
	}

	@Override
	public Student searchById(int id) {
		return sdao.findById(id);
	}

	@Override
	public List<Student> searchByName(String name) {
		return sdao.findByName(name);
	}

	@Override
	public boolean updateByMarks1(int id, float m1) {
		return sdao.changeMarks1(id,m1);
	}

	@Override
	public boolean updateByMarks2(int id, float m2) {
		return sdao.changeMarks2(id,m2);
	}

	@Override
	public boolean deleteById(int id) {
		return sdao.deleteById(id);
	}

	@Override
	public boolean deleteByAvgMarks() {
		return sdao.deleteByAvgMarks();
	}

	@Override
	public List<Student> searchByMarks1(float m1) {
		return sdao.searchByMarks1(m1);
	}

	@Override
	public List<Student> searchByMarks2(float mm2) {
		return sdao.searchByMarks2(mm2);
	}

	@Override
	public List<Student> sortById() {
		return sdao.sortById();
	}

	@Override
	public List<Student> sortByName() {
		return sdao.sortByNAme();
	}

	@Override
	public List<Student> sortByMarks1() {
		return sdao.sortByM1();
	}

	@Override
	public List<Student> sortByMarks2() {
		return sdao.sortByM2();
	}
	
	
}
