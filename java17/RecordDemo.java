package com.cts.java17;

 record Employee(String name, int age) {
    public String greet() {
        return "Hello, my name is " + name + " and I am " + age + " years old.";
    }
}
public class RecordDemo {
	public static void main(String[] args) {
		 Employee emp = new Employee("Rahul", 30);
	     System.out.println(emp.greet()); 

	}
	
}
