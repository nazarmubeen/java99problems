package com.java.concepts.eight;

import java.io.File;
import java.util.Arrays;

public class SimplLambdaTest {

	public static void main(String[] args)
	{
		File directory = new File("./src/main/java");
		String[] names = directory.list((dir, name) -> name.endsWith(".java")); 
		   System.out.println(Arrays.asList(names));
		}
	}

