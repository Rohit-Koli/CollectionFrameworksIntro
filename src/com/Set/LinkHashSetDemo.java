package com.Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Spliterator;
import java.util.ArrayList;
import java.util.Iterator;

public class LinkHashSetDemo {
	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(20);
		ar.add(10);
		
		Set<Integer> s = new LinkedHashSet<>();
		for(int i=0;i<11;i++) {
			s.add(i);
		}
		s.add(10);
		LinkedHashSet<String> lh = new LinkedHashSet<>();
		lh.add("Maharashtra");
		lh.add("Shirpur");
		lh.add(null);
		lh.add("MCA");
		lh.add("MCA");
		
		System.out.println(lh);
		
		for(Object obj:s) {
			System.out.print(obj+" ");
		}
		
		System.out.println("\nSize is :"+lh.size());
//		int arr[]= {100,200,300,100};
		LinkedHashSet<Object> ls2 = new LinkedHashSet<>();
		ls2.addAll(lh);
		ls2.addAll(s);
		ls2.addAll(ar);
//		ls2.addAll(arr);
		ls2.remove(2);
		
		
		for(Object obj :ls2) {
			System.out.print(obj+" ");
		}
		System.out.println("\n============================");
		
		Iterator<Object> i =ls2.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println("\nIs out LinkdeHashSet empty ? :"+ls2.isEmpty());
		System.out.println("Is out LinkedHashSet Contains 100 ? : "+ls2.contains(100));
		
//		Split iterator method
		LinkedHashSet<Object> ls3 = new LinkedHashSet<>();
		ls3.add(ar);
		ls3.add(s);
		ls3.add(lh);
//		for(Object o:ls3) {
//			System.out.println(o);
//		}
		Spliterator<Object> sp =ls3.spliterator();
		sp.forEachRemaining(ans->System.out.println(ans));
	}
}
