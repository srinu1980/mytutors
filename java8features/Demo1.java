package com.cts.java8features;

import java.util.concurrent.Callable;

@FunctionalInterface
interface I
{
	//void greeting(String str);
	
	int add(int x, int  y);
}


public class Demo1 
{

	public static void main(String[] args) 
	{
/*
		I interf= (msg) ->	System.out.println("Good Morning to All !"+msg);
		interf.greeting("Cognizant");
		*/

		I ref=(a,b) ->  a+b;
		
		System.out.println("Addition is :"+ref.add(20,5));
		
	}

}
