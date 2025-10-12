package com.demo.test;
import com.demo.beans.Student;
import com.demo.service.StudentServiceImp;

import java.util.List;
import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		StudentServiceImp studService = new StudentServiceImp();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("1.Add new Student\n 2.Dispaly all\n 3.Serach by id");
			System.out.println("4.Serach by name\n 5.update marks1\n 6. update marks2");
			System.out.println("7.delete by id\n 8.delete by average marks\n 9.serach by Marks1/marks2\n ");
			System.out.println("10.sort by marks\n 11.sort by name\n 12.sort by id  13.exit");
			System.out.println("Enter choice");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1->{
					boolean status = studService.addNewStudent();
					if(status) {
						System.out.println("Added successfully");
					}else {
						System.out.println("not added");
					}
				}
				
				case 2->{
					List<Student> list = studService.displayAll();
					if(list!=null) {
						list.forEach(System.out::println);
					}else {
						System.out.println("empty list");
					}
				}
				
				case 3->{
					System.out.println("Enter id to search");
					int id = sc.nextInt();
					Student s = studService.searchById(id);
					if(s!=null) {
						System.out.println(s);
					}else {
						System.out.println("not found");
					}
				}
				
				case 4->{
					System.out.println("Enter name to search");
					String name = sc.next();
					List<Student> slist = studService.searchByName(name);
					if(slist!=null) {
						slist.forEach(System.out::println);
					}
					
				}
				
				case 5->{
					System.out.println("Enter id to update marks");
					int id = sc.nextInt();
					System.out.println("Enter marks 1");
					float m1 = sc.nextFloat();
					boolean status = studService.updateByMarks1(id,m1);
					if(status) {
						System.out.println("Updated successfully");
					}else {
						System.out.println("not found");
					}
				}
				
				case 6->{
					System.out.println("Enter id to update marks");
					int id = sc.nextInt();
					System.out.println("Enter marks 2");
					float m2 = sc.nextFloat();
					boolean status = studService.updateByMarks2(id,m2);
					if(status) {
						System.out.println("Updated successfully");
					}else {
						System.out.println("not found");
					}
				}
				
				case 7->{
					System.out.println("Enter id to search");
					int id = sc.nextInt();
					boolean status = studService.deleteById(id);
					if(status) {
						System.out.println("deleteed successfully");
					}else {
						System.out.println("not found");
					}
				}
				
				case 8->{
					boolean status = studService.deleteByAvgMarks();
					if(status) {
						System.out.println("deleteed successfully");
					}else {
						System.out.println("not found");
					}
				}
				
				case 9->{
					System.out.println("Enter choice to serach  marks (m1/m2)");
					String ch = sc.next();
					List<Student> slist;
					if(ch.equals("m1")) {
						System.out.println("Enter marks1");
						float mm1 = sc.nextFloat();
						 slist = studService.searchByMarks1(mm1);
					}else {
						System.out.println("Enter marks2");
						float mm2 = sc.nextFloat();
						slist = studService.searchByMarks2(mm2);
					}
					
					if(slist!=null) {
						slist.forEach(System.out::println);
					}else {
						System.out.println("Not found");
					}
				}
				
				case 10->{
					System.out.println("Enter choice to sort by  marks (m1/m2)");
					String ch = sc.next();
					List<Student> slist;
					if(ch.equals("m1")) {
						 slist = studService.sortByMarks1();
						 slist.forEach(System.out::println);
					}else {
						slist = studService.sortByMarks2();
						slist.forEach(System.out::println);
					}
				}
				
				case 11->{
					List<Student> slist = studService.sortByName();
					slist.forEach(System.out::println);
				}
				
				case 12->{
					List<Student> slist = studService.sortById();
					slist.forEach(System.out::println);
				}
				
				case 13->{
					System.exit(0);
				}
				default->{
					System.out.println("Invalid choice");
				}
				
			}
			
		}while(choice != 13);
		
	}
}
