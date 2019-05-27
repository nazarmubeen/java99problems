package com.java.basics;

public class PassByRefrence {

	public static void main(String[] args)
	{
		String current="ABCD";
		replaceString(current);
		System.out.println(current);
	}
	
	static void replaceString(String s)
	{
		s.replace("A", "newA");
		System.out.println(s);
	}
}
