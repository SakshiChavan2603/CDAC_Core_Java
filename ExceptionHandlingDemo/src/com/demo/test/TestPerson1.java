package com.demo.test;
import java.util.*;
import com.demo.service.EmployeeService;
import com.demo.exceptions.NegativeSalaryException;
public class TestPerson1 {

	public static void main(String[] args) {
		EmployeeService emp = new EmployeeService();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			try {
				System.out.println("Enetr salary");
				double sal = sc.nextDouble();
				if(sal<0) {
					throw new NegativeSalaryException("salary can't be -ve");
				}else if(sal<2000) {
					throw new NegativeSalaryException("Salary must be greater than 2000");
				}
				emp.acceptData(sal);
				System.out.println("Salary "+sal);
				
			}catch(NegativeSalaryException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
