package com.cts.comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<>();

		al.add(new Student(10, "Mohan", 29));
		al.add(new Student(16, "Mahesh", 32));
		al.add(new Student(25, "Santhosh", 21));

		System.out.println("Sorting by Name");

		Collections.sort(al, new NameComparator());

		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.getRollno() + " " + st.getName() + " " + st.getAge());
		}

		System.out.println("Sorting by age");

		Collections.sort(al, new AgeComparator());
		Iterator<Student> itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student st = (Student) itr2.next();
			System.out.println(st.getRollno() + " " + st.getName() + " " + st.getAge());
		}

	}

}
