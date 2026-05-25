package com.cts.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();

		System.out.println(al);
		System.out.println("ArrayList size  :" + al.size());

		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");

		System.out.println(al);
		System.out.println("ArrayList size  :" + al.size());

		al.remove("C");
		al.remove(1);
		System.out.println(al);
		System.out.println("ArrayList size  :" + al.size());

		al.set(1, "Cognizant");
		System.out.println(al);

		System.out.println(al.get(10));
	}

}
