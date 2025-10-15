package com.demo.beans;
import java.util.*;
import com.demo.exceptions.WrongNumberException;

public class TestGuessNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("Enter Number : ");
				int num = sc.nextInt();
				int n =45;
					if(n < num) {
						throw new WrongNumberException("Enter smaller number!");
					} else if(n > num) {
						throw new WrongNumberException("Enter bigger number!");
					} else if(n == num) {
						System.out.println("Correct Guess!");
						break;
					}
			} catch(WrongNumberException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
