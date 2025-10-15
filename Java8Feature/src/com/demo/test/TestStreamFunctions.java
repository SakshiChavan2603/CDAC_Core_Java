package com.demo.test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestStreamFunctions {
	public static void main(String[] args) {
		List<Integer> list = List.of(67,8,46,5,6,10,25,68);
		
		//maximum
		Optional<Integer> maxnum = list.stream().max(Integer::compare);
		System.out.println("Maximum = " + maxnum);
		
		//minimum
		Optional<Integer> minnum = list.stream().min(Integer::compare);
		System.out.println("Minimum = " + minnum);
		
		//max odd
		Optional<Integer> maxodd = list.stream()
									   .filter(e->e%2!=0)
									   .max(Integer::compare);
		System.out.println("Maximum odd no :" + maxodd);
		
		//first number which is grater than 5
		Optional<Integer> num = list.stream().filter(e->e>5).findFirst();
		System.out.println(num);
		if(num.isPresent()) {
			System.out.println("First no which is grater than 5 "+num.get());
		}
		
		//find list of squares of all numbers
		List<Integer> list1 = list.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println(list1);
		
		//allMatch()
		boolean status = list.stream().allMatch(e-> { return e>4;});
		System.out.println(status);
		status = list.stream().allMatch(e-> { return e>10;});
		System.out.println(status);
		
		//noneMatch()
		status = list.stream().noneMatch(e->{return e>100;});
		System.out.println(status);
		status = list.stream().noneMatch(e->{return e>10;});
		System.out.println(status);
		
		//anyMatch()
		status = list.stream().anyMatch(e->{return e>10;});
		System.out.println(status);
		status = list.stream().anyMatch(e->{return e<1;});
		System.out.println(status);
		
		List<String> strList = List.of("Hello","Welcome","Testing","Check","Happy");
		
		Optional<String> op = strList.stream().reduce((acc, str)->acc.length()>str.length()?acc:str);
		System.out.println(op);
	}
}
