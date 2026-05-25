package com.cts.solid.ocp;

public class Main {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle(4, 5);

		Shape circle = new Circle(3);

		AreaCalculator areaCalculator = new AreaCalculator();

		System.out.println("Rectangle Area " + areaCalculator.calculateArea(rectangle));
		System.out.println("Circle Area " + areaCalculator.calculateArea(circle));
	}

}
