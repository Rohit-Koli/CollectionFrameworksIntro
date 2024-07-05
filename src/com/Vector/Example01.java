package com.Vector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Example01 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		LinkedList<String> str = new LinkedList<>();
		str.add("RCPIT");
		str.add("Shirpur");
		str.add("Maharashtra");
		str.add("MCA");
		
		Vector<Object> v = new Vector<>();
		v.addAll(arr);
		v.addAll(str);
//		System.out.println(v);
		
		for(Object o:v) {
			System.out.print(o+" ");
		}
		System.out.println();
		ListIterator<Object> i = v.listIterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		System.out.println("\n"+v.firstElement());
		System.out.println("Last Element is :"+v.lastElement());
		System.out.println("Element at index 4 is :"+v.get(4));
		System.out.println("Does vector contains MCA ? :"+v.contains("MCA"));
		//Value , index
		v.setElementAt(100, 0);
		System.out.println(v);
		//index,value
		System.out.println(v.set(4, 0));
		System.out.println(v);
		System.out.println("is Vector empty ? :"+v.isEmpty());//Check whether the vector is empty or not 
		System.out.println("Backward Data is :");
		
		while(i.hasPrevious()) {
			System.out.print(i.previous()+" ");
		}
		
		
	}
}
