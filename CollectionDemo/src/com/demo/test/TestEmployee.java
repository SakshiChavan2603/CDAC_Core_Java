package com.demo.test;
import java.util.Scanner;
import java.util.List;

import com.demo.beans.Employee;
import com.demo.service.EmpServiceImp;

public class TestEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmpServiceImp emp = new EmpServiceImp();
		int choice;
		do {
			System.out.println("1.Add new Employee\n 2.Dispaly all\n 3.Serach by id");
			System.out.println("4.Serach by name\n 5. update salary\n 6.delete by id");
			System.out.println("7.delete by salary\n 8. serach by Salary\n 9.sort by salary\n");
			System.out.println("10. sort by name\n 11.sort by id  12.exit");
			System.out.println("Enter choice");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1->{
							boolean status = emp.addNewEmployee();
							if(status) {
								System.out.println("Employeee added susccessfully");
							}else {
								System.out.println();
							}
						}
				
				case 2->{
							List<Employee> elist =emp.displayAll();
							elist.forEach(System.out::println);
						}
				
				case 3->{
							System.out.println("Enter the id");
							int id = sc.nextInt();
							Employee e = emp.serachById(id);
							System.out.println(e);
						}
				
				case 4->{
							System.out.println("Enter the name");
							String nm = sc.next();
							List<Employee> elist = emp.searchByName(nm);
							elist.forEach(System.out::println);
						}
				
				case 5->{
							System.out.println("Enter the id");
							int id = sc.nextInt();
							Employee e = emp.serachById(id);
							System.out.println("Enter the salary");
							double salary = sc.nextDouble();
							boolean status = emp.updateSalary(e,salary);
							if(status) {
								System.out.println("Updated sucessfully");
							}else {
								System.out.println("not found emp");
							}
						}
				
				case 6->{
							System.out.println("Enter the id");
							int id = sc.nextInt();
							boolean status = emp.deleteById(id);
							if(status) {
								System.out.println("Deleted sucessfully");
							}else {
								System.out.println("not found emp");
							}
						}
				
				case 7->{
							System.out.println("Enter the salary");
							double salary = sc.nextDouble();
							boolean status = emp.deleteBySalary(salary);
							if(status) {
								System.out.println("Deleted sucessfully");
							}else {
								System.out.println("not found emp");
							}
						}
				
				case 8->{
							System.out.println("Enter the salary");
							double salary = sc.nextDouble();
							List<Employee> elist = emp.searchBySalary(salary);
//							if(elist!=null) {
//								elist.forEach(System.out::println);
//							}else {
//								System.out.println("not fouund");
//							}
							for(Employee e: elist) {
								if(e!=null) {
									System.out.println(e);
								}else {
									System.out.println("not found");
									break;
								}
							}
						}
				
				case 9->{
							List<Employee> elist = emp.sortBySalary();
							elist.forEach(System.out::println);
						}
				
				case 10->{
							List<Employee> elist = emp.sortByName();
							elist.forEach(System.out::println);
						 }
				case 11->{
							List<Employee> elist = emp.sortById();
							elist.forEach(System.out::println);
						 }
				
				case 12->{
							System.exit(0);
						 }
				default->{
							System.out.println("Invalid choice");
						 }
			}
		}while(choice!=11);
	}
}
