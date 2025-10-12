package com.demo.beans;

import com.demo.interfaces.Interface1;
import com.demo.interfaces.Interface2;

public class MyClass implements Interface1, Interface2 {
	
	public void m() {
		System.out.println("in m myclass");
	}

	@Override
	public int m2(int x) {
		System.out.println("In m2 method I2");
		return 0;
	}

	@Override
	public void m3() {
		System.out.println("In m3 method I2");
		
	}

	@Override
	public void m1() {
		System.out.println("In m1 method I1");
		
	}

	@Override
	public void m2() {
		System.out.println("In m2 method I1");
	}
	
}
