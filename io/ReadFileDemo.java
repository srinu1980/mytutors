package com.cts.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) throws IOException{

		FileReader fr=new FileReader("Hello.txt");
		int ch;
		while((ch=fr.read())!=-1)
		{
			System.out.print((char)ch);
		}
		/*
		 * ASCII  -> American Standard Code for Impormation Interchange
		 * A  - Z  => 65 to 90
		 * a  - z  => 97 to 122
		 * 0 - 9   -> 48 to 57  
		 */
	}

}
