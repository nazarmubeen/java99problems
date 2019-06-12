package com.java.basics;

public class TestPackage {

	private int field=10;
	public static void main(String[] args)
	{
		TestPackage t=new TestPackage();
		InnerTest i=t.new InnerTest();
		i.printValue();
	}
	
	class InnerTest{
		
		void printValue(){
		System.out.println(field);}
	}
}
