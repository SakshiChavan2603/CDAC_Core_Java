package com.demo.dao;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public interface CourseDao {
	boolean save(String cname, int cap);

	Map<String, Integer> displayAll();

	int findByCourseNameCap(String cname);

	boolean modifyCourseCap(String cname, int newcap);

	Set<String> findByCourseCap(int cap);

	boolean modifyCourseName(String oname, String nname);

	Map<String, Integer> sortByKey();

	Set<Entry<String, Integer>> sortByName();

	boolean deleteByCourse(String cname);
	
	boolean deleteByCapacity(int cap);
	
}
