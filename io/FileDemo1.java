package com.cts.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) 
	{

		File f=null;
		FileWriter fw=null;
		try
		{
		 f=new File("Hello.txt");
		
		 fw=new FileWriter(f);

	fw.write("Welcome to Learn io Package!");
	System.out.println("File created successfully....");
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
		
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
		
	}

}
