package com.cts.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionDemo
{

	public static void main(String[] args)
	{
	
		ArrayList<String> al=new ArrayList<>();
		
		al.add("Anil");
		al.add("Mahesh");
		al.add("Sam");
		al.add("Anitha");
		al.add("Arun");
		
		//al.stream().forEach(System.out::println);
		
		//al.stream().filter(s ->s.startsWith("A")).forEach(System.out::println);
		
		//int count=(int) al.stream().filter(s ->s.startsWith("A")).count();
		
		//System.out.println("Number of Items start with A :"+count);
		
		long cnt=al.stream().filter(s->s.length()>5).count();
		
		System.out.println(cnt);
	
		
		
		List<String> names=Arrays.asList("ARun","Mahesh","Suresh","D");
		
		System.out.println("Using Lambda :");
		names.forEach(s->System.out.println(s)); //using Lambda Expression
		
		System.out.println("Using Method Reference :");
		
	List <String > asList=names.stream().
		filter(s ->s.length()>5).collect(Collectors.toList());
		
			
			//filter(s -> s.startsWith("M")).
		//forEach(System.out::println); //Method Reference
		
	System.out.println(asList);
	}
}
