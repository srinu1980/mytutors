package com.cts.exceptinhandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) throws IOException, ArithmeticException, NullPointerException {

		Scanner sc = new Scanner(System.in);

		FileReader fr = new FileReader("sample.txt");

		System.out.println(fr.read());

		int a, b;

		// a = 10;
		// b = 0;
		String s = "cognizant";
		try {

			// s = null;

			System.out.println(s);
			System.out.println("String Length :" + s.length());

			System.out.println("Enter a, b values ");
			a = sc.nextInt();
			b = sc.nextInt();

			System.out.println("Division is  :" + (a / b));

		}

		catch (Exception ee) {
			System.out.println("Errror :" + ee);
			throw new ArithmeticException("Divided by Zero");

			// throw ee;

		} finally {
			System.out.println("Program execution is completed...");
		}

		/*
		 * catch (ArithmeticException e) { System.err.println("Error : Divided by Zero "
		 * + e.getMessage()); } catch (InputMismatchException e2) {
		 * System.out.println("Error :" + e2); }
		 * 
		 * catch (NullPointerException e3) {
		 * System.err.println("Error :String contains Null value"); }
		 */
	}

}
