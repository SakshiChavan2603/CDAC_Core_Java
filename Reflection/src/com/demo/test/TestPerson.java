package com.demo.test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.demo.beans.Person;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person(10,20);
		Class cls = p.getClass();
		
		Constructor[] carr = cls.getConstructors();
		for(Constructor c:carr) {
			System.out.println(c);
			System.out.println(c.getName());
			System.out.println(c.getParameters());
		}
		
		Method[] marr = cls.getMethods();
		for(Method m : marr) {
			System.out.println(m.getName());
			System.out.println(m.getParameters());
			
			if(m.getName().equals("m12")) {
				try {
					m.invoke(p,12);
				}catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		
		Field[] farr=cls.getDeclaredFields();
		for(Field f:farr) {
			if(f.getName().equals("m1"))
				f.setAccessible(true);
			System.out.println(f.getName());
		}
		
		//to change value of private member in the class
		try {
			Field f=cls.getDeclaredField("n1");
			System.out.println("before changing");
			System.out.println(p);
			f.setAccessible(true);
			f.set(p,100);//ob.setN1(100)
			System.out.println("After changing");
			System.out.println(p);
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}
}
