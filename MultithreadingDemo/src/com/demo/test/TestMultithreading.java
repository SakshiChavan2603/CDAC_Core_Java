package com.demo.test;
import com.demo.beans.*;
import com.demo.threads.*;

public class TestMultithreading {

	public static void main(String[] args) {
		Myclass obj = new Myclass();
		
		MyFactorialThread th1 = new MyFactorialThread(obj,6);
		th1.start();
		
		MyPrintTableThread th2 = new MyPrintTableThread(6,obj);
		th2.start();
		
		MyCheckPrimeThread th3 = new MyCheckPrimeThread(obj,6);
		Thread th = new Thread(th3);
		th.start();
		
		try {
			th1.join();
			th2.join();
			th.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
