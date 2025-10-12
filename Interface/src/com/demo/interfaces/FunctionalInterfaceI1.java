package com.demo.interfaces;

public interface FunctionalInterfaceI1 {
	int m1();
	
	default void m2() {
		System.out.println("In m2 of fun interface");
	}
}
