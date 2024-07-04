package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Example02 {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(null);
		ar.add(90);
		System.out.println(ar);
		ArrayList<Integer> ar2 = new ArrayList<>();
		ar2.add(80);
		ar2.addAll(ar);
		System.out.println(ar2);
		
		//TO iterate the arrayList
		Iterator<Integer> it =ar2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("************");
				
	}
}
