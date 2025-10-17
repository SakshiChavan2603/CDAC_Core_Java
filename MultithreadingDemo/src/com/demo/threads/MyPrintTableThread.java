package com.demo.threads;

import com.demo.beans.Myclass;

public class MyPrintTableThread extends Thread{
	private int n;
	private Myclass obj;
	
	public MyPrintTableThread(int n, Myclass obj) {
		super();
		this.n = n;
		this.obj = obj;
	}
	
	public void run() {
		obj.printTable(n);
	}
	
}
