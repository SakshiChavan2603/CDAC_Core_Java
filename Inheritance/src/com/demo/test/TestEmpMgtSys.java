package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;

public class TestEmpMgtSys {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. add new Employee\n 2. Display all");
			System.out.println("3. Display by id\n 4. change sal or charges");
			System.out.println("5. Display Salaried Employee\n 6. Display Contract Employee");
			System.out.println("7. Search By Name\n 8. calculate net salary\n9. exit\n");
			System.out.println("Enter choice");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("1.Slaried Emp 2.Contract emp 3.Vendor");
					int ch;
					ch = sc.nextInt();
					boolean status =EmployeeService.addNewEmp(ch);
					if(status) {
						System.out.println("Employee added susccessfully");
					}else {
						System.out.println("not added due to array is full");
					}
					break;
				
				case 2:
					EmployeeService.displayAll();
					break;
					
				case 3:
					System.out.println("Enter the empid");
					String id = sc.next();
					Employee e = EmployeeService.displayEmpById(id);
					if(e!=null) {
						System.out.println(e);
					}else {
						System.out.println("Employee not found");
					}
					break;
				
				case 4:
					System.out.println("Enter the id");
					id = sc.next();
					System.out.println("Enter the salary/charges");
					double salary = sc.nextDouble();
					status = EmployeeService.changeSalaryOrCharges(id,salary);
					if(status) {
						System.out.println("Updated succcessfully");
					}else {
						System.out.println("not found");
					}
					break;
				
				case 5:
					EmployeeService.displaySalariedEmp();
					break;
				
				case 6:
					EmployeeService.displayContractEmp();
					break;
				
				case 7:
					System.out.println("Enter the name of emp");
					String name = sc.next();
					Employee[] temp = EmployeeService.serachByName(name);
					for(Employee t: temp) {
						if(t!=null) {
							System.out.println(t);
						}else {
							System.out.println("not found");
							break;
						}
					}
					break;
				
				case 8:
//					System.out.println("1.Slaried Emp 2.Contract emp 3.Vendor");
//					ch = sc.nextInt();
					System.out.println("Enter the id");
					id = sc.next();
					salary = EmployeeService.calculateSalary(id);
					if(salary>0) {
						System.out.println("Salary of the employee" + id + "is "+ salary);
					}else {
						System.out.println("Employee not found");
					}
					break;
				
				case 9:
					System.exit(0);
				
				default:
					System.out.println("Invalid choice");
					break;
			}
		}while(choice !=9);
	}
}
