package com.java.basics;

public class TestBasics {

	void printValue()
	{
		System.out.println(" this is parent class");
	}
	
	class TestBasic2 extends TestBasics{
		
		void printValue()
		{
			System.out.println(" this is child class");
		}
		
	}
	
	public static void main(String[] args)
	{
		TestBasics t=new TestBasics();
		TestBasic2 b=t.new TestBasic2();
		b.printValue();
		t=b;
		t.printValue();
		
	}
}
