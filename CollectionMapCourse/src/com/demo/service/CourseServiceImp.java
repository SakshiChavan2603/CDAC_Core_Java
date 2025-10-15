package com.demo.service;
import com.demo.dao.CourseDao;
import com.demo.dao.CourseDaoImp;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
public class CourseServiceImp implements CourseService {
	CourseDao cdao = new CourseDaoImp();

	@Override
	public boolean addNewCourse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter course name");
		String cname = sc.next();
		System.out.println("Enter course capacity");
		int capacity = sc.nextInt();
		return cdao.save(cname,capacity);
	}

	@Override
	public Map<String, Integer> displayAll() {
		return cdao.displayAll();
	}

	@Override
	public int findByCourseNameCap(String cname) {
		return cdao.findByCourseNameCap(cname);
	}

	@Override
	public boolean modifyCourseCap(String cname, int newcap) {
		return cdao.modifyCourseCap(cname,newcap);
	}

	@Override
	public Set<String> findByCourseCap(int cap) {
		return cdao.findByCourseCap(cap);
	}

	@Override
	public boolean modifyCourseName(String oname, String nname) {
		return cdao.modifyCourseName(oname,nname);
	}

	@Override
	public Map<String, Integer> sortedByKey() {
		return cdao.sortByKey();
	}

	@Override
	public Set<Entry<String, Integer>> sortedByValue() {
		return cdao.sortByName();
	}

	@Override
	public boolean deleteByCourse(String cname) {
		return cdao.deleteByCourse(cname);
	}

	@Override
	public boolean deleteByCapacity(int cap) {
		return cdao.deleteByCapacity(cap);
	}
}
