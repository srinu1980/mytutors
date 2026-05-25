package com.cts.oops;

//Constructor overloading

public class Student
{

	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Student()
	{
	
		id=11;
		name="Mahesh";
		System.out.println("Non parametarized constructor called....");
	}
	
	public Student(int id, String name)
	{
		this.id=id;
		this.name=name;
		
		System.out.println("Parametarized constructor called...");
	}
	
	

	
	
	
	
	
}
