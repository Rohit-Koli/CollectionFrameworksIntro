package com.Queue;
import java.util.*;
public class ArrayDequDemo {
	public static void main(String[] args) {
		//Stack Implementation in array Deque
		ArrayDeque<Integer> ad= new ArrayDeque<>(); 
		ad.push(10);
		ad.push(20);
		ad.push(50);
		ad.push(30);
		System.out.println(ad);
		ad.pop();
		System.out.println(ad);
		System.out.println(ad.peek());
		
		Iterator<Integer> i = ad.descendingIterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		ArrayDeque<Object> ad2= new ArrayDeque<>();
		ad2.push(0);
		ad2.addAll(ad);
		System.out.println("\n"+ad2);
	}
}
