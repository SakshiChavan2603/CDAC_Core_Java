package com.demo.test;
import java.util.*;

import com.demo.exceptions.NegativeSalaryException;

public class TestPerson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			try {
				System.out.println("Enter salary");
				double sal = sc.nextDouble();
				if(sal<0) {
					throw new NegativeSalaryException("Salary can't be -ve");
				}else if(sal<2000) {
					throw new NegativeSalaryException("Salary must be greater than 2000");
				}
				System.out.println("Salary: " + sal);
				
			}catch(NegativeSalaryException e) {
				System.out.println(e.getMessage());
			}
		}
		sc.close();
	}

}
