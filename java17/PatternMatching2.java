package com.cts.java17;

public class PatternMatching2 {

	public static String categorizeNumber(Object obj) {
	    return switch (obj) {
	        case Integer i when i < 0 -> "Negative integer";
	        case Integer i when i > 0 -> "Positive integer";
	        case Integer i -> "Zero";
	        case Double d when d < 0 -> "Negative double";
	        case Double d when d > 0 -> "Positive double";
	        case Double d -> "Zero double";
	        default -> "Not a number";
	    };
	}

	public static void main(String[] args) {
	    System.out.println(categorizeNumber(-5));
	    System.out.println(categorizeNumber(0));
	    System.out.println(categorizeNumber(3.14));
	    System.out.println(categorizeNumber("42"));
	}
}
