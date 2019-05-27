package com.java.basics;

public class Initialization {

	{
		System.out.println(" block ");
	}
	
	static {
		System.out.println(" static");
		
	}
	
	public Initialization() {
		// TODO Auto-generated constructor stub
	System.out.println(" constructor");
	}
	
	public Initialization(String name){
		System.out.println(" name constructor");
	}
	
	public static void main(String[] args)
	{
		Initialization obj=new Initialization();
		
		//named param
		System.out.println(" ** with param **");
		Initialization objparam=new Initialization(" name ");
	}
}
