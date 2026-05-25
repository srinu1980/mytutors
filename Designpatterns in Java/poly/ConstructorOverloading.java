package com.cts.poly;

class BoxDemo {
	private double width, height, depth;

	public BoxDemo() {

		width = 4.2;
		height = 1.5;
		depth = 5.1;
		System.out.println("Non parametarized constructor called...");
	}

	public BoxDemo(double width) {
		super();
		this.width = width;
		height = 6;
		depth = 8;
	}

	public BoxDemo(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public BoxDemo(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	void disp() {
		System.out.println("width :" + width + " height :" + height + " depth : " + depth);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {

		BoxDemo ob1 = new BoxDemo();
		BoxDemo ob2 = new BoxDemo(3);
		BoxDemo ob3 = new BoxDemo(3, 7);
		BoxDemo ob4 = new BoxDemo(4, 7, 9);

		ob1.disp();
		ob2.disp();
		ob3.disp();
		ob4.disp();
	}

}
