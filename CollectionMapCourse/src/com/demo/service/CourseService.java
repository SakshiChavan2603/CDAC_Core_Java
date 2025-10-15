package com.demo.service;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public interface CourseService {

	boolean addNewCourse();

	Map<String, Integer> displayAll();

	int findByCourseNameCap(String cname);

	boolean modifyCourseCap(String cname, int newcap);

	Set<String> findByCourseCap(int cap);

	boolean modifyCourseName(String oname, String nname);

	Map<String, Integer> sortedByKey();

	Set<Entry<String, Integer>> sortedByValue();
	
	boolean deleteByCourse(String cname);
	
	boolean deleteByCapacity(int cap);

}
