package com.demo.test;
import com.demo.beans.Employee;
import com.demo.service.*;

import java.util.List;
import java.util.Scanner;

public class TestCRUDEmp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService eservice = new EmployeeServiceImp();
		eservice.readFile("emp.txt");
		int choice = 0;
		do {
			System.out.println("1. add new Employee\n2. delete by id\n");
			System.out.println("3. modify salary by id\n4.display all\n");
			System.out.println("5. display by id\n6. exit\n");
			System.out.println("Enter choice");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1->{
					boolean status = eservice.addNewEmployee();
					if(status) {
						System.out.println("Addeded successfully");
					}else {
						System.out.println("not added");
					}
				}
				
				case 2->{
					System.out.println("Enter id of employee");
					int id = sc.nextInt();
					boolean status = eservice.deleteById(id);
					if(status) {
						System.out.println("deleted successfully");
					}else {
						System.out.println("not added");
					}
				}
				
				case 3->{
					System.out.println("Enter id of employee");
					int id = sc.nextInt();
					System.out.println("Enter new salary");
					double sal = sc.nextDouble();
					boolean status = eservice.modifyById(id,sal);
					if(status) {
						System.out.println("deleted successfully");
					}else {
						System.out.println("not added");
					}
				}
				
				case 4->{
					List<Employee> list = eservice.displayAll();
					if(list!=null) {
						list.forEach(System.out::println);
					}else {
						System.out.println("empty");
					}
				}
				
				case 5->{
					System.out.println("Enter id");
					int id = sc.nextInt();
					Employee e = eservice.displayByID(id);
					if(e!=null) {
						System.out.println(e);
					}else {
						System.out.println("not found");
					}
					
				}
				case 6->{
					eservice.writeFile("emp.txt");
					sc.close();
					System.out.println("Thanks for visiting");
				}
				
				default->{
					System.out.println("Invalid choice");
				}
			}
		}while(choice!=6);
	}
}
