package com.cts.poly;

//Method Overloading

class Overloading {
	private int a, b, c, s;

	public void add() {
		a = 10;
		b = 20;
		c = 30;
		s = a + b + c;
		System.out.println("Sum of without passing parameters " + a + " +" + b + " +" + c + " =" + s);
	}

	public void add(int x) {
		a = x;
		b = 2;
		c = 3;
		s = a + b + c;
		System.out.println("Sum of passing 1 parameters " + a + " +" + b + " +" + c + " =" + s);
	}

	public void add(int x, int y) {
		a = x;
		b = y;
		c = 12;
		s = a + b + c;
		System.out.println("Sum of passing 2 parameters " + a + " +" + b + " +" + c + " =" + s);
	}

	public void add(int x, int y, int z) {
		a = x;
		b = y;
		c = z;
		s = a + b + c;
		System.out.println("Sum of passing 3 parameters " + a + " +" + b + " +" + c + " =" + s);
	}

}

public class OverloadingDemo {

	public static void main(String[] args) {

		Overloading ob = new Overloading();
		ob.add();
		ob.add(6);
		ob.add(2, 6);
		ob.add(65, 7, 8);
	}

}
