package com.demo.threads;

import com.demo.beans.Myclass;

public class MyCheckPrimeThread implements Runnable{
	private Myclass obj;
	private int n;
	
	
	public MyCheckPrimeThread(Myclass obj, int n) {
		super();
		this.obj = obj;
		this.n = n;
	}

	@Override
	public void run() {
		boolean status = obj.checkPrime(n);
		if(status) {
			System.out.println("it is prime");
		}else {
			System.out.println("not prime");
		}
	}
	
}
