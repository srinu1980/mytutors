package sample;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args)
	{

		//To initialize an array
		
		//int []marks= {30,50,70,65,75};
		
		int []marks=new int[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 5 marks one by one ");
		for(int i=0;i<5;i++)
		{
			marks[i]=sc.nextInt();	
		}
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		//System.out.println(marks[5]); //ouput :error :
		
		System.out.println("Using for loop array elements are ");
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		
		// enhanced for loop  (for each loop)
		/*
		  for(datatype variablename : arrayname/collectionname)
		  {
		  
		 	}
		
		*/
		System.out.println("Using enhanced for loop marks are ");
		
		for(int x : marks)
		{
			System.out.println(x);
		}
		
	}

}
