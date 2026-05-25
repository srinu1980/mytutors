package com.cts.oops;

public class MainApp {

	public static void main(String[] args) {


		Student s1=new Student();
		System.out.println(s1.getId()+"  "+s1.getName());
		
		
		Student s2=new Student(100,"Rahul");
			
		System.out.println(s2.getId()+"  "+s2.getName());
		
		

	}

}
