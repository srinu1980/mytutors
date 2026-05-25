package com.cts.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();

		System.out.println("Size  :" + list.size());

		System.out.println("Elements :" + list);

		list.add("A");
		list.add("B");
		System.out.println("Size  :" + list.size());

		System.out.println("Elements :" + list);

		System.out.println(list.get(1));

		list.set(1, "Hello");
		System.out.println("Elements :" + list);

	}

}
