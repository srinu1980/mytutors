package com.cts.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args)
	{

			//LinkedList<Student> al=new LinkedList<Student>();
			//List<Student> al=new ArrayList<>();
			List<Student> al=new LinkedList<>();
			
			Student s1=new Student(100,"Rahul");
			Student s2=new Student(200,"Dinesh");
		
			al.add(s1);
			al.add(s2);
			
			al.add(new Student(300,"Surya"));
			

			System.out.println(al);
			/*
			System.out.println("Student Details are ");
			for(Student s : al)
			{
				System.out.println(s.getSno()+"  "+s.getSname());
			}
			*/
			
			al.remove(1);

			System.out.println("After Remove 1st Index record");

			System.out.println(al);

			
	}

}
