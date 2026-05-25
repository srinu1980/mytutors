package com.cts.java17;

public class OldSwitchExample 
{
	static void process(Object obj) 
	{
        if (obj instanceof Integer) 
        {
            Integer i = (Integer) obj; // Explicit casting needed
            System.out.println("Integer: " + (i * 2));
        } 
        else if (obj instanceof String) 
        {
            String s = (String) obj;
            System.out.println("String: " + s.toUpperCase());
        } 
        else if (obj instanceof Double) 
        {
            Double d = (Double) obj;
            System.out.println("Double: " + (d + 10.5));
        } else {
            System.out.println("Unknown type!");
        }
    }

    public static void main(String[] args) 
    {
        process(10);         // Integer: 20
        process("hello");    // String: HELLO
        process(5.5);        // Double: 16.0
    }
}
