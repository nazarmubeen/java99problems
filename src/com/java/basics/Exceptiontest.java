package com.java.basics;

public class Exceptiontest {

	public static void main(String[] args)
	{
		TestException t=new Exceptiontest().new TestException();
		t.Exception();
		//t.Nullpointer();
	}
	
	
	
	
	class TestException{
		
		public void Exception(){
			classCastException();
			
		}
		
		public void classCastException() throws ClassCastException{
			
			System.out.println("this is ClassCastException");
		}
		
		public void Nullpointer(){
			throw new NullPointerException();
		}
	}
}
