package com.java.concepts.eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReference {

	
	public static void main(String[] args)
	{
		
		List<String> names =
			    Arrays.asList("Grace Hopper", "Barbara Liskov", "Ada Lovelace",
			        "Karen Spärck Jones");
		
		List<Person> people = names.stream()
			    .map(name -> new Person(name))
			    .collect(Collectors.toList());
		// or, alternatively,

		 people = names.stream()
		    .map(Person::new)      
		    .collect(Collectors.toList());
		System.out.println(people);
	}
}
