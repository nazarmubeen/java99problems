package com.oops.conceptdemo;

public class MyException extends Exception{
	
	public MyException(String message)
	{
		super(message);
	}
	
	public MyException()
	{
		this("default message");
	}


}
