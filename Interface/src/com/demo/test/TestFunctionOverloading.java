package com.demo.test;
import com.demo.beans.*;

public class TestFunctionOverloading {
	public static void main(String[] args) {
		FunctionOverloading obj = new FunctionOverloading();
		System.out.println(obj.add(1, 2));
		System.out.println(obj.add(1, 2, 3));
		System.out.println(obj.add(1.2f, 5));
		System.out.println(obj.add(1.2f, 5.0));

	}
}
