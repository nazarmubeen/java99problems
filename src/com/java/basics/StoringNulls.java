package com.java.basics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class StoringNulls {

	public static void main(String[] args)
	{
		//only in treeset we can't add null
		LinkedList list=new LinkedList();
	//	TreeSet t=new TreeSet();
		Set s=new HashSet();
		HashMap map=new HashMap();
		
		list.add(null);
		//t.add(null);
		s.add(null);
		map.put(null, null);
	}
}
