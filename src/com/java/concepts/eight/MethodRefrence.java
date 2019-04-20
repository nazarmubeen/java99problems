package com.java.concepts.eight;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodRefrence {

	public static void main(String[] args)
	{
		//using lambda function
		Stream.of(1,2,5,6,7,8,9,0).forEach(x-> System.out.println(x));
		
		//using method reference
		Stream.of(3, 1, 4, 1, 5, 9)
        .forEach(System.out::println); 
		
		//assigning method reference
		Consumer<Integer> printer = System.out::println;
		Stream.of(3, 1, 4, 1, 5, 9)
		        .forEach(printer);
		
		Stream.generate(Math::random)          
        .limit(10)
        .forEach(System.out::println);
		
		// Invoking a multiple-argument instance method from a class reference
		
		List<String> strings =
			    Arrays.asList("this", "is", "a", "list", "of", "strings");
		
		List<String> sorted=strings.stream().
				sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		
		List<String> sortedDirect = strings.stream()
		        .sorted(String::compareTo)        
		        .collect(Collectors.toList());
		//Invoking the length method on String using a method reference
		
		String test="testname";
		
		Stream.of("this", "is", "a", "stream", "of", "strings").
		map(String::length).forEach(System.out::println);
	}
}
