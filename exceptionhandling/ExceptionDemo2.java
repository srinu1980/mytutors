package com.cts.exceptionhandling;

import java.sql.SQLException;

public class ExceptionDemo2 {

	 static void avg() throws SQLException 
	{
		
		throw new ArithmeticException("Divided By Zero Exception !");
	}

	public static void main(String[] args) throws SQLException  
	{

		
		avg();

		
	}

}
