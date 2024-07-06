package com.Practice;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
//LinkedList : Doubly LinkedList is Present in java in the form of Collection Framework LinkedList
public class LinkedListExample {
	public static void main(String[] args) {
		List<Integer> li = new LinkedList<>();
		for(int i=1;i<11;i++) {
			li.add(i);
		}
		Collections.shuffle(li);
		System.out.println("Shuffled List :"+li);
		Collections.sort(li);
		System.out.println("Sorted List is :"+li);
		System.out.println(li);
		System.out.println("First Element is :"+li.get(0));
		System.out.println("Last Element is :"+li.get(li.size()-1));//Print the last Element
		System.out.println("Last Index of 5 :"+li.lastIndexOf(5));
		System.out.println("First index of 6 is :"+li.get(5));
	}
}
