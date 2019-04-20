package com.java.concepts.eight;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PrintCollectionElement {

	public static void main(String[] args)
	{
		//Printing the elements of a collection
		
		List<String> strings =  Arrays.asList("this", "is", "a", "list", "of", "strings");
		strings.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
			System.out.println(t);
				
			}
			
		});
		
		strings.forEach(s -> System.out.println(s));
		strings.forEach(System.out::println); 
		
	}
}
