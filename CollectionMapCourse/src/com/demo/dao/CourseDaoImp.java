package com.demo.dao;

import java.util.Map;

import java.util.Map.Entry;
import java.util.Set;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class CourseDaoImp implements CourseDao {
	static Map<String,Integer> hm ;
	static {
		hm = new HashMap<>();
		hm.put("DAC", 120);
		hm.put("DBDA", 100);
		hm.put("Embedded", 60);
		hm.put("Cyber Security", 60);
	}
	@Override
	public boolean save(String cname, int cap) {
		if(!hm.containsKey(cname)) {
			hm.put(cname, cap);
			return true;
		}
		return false;
	}
	@Override
	public Map<String, Integer> displayAll() {
		return hm;
	}
	@Override
	public int findByCourseNameCap(String cname) {
		if(hm.containsKey(cname)) {
			System.out.println(hm.get(cname));
			return hm.get(cname);
		}
		return -1;
	}
	@Override
	public boolean modifyCourseCap(String cname, int newcap) {
		if(hm.containsKey(cname)) {
			hm.put(cname, newcap);
			return true;
		}
		return false;
	}
	@Override
	public Set<String> findByCourseCap(int cap) {
		Set<String> kset = hm.keySet();
		Set<String> cnmset = new HashSet<>();
		
		for(String s:kset) {
			if(hm.get(s)>cap) {
				cnmset.add(s);
			}
		}
		if(cnmset.size()>0) {
			return cnmset;
		}
 		return null;
	}
	@Override
	public boolean modifyCourseName(String oname, String nname) {
		if(hm.containsKey(oname)) {
			int c = hm.remove(oname);
			System.out.println(c);
			hm.put(nname, c);
			return true;
		}
		return false;
	}
	@Override
	public Map<String, Integer> sortByKey() {
		Map<String,Integer> tmap  = new TreeMap<>();
		 Set<String> kset = hm.keySet();
		 for(String s : kset) {
			 tmap.put(s,hm.get(s));
		 }
		return tmap;
	}
	@Override
	public Set<Entry<String, Integer>> sortByName() {
		Set<Map.Entry<String, Integer>> es = hm.entrySet();
		
		Comparator<Map.Entry<String,Integer>> c = (o1,o2)->{
			return o1.getValue() - o2.getValue();
		};
		Set<Map.Entry<String,Integer>> tset = new TreeSet<>(c);
		for(Map.Entry<String,Integer> e :es) {
			tset.add(e);
		}
		
		return tset;
	}
	@Override
	public boolean deleteByCourse(String cname) {
		if(hm.containsKey(cname)) {
			Integer val = hm.remove(cname);
			if(val!=null) {
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean deleteByCapacity(int cap) {
		Set<String> kset = hm.keySet();
		int c = 0;
		Iterator<String> itr = kset.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			if(hm.get(s) == cap) {
				itr.remove();
				c++;
			}
		}
		if(c>0) {
			return true;
		}
		return false;
	}
}
