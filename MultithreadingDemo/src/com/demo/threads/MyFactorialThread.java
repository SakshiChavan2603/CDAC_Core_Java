package com.demo.threads;

import com.demo.beans.Myclass;

public class MyFactorialThread extends Thread{
	private int n;
	private Myclass obj;
	
	public MyFactorialThread(Myclass obj, int i) {
		super();
		this.obj = obj;
		this.n = i;
	}
	
	public void run() {
		int fact = obj.factorial(n);
		System.out.println("Factorial"+fact);
	}
	
}
