package com.cts.poly;

interface I1 {

	void show();

	int mul();

	default void m1() {

	}

	static void m2() {

		System.out.println("Welcome");
	}
}

interface I2 extends I1 {

	void setData(int x, int y);

	int add();

	int sub();

}

public class InterfaceDemo implements I2 {

	int x, y;

	static void m2() {

		System.out.println("Hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceDemo ob = new InterfaceDemo();
		ob.setData(10, 5);
		ob.show();
		System.out.println("Addition is :" + ob.add());

		System.out.println("Subtraction is :" + ob.sub());

		System.out.println("Multiplication is :" + ob.mul());

	}

	@Override
	public void setData(int x, int y) {

		this.x = x;
		this.y = y;
	}

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	public int sub() {
		// TODO Auto-generated method stub
		return x - y;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(" x  =" + x + "\t y =" + y);
	}

	@Override
	public int mul() {
		// TODO Auto-generated method stub
		return x * y;
	}

}
