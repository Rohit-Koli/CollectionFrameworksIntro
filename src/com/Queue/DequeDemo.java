package com.Queue;
import java.util.*;
public class DequeDemo {
	public static void main(String[] args) {
		Deque<Object> dq = new ArrayDeque<>();
		dq.offer(50);
		dq.offer("ROhit");
//		dq.offer(null);//Null value is not supported in Deque
		dq.offer('h');
		dq.offer(50);
		System.out.println(dq);
		dq.offerFirst(1);
		dq.offerLast("End");
		System.out.println(dq);
		System.out.println("First Element Removed "+dq.poll());
		System.out.println("Last Element Removed :"+dq.pollLast());
		System.out.println(dq);
		System.out.println("Is our queue empty ?:"+dq.isEmpty());
		System.out.println("Size is :"+dq.size());
		for(int i=1;i<21;i++) {
			dq.offer(i);
		}
		System.out.println(dq);
		
		ArrayDeque<Object> arr = new ArrayDeque<>();
		arr.offer(100);
		arr.offer(200);
		arr.addAll(dq);
		System.out.println(arr);
		
		Iterator<Object> i = arr.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println("\nSize of ArrayDeque is :"+arr.size());
		
		for(Object o:arr) {
			System.out.print(o);
		}
	}
}
