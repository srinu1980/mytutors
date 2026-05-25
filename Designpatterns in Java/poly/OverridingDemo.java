package com.cts.poly;

class A // Base class //Super class// Parent
{

	void show() {
		System.out.println("Base class show()");
	}

	void disp() {
		System.out.println("Base class disp()");
	}

}

class B extends A // Derive / Sub / Child
{
	void show() {
		super.show(); // calling base class show()
		System.out.println("Derive class show()");
	}

	void disp() {
		super.disp();
		System.out.println("Derive class disp()");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B ob = new B();
		ob.show();
		ob.disp();
	}

}
