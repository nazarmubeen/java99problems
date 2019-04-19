package com.java.concepts.eight;

public class ThreadClass {

	public static void main (String[] args) throws InterruptedException
	{
		Runnable r=()->System.out.println(" this is runnable");
		
		Thread t=new Thread(r);
		t.start();
		t.interrupt();
		t.join();
		System.out.println(t.isAlive());
	}
}
