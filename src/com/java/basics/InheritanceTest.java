package com.java.basics;

public class InheritanceTest {

	public static void main(String[] args)
	{
		A a=new A();
		
		System.out.println(" ******** ");
	//	B ba=(B) new A(); java.lang.ClassCastException
		B b=new B();
		System.out.println(" ******** ");
		A ab=new B();
		System.out.println(" a = "+ab.a);
		ab.parent();
		B ba=new B();
		System.out.println(" a = "+ba.a);
		ba.parent();
		System.out.println(" ******** ");
		C c=new C();
		System.out.println(" ******** ");
	//	C ca =(C)a; // java.lang.ClassCastException:  exception
		A ac=new C();
		System.out.println(" ******** ");
	//	String x=(String)ab;  compilation error
		Object x=(Object)ab;
		System.out.println(" ******** ");
		A ac1=(A)c;
		System.out.println(" ******** ");
		Aabs absobj=new Aabs();
		System.out.println(" ******** ");
		//AbsClass obj=new AbsClass(); //compilation error
	}
	
	
}
interface Intface {
	
}

class A implements Intface{
	
	int a=10;
	public A(){
		System.out.println(" this is A");
	}
	
	void parent()
	{
		System.out.println(" i am parent");
	}
}

class B extends A{
	int a =20;
	public B(){
		System.out.println(" this is B");
	}
	
	void parent()
	{
		System.out.println(" i am child");
	}
}

class C extends B{
	public C(){
		System.out.println(" this is C");
	}
}

class D extends A {
	public D(){
		System.out.println(" this is C");
	}
}

abstract class AbsClass{
	public AbsClass(){
		System.out.println(" this is AbsClass");
	}
}

class Aabs extends AbsClass{
	public Aabs(){
		System.out.println(" this is Aabs");
	}
}
