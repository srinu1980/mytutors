package com.cts.collection;

import java.util.LinkedList;

public class ArrayListDemo {

	public static void main(String[] args) {

		// ArrayList al=new ArrayList(); raw type object

		// ArrayList<String> al = new ArrayList<String>();

		LinkedList<String> al = new LinkedList<String>();
		System.out.println("ArrayList Size  :" + al.size());
		System.out.println("ArrayList is  :" + al);

		al.add("A");
		al.add("Hello");
		al.add("Cognizant");

		al.addFirst("First Element");
		al.addLast("End");

		System.out.println("ArrayList Size  :" + al.size());
		System.out.println("ArrayList is  :" + al);

		al.removeFirst();
		al.removeLast();
		al.add("A");
		System.out.println("ArrayList Size  :" + al.size());
		System.out.println("ArrayList is  :" + al);

		al.add(2, "Hai"); // insert
		System.out.println("ArrayList Size  :" + al.size());
		System.out.println("ArrayList is  :" + al);

		al.remove(2);
		al.remove("Cognizant"); // remove
		System.out.println("ArrayList Size  :" + al.size());
		System.out.println("ArrayList is  :" + al);

		al.set(2, "Welcome"); // update
		System.out.println("ArrayList Size  :" + al.size());
		System.out.println("ArrayList is  :" + al);

	}

}
