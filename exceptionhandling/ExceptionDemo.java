package com.cts.exceptionhandling;

public class ExceptionDemo {

	static void sum(int x, int y) throws MyException
	{
		
		if(x < 0)
			throw new MyException(x);
		
		else
			System.out.println("Addition is "+(x+y));
		
		
	}
	public static void main(String[] args) {


		try
		{
		sum(-10,5);
		}
		catch(MyException e)
		{
			System.out.println("Error Caught by :"+e);
		}
	}

}
