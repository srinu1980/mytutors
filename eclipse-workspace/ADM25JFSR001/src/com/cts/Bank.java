package com.cts;

//@FunctionalInterface
public interface Bank {

	double rateOfInterest();

	double rateOfClac();

	default void show() {

	}

	static void print() {

	}
}
