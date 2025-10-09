package com.demo.beans;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Person {
	static int  scount;
	static int  vcount;
	static int  ccount;
	static int cucount;
	
	static {
		scount = 0;
		vcount = 0;
		ccount = 0;
		cucount = 0;
	}
	
	private String pid;
	private String name;
	private Date bdate;
	
	public Person() {
		pid = generateEPid("s");
		name = null;
		bdate = null;
	}

	private String generateEPid(String empType) {
		if(empType.equals("s")) {
			scount++;
			return empType+scount;
		}else if(empType.equals("c")) {
			ccount++;
			return empType+ccount;
		}else if(empType.equals("v")) {
			vcount++;
			return empType+vcount;
		}else if(empType.equals("cu")) {
			cucount++;
			return empType+cucount;
		}else {
			return null;
		}
	}
	
	public Person(String empType,String name,Date bdate) {
		pid = generateEPid(empType);
		this.name = name;
		this.bdate = bdate;
	}

	public String getPid() {
		return pid;
	}

//	public void setPid(String pid) {
//		this.pid = pid;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String str=sdf.format(bdate);
		return "Person [pid=" + pid + ", name=" + name + ", bdate=" + str + "]";
	}
	
}
