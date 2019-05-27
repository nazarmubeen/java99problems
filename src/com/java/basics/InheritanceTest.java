package com.java.basics;

public class InheritanceTest {

	public static void main(String[] args)
	{
		A a=new A();
	//	B ba=(B) new A(); java.lang.ClassCastException
		B b=new B();
		A ab=new B();
		C c=new C();
	//	C ca =(C)a; // java.lang.ClassCastException:  exception
		A ac=new C();
	//	String x=(String)ab;  compilation error
		Object x=(Object)ab;
		A ac1=(A)c;
		
		Aabs absobj=new Aabs();
		
		AbsClass obj=new AbsClass(); //compilation error
	}
	
	
}
interface Intface {
	
}

class A implements Intface{
	
}

class B extends A{
	
}

class C extends B{
	
}

class D extends A {
	
}

abstract class AbsClass{
	
}

class Aabs extends AbsClass{
	
}
