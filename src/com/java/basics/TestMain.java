package com.java.basics;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestMain {

	public static void main(String[] args)
	{
		LinkedList<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Iterator<Integer> it=list.iterator();
		
		Collections.reverse(list);
		System.out.println(list);
		while(it.hasNext())
		{
			System.out.print(" "+it.next());
		}
		
	}
}
