package com.demo.beans;
import com.demo.interfaces.FunctionalInterfaceI1;

public class FuncInterfaceClass implements FunctionalInterfaceI1{

	@Override
	public int m1() {
		System.out.println("In m1");
		return 0;
	}
	
}
