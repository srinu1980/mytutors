package com.cts.oops;

import java.util.Scanner;

//Multi level Inheritance
class A
{

protected int x;

}

class B extends A
{

	protected int y;

}

class C extends B
{
	
	private int z;
	
	Scanner sc=new Scanner(System.in);

	void getData()
	{
		System.out.println("Enter x, y , z values");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		
	}
	
	void show()
	{
		System.out.println("x  ="+x+" y ="+y+" z ="+z);
	}
	
	
}


public class Inh1 {

	public static void main(String[] args) {

		C ob=new C();
		
		ob.getData();
		ob.show();

	}

}
