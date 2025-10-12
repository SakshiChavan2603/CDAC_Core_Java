package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

public class StudentDaoImp implements  StudentDaoInterface{
	static List<Student> slist;
	
	static {
		slist = new ArrayList<>();
		slist.add(new Student(1,"Sakshi",60,80));
		slist.add(new Student(2,"Sanika",90,89));
		slist.add(new Student(3,"Prachi",68,98));
		slist.add(new Student(4,"Anushka",56,68));
		slist.add(new Student(5,"Prachi",59,76));
	}

	@Override
	public boolean save(Student s) {
		slist.add(s);
		return true;
	}

	@Override
	public List<Student> findAll() {
		return slist;
	}

	@Override
	public Student findById(int id) {
		int pos = slist.indexOf(new Student(id));
		if(pos != -1) {
			return slist.get(pos);
		}
		return null;
	}

	@Override
	public List<Student> findByName(String name) {
		List<Student> list = new ArrayList<>();
		for(Student s : slist) {
			if(s.getName().equals(name)) {
				list.add(s);
			}
		}
		if(list.size()>0) {
			return list;
		}
		return null;
	}

	@Override
	public boolean changeMarks1(int id, float m1) {
		Student s = findById(id);
		if(s!=null) {
			s.setM1(m1);
			return true;
		}
		return false;
	}

	@Override
	public boolean changeMarks2(int id, float m2) {
		Student s = findById(id);
		if(s!=null) {
			s.setM1(m2);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		return slist.remove(new Student(id));
	}

	@Override
	public boolean deleteByAvgMarks() {
			return slist.removeIf(stu->((stu.getM1()+stu.getM2())/2)<50);
	}

	@Override
	public List<Student> searchByMarks1(float m1) {
		List<Student> list = slist.stream()
								  .filter(stud->stud.getM1() == m1)
								  .collect(Collectors.toList());
		if(list.size()>0) {
			return list;
		}
		return null;
	}

	@Override
	public List<Student> searchByMarks2(float m2) {
		List<Student> list = slist.stream()
				  				  .filter(stud->stud.getM2() == m2)
				  				  .collect(Collectors.toList());
		if(list.size()>0) {
			return list;
		}
		return null;
	}

	@Override
	public List<Student> sortById() {
		List<Student> list = new ArrayList<>();
		for(Student s: slist) {
			list.add(s);
		}
		list.sort(null);
		return list;
	}

	@Override
	public List<Student> sortByNAme() {
		List<Student> list = new ArrayList<>();
		for(Student s:slist) {
			list.add(s);
		}
		Comparator<Student>  s = (o1,o2)->{
			return o1.getName().compareTo(o2.getName());
		};
		list.sort(s);
		return list;
	}

	@Override
	public List<Student> sortByM1() {
		List<Student> list = new ArrayList<>();
		for(Student s:slist) {
			list.add(s);
		}
		Comparator<Student> s = (o1,o2)->{
			return (int)(o1.getM1() - o2.getM1());
		};
		list.sort(s);
		return list;
	}

	@Override
	public List<Student> sortByM2() {
		List<Student> list = new ArrayList<>();
		for(Student s:slist) {
			list.add(s);
		}
		Comparator<Student> s = (o1,o2)->{
			return (int)(o1.getM2() - o2.getM2());
		};
		list.sort(s);
		return list;
	}
		
		
}
