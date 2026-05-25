package com.cts.solid.ocp;

public class Rectangle implements Shape {

	private double width, height;

	@Override
	public double calculateArea() {

		return width * height;
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
