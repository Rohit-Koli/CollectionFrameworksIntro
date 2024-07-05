package com.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


//Create 3 LinkedList of diffrent datatypes and add it into a another list
public class Example01 {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		LinkedList<Character> l2 = new LinkedList<>();
		l2.add('H');
		l2.add('E');
		l2.add('L');
		l2.add('L');
		l2.add('o');
		LinkedList<String> l3 = new LinkedList<>();
		l3.add("RCPIT");
		l3.add("Rohit");
		l3.add("Koli");
		
		LinkedList ll = new LinkedList();
		ll.add(l1);
		ll.add(l2);
		ll.add(l3);
		ll.add(null);
		System.out.println(ll);
		Collection c =Collections.synchronizedCollection(l1);
		
		
		Iterator i =ll.iterator();
		while(i.hasNext()) {
			System.out.print(i.next());
		}
		System.out.println("\n**********************");
		for(int j=0;j<ll.size();j++) {
			System.out.println(ll.get(j));
		}
		System.out.println("**************************");
		for(Object k:ll) {
			System.out.println(k);
		}
		
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		
//		System.out.println(ll.poll()); //Remove the first element 
//		System.out.println(ll);
		System.out.println("======================");
		
		//List iterate can iterate forward as well as backward iteration
		// ListIterator is combination of LinkedList with Iterator
		//Forward Iteration
		ListIterator ListIterate =ll.listIterator();
		while(ListIterate.hasNext()) {
			System.out.print(ListIterate.next()+" ");
		}		
		
		//Backword Direction iteration / Previous iteration		
		System.out.println("\n=======================");
		while(ListIterate.hasPrevious()) {
			System.out.print(ListIterate.previous()+" ");
			System.out.println(ListIterate.previousIndex());
		}
		
		System.out.println();
	}
}
