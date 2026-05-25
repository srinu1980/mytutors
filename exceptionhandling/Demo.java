package com.cts.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {


	public static void main(String[] args)   
	{
		Scanner sc=new Scanner(System.in);

		
		try
		{
			
		int a,b;
		int arr[]=new int[5];
		
		String str=null;
		
		
		System.out.println("Enter a, b values ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		int c=a/b;
		
		//System.out.println("String Length is  :"+str.length());
		
		System.out.println("20th array index element :"+arr[20]);
		
		System.out.println("a value ="+a+" \t b value ="+b);
		
		}
		
		catch(ArithmeticException e)
		{
			System.err.println("Error   :  "+e.getMessage());
		}
		catch(InputMismatchException e2)
		{
			System.err.println("Error : Enter only Integer values     "+e2.getMessage());
		}
		catch(NullPointerException e3)
		{
			System.err.println("Error 3 :"+e3.getMessage());
		}
		catch(Exception e)
		{
			System.err.println("Error  :"+e.getMessage());
		}
		
		finally
		{
			System.out.println("Program execution Completed....");
			sc.close();
			
		}
		
		
	}

}
