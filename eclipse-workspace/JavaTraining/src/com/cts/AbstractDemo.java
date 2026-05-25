package com.cts;

abstract class Demo {
	abstract void display(); // abstract method

	void show() // concrete method //with body
	{
		System.out.println("This is concrete method");
	}

}

public class AbstractDemo extends Demo {

	public static void main(String[] args) {

		// Demo ob=new Demo(); error : we can't instantiate

		AbstractDemo ob = new AbstractDemo();

		ob.display();
		ob.show();

	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("This is abstract method");
	}

}
