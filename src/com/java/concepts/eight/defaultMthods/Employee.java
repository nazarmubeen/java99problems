package com.java.concepts.eight.defaultMthods;

public interface Employee {

	default void companyName(){
		System.out.println(" Test Pvt Ltd");
	}
	
	void employeeName();
}
