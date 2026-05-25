package com.cts.java17;

public class TextBlocksExample {
 
	public static void main(String[] args) 
	{
        String longText = """
            This is a text block in Java 17.
            It allows you to write multi-line strings
            without needing to escape newline characters.\n
            
            You can also preserve leading whitespace for formatting.
            \tIndented text is also preserved.
           
            """;

        String json = "{\n" +" \"name\": \"Surya\",\n" +" \"age\": 25,\n" +" \"city\": \"New York\"\n" +"}";

        System.out.println(longText);
        System.out.println(json);
    }
}