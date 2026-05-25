package com.cts.exceptionhandling;

//Custom Exception

public class MyException extends RuntimeException
{

	private int ex;
	
	public MyException(int s)
	{
	
		ex=s;
	}
	
	public String toString()
	{
		return "My Exception ["+ex+"] is less than zero";
	}
	
}
