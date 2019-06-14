package com.java.basics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionBasics {

	public static void main(String[] args)
	{
		ExceptionBasicsChildClass e=new ExceptionBasicsChildClass();
		e.thowCheckedException();
		
		ExceptionBasics c=new ExceptionBasicsChildClass();
		try {
			c.thowCheckedException();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	void thowCheckedException() throws IOException{
		
		FileWriter w=new FileWriter(new File(""));
		
	}
	
}
