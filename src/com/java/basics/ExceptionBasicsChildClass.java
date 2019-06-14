package com.java.basics;

public class ExceptionBasicsChildClass extends ExceptionBasics{

	ExceptionBasicsChildClass(){
		System.out.println(" this is child class");
	}
	@Override
	void thowCheckedException(){
		
		System.out.println(" this is child exception");
	}
}
