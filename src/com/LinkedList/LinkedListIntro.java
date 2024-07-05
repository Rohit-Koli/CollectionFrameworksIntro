package com.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIntro {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add("Rohit");
		l1.add(null);
		l1.add('H');
		l1.add(true);
		l1.add("Rohit");
		l1.add(10.45f);
		l1.add(1234567890);
		
		System.out.println(l1);
		
		l1.remove();//remove first element
		System.out.println(l1);
		l1.addFirst("Hello");
		System.out.println(l1);
		l1.addLast("World");
		System.out.println(l1);
		System.out.println("First Element :"+l1.getFirst());
		System.out.println("Last Element :"+l1.getLast());
//		l1.clear();
		System.out.println(l1.clone());
		
		LinkedList l2 = new LinkedList();
		
		
		System.out.println(l1.contains("Rohit"));// Give Boolean answer
		System.out.println(l1.contains("Koli"));
		
//		System.out.println(l1.reversed());//to reversed the Linked List we use this method
//		Iterator i = l1.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		
	}
}
