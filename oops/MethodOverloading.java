package com.cts.oops;

//Method Overloading

class OverloadDemo
{

	private int x,y,z,s;
	
	
	public void add()
	{
		x=10;
		y=20;
		z=30;
		s=x+y+z;
		
		System.out.println("Sum of without Passing args "+x+" + "+y+" + "+z+" ="+s);
		
	}

	public void add(int x)
	{
		this.x=x;
		y=2;
		z=3;
		s=x+y+z;
		
		System.out.println("Sum of Passing 1 args "+x+" + "+y+" + "+z+" ="+s);
		
	}
	

	public void add(int x, int y)
	{
		this.x=x;
		this.y=y;
		z=15;
		
		s=x+y+z;
		
		System.out.println("Sum of Passing 2 args "+x+" + "+y+" + "+z+" ="+s);
		
	}

	public void add(int x, int y, int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
		
		s=x+y+z;
		
		System.out.println("Sum of Passing 3 args "+x+" + "+y+" + "+z+" ="+s);
		
	}
	
}


public class MethodOverloading
{
	
	public static void main(String[] args) {

		OverloadDemo ob=new OverloadDemo();
		
		ob.add();
		ob.add(222);
		ob.add(4, 6);
		ob.add(6, 7, 8);
	}

}
