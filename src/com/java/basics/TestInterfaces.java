package com.java.basics;

public class TestInterfaces {

	public static void main(String[] args)
	{
		Testing t= new TestInterfaces().new Testing();
		t.setClass();
		t.setMyName();
		t.testInterface();
		t.testClass();
		t.testName();
	}
	
	public interface TestI{
		int a=0;
		void testName();
	}
	
	public interface TestI2 extends TestI{
		int a=3;
		void testClass();
		
		default void testInterface(){
			System.out.println(" yo yo defaulkt method");
			System.out.println("a = "+a);
		}
	}
	
	public abstract class TestAbs{
		int a=5;
		void setMyName() {
		System.out.println(" this is abstract setNamae");
		System.out.println("a = "+a);
		}
		
		abstract void setClass();
		
	}
	
	class Testing extends TestAbs implements TestI,TestI2{
		@Override
		public void testClass() {
			System.out.println(" class test method");
			System.out.println("a = "+super.a);
		}

		@Override
		public void testName() {
			System.out.println(" class test name");
			
		}

		@Override
		void setClass() {
			System.out.println(" class set class");
			
		}
		
		
	}
}





