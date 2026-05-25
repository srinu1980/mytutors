package com.cts.exceptinhandling;

public class MainClass {

	public static void sum(int a, int b) throws MyException {
		if (a < 0)
			throw new MyException(a);
	}

	public static void main(String[] args) {

		try {
			sum(-10, 20);
		} catch (MyException e) {
			System.out.println(e);
		}
	}

}
