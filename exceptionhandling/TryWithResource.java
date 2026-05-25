package com.cts.exceptionhandling;
import java.io.*;;

public class TryWithResource {

	public static void main(String[] args)
	{
	      try(FileReader fr = new FileReader("src/com/cts/exceptionhandling/ExceptionDemo.java"))
	      {
	    	  char [] a = new char[500];
	          
	    	  fr.read(a);   // reads the contentto the array
	          
	    	  for(char c : a)
	          
	    		  System.out.print(c);   // prints the characters one by one
	       }
	      catch (IOException e)
	      {
	       System.out.println("Error :"+e);
	       }

	}
	
}
