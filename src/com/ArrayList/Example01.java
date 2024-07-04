package com.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Example01 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(null);
		a.add(50);
		System.out.println(a);
		
		ArrayList<String> str = new ArrayList<>();
		str.add("Rohit");
		str.add(null);
		str.add("h");
		str.add("Rohit KOli");
		System.out.println(str);
		
		Collection<Object> c = new ArrayList<Object>();
		c.add("Rohit");
		c.add(10);
		c.add(true);
		c.add(null);
		System.out.println(c);
		
		//Synchronized arrayList
		Collection<Object> c2 =Collections.synchronizedCollection(c);
		System.out.println("Synchronized List :"+c2);
		
		//Types of initializing arraylist
		ArrayList ar = new ArrayList();
		ArrayList ar2 = new ArrayList(50);
		ArrayList ar3 = new ArrayList(ar);
	}
}
