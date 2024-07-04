package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList ar = new ArrayList<>();
//		int arr[] = {1,7,3,9};
		ar.add(10);
		ar.add("Rohit");
		ar.add(10.234);
//		ar.add(arr);
		ar.add(true);
		ar.add(null);
		ar.add(null);
		System.out.println(ar);
		
		List a = new ArrayList();
		a.add("hello");
		a.add(12);
		a.add("world");
		a.add(null);
		a.add(null);
		System.out.println(a);
		
		ArrayList al3 = new ArrayList();
		al3.add(a);
		al3.add(ar);
		System.out.println(al3);
		
	}
}
