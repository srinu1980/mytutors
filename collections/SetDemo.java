package com.cts.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {


		//HashSet<String> s1=new HashSet<String>();
		//TreeSet<String> s1=new TreeSet<String>();
		LinkedHashSet<String> s1=new LinkedHashSet<>();
		//List<String> s1=new ArrayList<>();
		
		s1.add("A");
		s1.add("X");
		s1.add("M");
		s1.add("B");
		s1.add("Z");
		s1.add("C");
		
		s1.add("Y");
		s1.add("M");
		s1.add("B");
		s1.add("Z");
		s1.add("C");
		
		s1.add("M");
		s1.add("B");
		s1.add("Z");
		s1.add("C");
		
		System.out.println("LinkedHashSet elements are :"+s1);
		
		
		
		
	}

}
