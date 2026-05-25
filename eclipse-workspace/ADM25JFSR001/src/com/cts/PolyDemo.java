package com.cts;

class BaseClass {
	void show() {
		System.out.println("Base class show");
	}

	void disp() {
		System.out.println("Base class disp");
	}
}

class DeriveClass extends BaseClass {
	void show() {
		super.show();
		System.out.println("Derive class show");
	}

	void disp() {
		System.out.println("Derive class disp");
		super.disp();
	}
}

public class PolyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeriveClass obj = new DeriveClass();

		obj.show();
		obj.disp();
	}

}
