package com.cts.exceptinhandling;

public class ThrowDemo {

	public static void avg() {

		try {

			throw new ArithmeticException("Error occured in avg()");

		} catch (ArithmeticException e) {
			throw e;
			// System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			avg();
		} catch (ArithmeticException e) {
			System.err.print("Caught the Error :" + e.getMessage());
		}
	}

}
