package com.demo.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.demo.beans.Employee;

public class EmployeeDaoImp implements EmployeeDao{
	static List<Employee> elist;
	static {
		elist = new ArrayList<>();
	}
	
	@Override
	public void readFile(String fname) {
		File f = new File(fname);
		System.out.println("Read file");
		if(f.exists()) {
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fname));){
				while(true) {
					
					Employee e =(Employee) ois.readObject();
					System.out.println(e);
					elist.add(e);
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
	
	@Override
	public boolean save(Employee e) {
		return elist.add(e);
	}

	@Override
	public boolean deleteById(int id) {
		return elist.remove(new Employee(id));
	}

	@Override
	public boolean modifyById(int id, double sal) {
		int pos = elist.indexOf(new Employee(id));
		if(pos!=-1) {
			elist.get(pos).setSal(sal);
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> dispalyAll() {
		return elist;
	}

	@Override
	public Employee displayById(int id) {
		int pos = elist.indexOf(new Employee(id));
		if(pos!=-1) {
			return elist.get(pos);
		}
		return null;
	}

	@Override
	public void writeFile(String fname) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname,true));){
			for(Employee e : elist) {
				oos.writeObject(e);
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

	

}
