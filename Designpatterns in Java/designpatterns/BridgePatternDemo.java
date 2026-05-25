package com.cts.designpatterns;

//Step 1: Create the Color interface (Implementor)
interface Color {
	void applyColor();
}

//Step 2: Implement the Color interface
class Red implements Color {
	public void applyColor() {
		System.out.println("Applying red color");
	}
}

class Blue implements Color {
	public void applyColor() {
		System.out.println("Applying blue color");
	}
}

//Step 3: Create the Shape abstraction
abstract class Shape {
	protected Color color;

	public Shape(Color color) {
		this.color = color;
	}

	abstract void draw();
}

//Step 4: Implement the Shape abstraction
class Circle extends Shape {
	public Circle(Color color) {
		super(color);
	}

	public void draw() {
		System.out.print("Drawing Circle in ");
		color.applyColor();
	}
}

class Square extends Shape {
	public Square(Color color) {
		super(color);
	}

	public void draw() {
		System.out.print("Drawing Square in ");
		color.applyColor();
	}
}

//Step 5: Demonstrate the Bridge Design Pattern
public class BridgePatternDemo {
	public static void main(String[] args) {
		Shape redCircle = new Circle(new Red());
		Shape blueSquare = new Square(new Blue());

		redCircle.draw();
		blueSquare.draw();
	}
}
