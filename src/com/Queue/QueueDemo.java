package com.Queue;
import java.util.Queue;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class QueueDemo {
	public static void main(String[] args) {
		//Implementing queue through linkedList
		Queue<Integer>q = new LinkedList<>();
		q.add(10);
		q.add(34);
		q.add(45);
		q.add(56);
		q.add(null);
		q.add(10);
		System.out.println(q.remove());		
		System.out.println(q.remove());
		System.out.println(q.add(123));
		System.out.println(q);
		System.out.println("Peek :"+q.peek());
		System.out.println(q);
		System.out.println("Removes first Element :"+q.poll());
		System.out.println(q);
		
		//
		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		pq.offer(10);
//		pq.offer("Rohit");
//		pq.offer('h');
//		pq.offer(12.0);
//		pq.offer(true);
//		pq.offer(null);
		pq.offer(10);
		pq.offer(05);
		pq.offer(34);
		pq.offer(845);
		pq.offer(67);
		pq.offer(2);
		pq.offer(5);
		//Only head elements get priority
		System.out.println(pq);
		
		Iterator<Integer> i=pq.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		
		PriorityQueue<Object> p2 = new PriorityQueue<>();
//		p2.offer("Rohit");
		p2.offer(10);
//		p2.offer(10.56);
		p2.addAll(pq);
		p2.offer(20);
		p2.offer(0);
		System.out.println(p2);		
		
		TreeSet<Object> hs = new TreeSet<>();
		hs.addAll(p2);
		System.out.println(hs);
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(9847023);
		p2.addAll(arr);
		System.out.println(p2);
	}
}
