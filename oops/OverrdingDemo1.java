package com.cts.oops;
/*
 * 
 * Overrding
 * ============
 * 	Base class members again redefined in derived classes, i.e called overrding
 * 
 * super keyword
 * ================
 * super keyword is used to refers base class variables, methods and constructors in derived classes 
 * whenever overriden in derived classes.
 * 
 * So by using super keyword we can refers base class members 
 * 
 */
class Base
{
	
	int i;
	
	Base(int x)
	{
		System.out.println("Base class Constructor");
	}
}

class Derived extends Base
{
	int i;
	
	public Derived(int x,int y)
	{
		
		super(111);  //invoke Base class constructor
		
		super.i=x;
		i=y;
		
	}
	
	void display()
	{
		System.out.println("Base i  ="+super.i+" Derived i  ="+i);
	}
}

public class OverrdingDemo1 {

	public static void main(String[] args) {


		Derived ob=new Derived(10,33);
		
		ob.display();
	
	}

}
