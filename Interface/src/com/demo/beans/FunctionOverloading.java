package com.demo.beans;

public class FunctionOverloading {
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b,int c) {
		return a+b+c;
	}
	
	public float add(float a, int b) {
		return a+b;
	}
	
	public double add(float a, double b) {
		return a+b;
	}
}
