package com.cts;

public class BankDemo {

	public static void main(String[] args) {

		/*
		 * compile time polymorphism SBI sbi = new SBI();
		 * System.out.println("SBI rate of Interest  :" + sbi.rateOfInterest() + "%");
		 * HDFC hdfc = new HDFC(); System.out.println("HDFC rate of Interest  :" +
		 * hdfc.rateOfInterest() + "%"); ICICI icici = new ICICI();
		 * System.out.println("ICICI rate of Interest  :" + icici.rateOfInterest() +
		 * "%");
		 * 
		 */

		Bank b; // not used new keyword

		b = new SBI();
		System.out.println("SBI rate of Interest  :" + b.rateOfInterest() + "%");

		b = new HDFC();
		System.out.println("HDFC rate of Interest  :" + b.rateOfInterest() + "%");

		b = new ICICI();
		System.out.println("ICICI rate of Interest  :" + b.rateOfInterest() + "%");

	}

}
