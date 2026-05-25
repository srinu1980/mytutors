package com.cts.solid.ocp;

public class Circle implements Shape {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

}
