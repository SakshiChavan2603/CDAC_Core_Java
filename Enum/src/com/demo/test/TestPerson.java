package com.demo.test;

import com.demo.enums.Gender;
import com.demo.beans.Person;
import java.util.*;

public class TestPerson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p = new Person(12, "Sakshi", Gender.female);
		System.out.println(p);
		System.out.println(Gender.values()); // It returns address
		for(Gender g : Gender.values()) {
			System.out.println(g);
		}
		
		System.out.println("Enter Gender");
		String g = sc.next();
		Gender g1 = Gender.valueOf(g);
		Person p1 = new Person(13, "Yashoda", g1);
		System.out.println(p1);
	}

}
