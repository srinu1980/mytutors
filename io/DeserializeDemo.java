package com.cts.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub

		Student s=null;
		
		FileInputStream fis=new FileInputStream("stream.txt");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		s=(Student) ois.readObject();
		
		System.out.println("Sno  :"+s.getNo()+" Sname "+s.getName()+" Course  "+s.getCourse());
		
	}

}
