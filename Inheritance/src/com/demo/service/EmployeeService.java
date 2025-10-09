package com.demo.service;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;

public class EmployeeService {
	static Employee[] emparr;
	static int count;
	static {
		emparr = new Employee[100];
		emparr[0] =new SalariedEmp("Sakshi",new Date(2003,11,2),"HR","Manager",80000);
		emparr[1] =new SalariedEmp("Sanika",new Date(2004,10,4),"UX","Designer",70000);
		emparr[2] =new SalariedEmp("Nikita",new Date(2005,9,7),"UI","Developer",60000);
		
		
		emparr[3] =new ContractEmp("Archana",new Date(2002,11,2),"HR","Manager",80,8000);
		emparr[4] =new ContractEmp("Pranali",new Date(2013,11,2),"HR","Manager",70, 7000);
		emparr[5] =new ContractEmp("Smita",new Date(2000,11,2),"HR","Manager",60,6000);
		
		count = 6;
	}
	public static boolean addNewEmp(int ch) {
		Scanner sc = new Scanner(System.in);
		if(count < emparr.length) {
			System.out.println("Enter the Nmae of Employee:");
			String nm = sc.next();
			System.out.println("Enter the Date of Birth");
			String bdate = sc.next();
			Date dt= null;
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			try {
				dt=sdf.parse(bdate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			System.out.println("Enter the department");
			String dept = sc.next();
			sc.nextLine();
			System.out.println("Enter the designations");
			String desg = sc.next();
			switch(ch) {
				case 1:
					System.out.println("Enter the salary");
					double salary = sc.nextDouble();
					emparr[count]=new SalariedEmp(nm,dt,dept,desg,salary);
					count++;
					return true;
				case 2:
					System.out.println("Enter the hrs");
					float hrs = sc.nextFloat();
					System.out.println("Enter the hrscharges");
					float hrscharges = sc.nextFloat();
					emparr[count]=new ContractEmp(nm,dt,dept,desg,hrs,hrscharges);
					count++;
					return true;
				case 3:
					System.exit(0);
				default:
					System.out.println("Envalid choice");
					break;	
			}
		}
		return false;
		
//		if(ch==1) {
//			System.out.println("Enter the salary");
//			double salary = sc.nextDouble();
//			emparr[count]=new SalariedEmp(nm,dt,dept,desg,salary);
//			count++;
//		}else if(ch==2) {
//			System.out.println("Enter the hrs");
//			float hrs = sc.nextFloat();
//			System.out.println("Enter the hrscharges");
//			float hrscharges = sc.nextFloat();
//			emparr[count]=new ContractEmp(nm,dt,dept,desg,hrs,hrscharges);
//			count++;
//		}
	}
	public static void displayAll() {
		for(Employee e: emparr) {
			if(e!=null) {
				System.out.println(e);
			}
		}
	}
	public static Employee displayEmpById(String id) {
		for(Employee e: emparr) {
			if(e.getPid().equals(id)) {
				return e;
			}else {
				break;
			}
		}
		return null;
	}
	public static boolean changeSalaryOrCharges(String id, double salary) {
		
		for(Employee e:emparr) {
			if(e!=null) {
				if(e.getPid().equals(id)) {
					if(e instanceof SalariedEmp) {
						((SalariedEmp) e).setSalary(salary);
						return true;
					}else if(e instanceof ContractEmp) {
						((ContractEmp) e).setHrscharges(salary);
						return true;
					}
				}
			}else {
				break;
			}
		}
		return false;
	}
	public static void displaySalariedEmp() {
		for(Employee e :emparr) {
			if(e!=null) {
				if(e instanceof SalariedEmp) {
					System.out.println(e);
				}
			}else {
				break;
			}
		}
		
		
	}
	public static void displayContractEmp() {
		for(Employee e :emparr) {
			if(e!=null) {
				if(e instanceof ContractEmp) {
					System.out.println(e);
				}
			}else {
				break;
			}
		}
		
	}
	public static boolean serachByName(String name) {
		for(Emplyee e)
	}
	
	
}
