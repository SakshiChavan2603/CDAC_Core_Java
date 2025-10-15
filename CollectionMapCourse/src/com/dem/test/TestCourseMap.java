package com.dem.test;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.service.CourseService;
import com.demo.service.CourseServiceImp;

public class TestCourseMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CourseService cservice = new CourseServiceImp();
		int choice;
		do {
			System.out.println("1. Add New Course \n2. Display All \n3. Find by Course Name");
			System.out.println("4. modify course capacity\n 5. find by course capacity\n6. modify course name\n");
			System.out.println("7. display in sorted order of key\n 8. display  in sorted order of value\n");
			System.out.println("9. delete by course name\n10. delete by capacity\n 11.exit\n");
			System.out.println("Enter your Choice");
			choice = sc.nextInt();
			switch(choice) {
				case 1 -> {
					boolean status = cservice.addNewCourse();
					if(status) {
						System.out.println("Added successfully");
					}else {
						System.out.println("");
					}
				}
				
				case 2->{
					Map<String,Integer> hm = cservice.displayAll();
					Set<Map.Entry<String,Integer>> ms=hm.entrySet();
					ms.forEach(e->System.out.println(e.getKey()+"--->"+e.getValue()));
				}
				
				case 3->{
					System.out.println("Enter course name");
					String cname = sc.next();
					int cap = cservice.findByCourseNameCap(cname);
					if(cap!=-1) {
						System.out.println("Capacity of "+cname +" is "+ cap);
					}else {
						System.out.println("Course not found");
					}
				}
				
				case 4->{
					System.out.println("Enter course name");
					String cname = sc.next();
					System.out.println("Enter new cap for that course");
					int newcap = sc.nextInt();
					boolean status = cservice.modifyCourseCap(cname,newcap);
					if(status) {
						System.out.println("Modify succcessfully");
					}else {
						System.out.println("Not found course");
					}
				}
				
				case 5->{
					System.out.println("Enter capacity");
					int cap = sc.nextInt();
					Set<String> cset = cservice.findByCourseCap(cap);
					cset.forEach(System.out::println);
				}
				
				case 6->{
					System.out.println("Enter old course name");
					String oname = sc.next();
					System.out.println("Enter new course name");
					String nname = sc.next();
					
					boolean status = cservice.modifyCourseName(oname,nname);
					if(status) {
						System.out.println("modify successfully");
					}else {
						System.out.println("not found");
					}
				}
				
				case 7->{
					Map<String,Integer> m = cservice.sortedByKey();
					Set<String> kset = m.keySet();
					kset.forEach(k->System.out.println(k + "-->" + m.get(k)));
				}
				
				case 8->{
					Set<Map.Entry<String, Integer>> m = cservice.sortedByValue();
					m.forEach(e->System.out.println(e.getKey()+ "-->"+ e.getValue()));
					
				}
				
				case 9->{
					System.out.println("Enter course name");
					String cname = sc.next();
					boolean status = cservice.deleteByCourse(cname);
					if(status) {
						System.out.println("Deleted successfully");
					}else {
						System.out.println("not found");
					}
				}
				
				case 10->{
					System.out.println("Enter capacity");
					int cap = sc.nextInt();
					boolean status = cservice.deleteByCapacity(cap);
					if(status) {
						System.out.println("Deleted successfully");
					}else {
						System.out.println("not found");
					}
				}
			}
		} while(choice!=11);
	}
}
