package com.java.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CompratorTest {

	public static void main(String[] args)
	{
		MyName obj1=new MyName();
		obj1.age=12;
		obj1.name="first";
		
		MyName obj2=new MyName();
		obj2.age=22;
		obj2.name="second";
		List<MyName> names=new ArrayList<MyName>();
		names.add(obj2);
		names.add(obj1);
		System.out.println(names);

		Collections.sort(names);
		System.out.println(names);
		NameComparator c=new NameComparator();
		Collections.sort(names,c);
		System.out.println(names);
		
	}
	
	
}

class MyName implements Comparable<MyName>{
	String name;
	int age;


	@Override
	public String toString() {
		return "MyName [name=" + name + ", age=" + age + "]";
	}


	@Override
	public int compareTo(MyName cobj) {
		return this.age-cobj.age;
	}
	

	
	
	
}

class NameComparator implements Comparator<MyName>{

	@Override
	public int compare(MyName o1, MyName o2) {
		return o2.name.length()-o1.name.length();
	}
	
}
