package com.cts.java17;

import java.util.ArrayList;

public class PatternMatching {
	public static String getObjectType(Object obj) 
	{
	    return switch (obj) {
	        case Integer i -> "It's an Integer: " + i;
	        case String s -> "It's a String: " + s;
	        case Double d -> "It's a Double: " + d;
	        case null -> "It's null";
	        default -> "It's something else";
	    };
	}

	public static void main(String[] args) {
	    System.out.println(getObjectType(42));
	    System.out.println(getObjectType("Hello"));
	    System.out.println(getObjectType(3.14));
	    System.out.println(getObjectType(null));
	    System.out.println(getObjectType(new ArrayList<>()));
	}
}
