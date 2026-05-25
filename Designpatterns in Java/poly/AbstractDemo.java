package com.cts.poly;

abstract class Shape {
	double area;

	void show() {
		System.out.println("Area  =" + area);
	}

	abstract void findArea();

}

class Circle extends Shape {

	int r;

	@Override
	void findArea() {
		// TODO Auto-generated method stub

		r = 5;
		area = Math.PI * r * r;
		show();

	}

}

class Rectangle extends Shape {
	int l, b;

	@Override
	void findArea() {
		// TODO Auto-generated method stub
		area = l * b;
		show();
	}

}

public class AbstractDemo {

	public static void main(String[] args) {

		/*
		 * Circle c = new Circle();
		 * 
		 * Rectangle r = new Rectangle();
		 * 
		 * c.findArea(); r.findArea();
		 */

		Shape s;
		s = new Circle();

		s.findArea();

		s = new Rectangle();
		s.findArea();
	}

}
