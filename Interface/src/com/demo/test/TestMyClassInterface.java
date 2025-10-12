package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.interfaces.Interface1;
import com.demo.interfaces.Interface2;

public class TestMyClassInterface {
	public static void main(String[] args) {
		MyClass obj1 = new MyClass();
		obj1.m();
		obj1.m1();
		obj1.m2();
		obj1.m2(0);
		obj1.m3();
		Interface1 i1 = new MyClass();
		i1.m1();
		i1.m2();
		((MyClass) i1).m3();
		
		Interface2 i2 = new MyClass();
		i2.m2(0);
		i2.m3();
		((MyClass) i2).m1();
	}
	
	
}
