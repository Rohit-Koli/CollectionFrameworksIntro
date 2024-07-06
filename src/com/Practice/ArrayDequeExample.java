package com.Practice;

import java.util.*;
public class ArrayDequeExample {
	public static void main(String[] args) {
//		Declarations
		Queue<Integer> qu = new ArrayDeque<>();
		/*/ We cannot use arrayDeque methods while declaring this type of queue
		 * so Most of the time we don't use this type of declaration .
		 * 
		 *  ArrayDequeue is capable of adding element from both ends 
		*/ 
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.offer(10);//Add Element on 
		ad.offer(780);
		ad.offer(56540);
		//Normal Queue functions
		ad.offer(9034);
		System.out.println("Array Queue is :"+ad);
		System.out.println("Deleted Element :"+ad.poll());
		System.out.println(ad);
		System.out.println("First Element is :"+ad.peek());
		
		//ArrayDeque Functions
		System.out.println(ad.offerFirst(100));
		System.out.println("Added Element At Position First 100:"+ad);
		System.out.println(ad.offerLast(500));
		System.out.println("Added Element At Position last 500:"+ad);
		
		System.out.println("Removed Element from First "+ad.pollFirst()+"\nNow New List is :"+ad);
		System.out.println("Removed Element from last "+ad.pollLast()+"\nNow New List is :"+ad);
		
		
		System.out.println("First Element is :"+ad.peekFirst());
		System.out.println("Last Element is :"+ad.peekLast());
		
		System.out.println("Is our List Empty ?:"+ad.isEmpty());
	}
}
