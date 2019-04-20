package com.java.concepts.eight.defaultMthods;

public class RealEmployee implements Employee {

	@Override
	public void employeeName() {
		System.out.println(" i am employee");

	}

	/*
	 * @Override public void companyName(){ System.out.println(" hhahahah "); }
	 */

	public static void main(String[] args) {
		RealEmployee r = new RealEmployee();
		r.employeeName();
		r.companyName();

	}
}
