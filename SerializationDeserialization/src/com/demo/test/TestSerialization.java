package com.demo.test;
import com.demo.beans.*;
import java.util.*;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class TestSerialization {

	public static void main(String[] args) {
		List<Employee> lst = new ArrayList<>();
		lst.add(new Employee(11,"Ashutosh","AI",56247));
		lst.add(new Employee(12,"Pranav","Manager",56547));
		lst.add(new Employee(13,"Shreya","Assistant",44347));
		
		//write data into the file
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Emp.txt"));){
			
			for(Employee e : lst) {
				oos.writeObject(e);
			}
			System.out.println("added successfully");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		//read data from file
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Emp.txt"))){
			
			while(true) {
				Employee emp = (Employee) ois.readObject();
				System.out.println(emp);
			}
		}catch(EOFException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
