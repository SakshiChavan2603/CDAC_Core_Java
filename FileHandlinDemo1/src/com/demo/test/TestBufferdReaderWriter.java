package com.demo.test;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.demo.beans.Employee;
import java.util.ArrayList;

public class TestBufferdReaderWriter {

	public static void main(String[] args) {
		List<Employee> lst = new ArrayList<>();
		
		File f = new File("Emp.txt");
		//BufferedWriter bw = null; 
//		try {
//			if(f.exists()) {
//				bw = new BufferedWriter(new FileWriter("Emp.txt",true));
//			}else {
//				bw = new BufferedWriter(new FileWriter("Emp.txt"));
//			}
//		}catch(IOException e) {
//			System.out.println(e.getMessage());
//		}
		
		//read data from the csv file(Comma separated value)
		try(BufferedReader br = new BufferedReader(new FileReader(f))){
			
			String line = br.readLine();
			while(line != null) {
				String[] str = line.split(",");
				Employee emp = new Employee();
				emp.setId(Integer.parseInt(str[0]));
				emp.setName(str[1]);
				emp.setDesg(str[2]);
				emp.setSal(Double.parseDouble(str[3]));
				lst.add(emp);
				line = br.readLine();
			}
			lst.forEach(System.out::println);
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		//write data into the file
		lst.add(new Employee(15,"Sejal","UX",50000));
		try(BufferedWriter bw1 = new BufferedWriter(new FileWriter(f))){
			
			for(Employee e : lst) {
				String s = "\n" + e.getId() + "," + e.getName() + "," + e.getDesg() + "," + e.getSal();
				bw1.write(s);
			}
			System.out.println("Data added successfully");
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
