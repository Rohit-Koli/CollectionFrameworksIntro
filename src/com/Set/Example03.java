package com.Set;
import java.util.*;
public class Example03 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(34);
		arr.add(4);
		arr.add(45);
		arr.add(36);
		arr.add(0);
		arr.add(56);
		System.out.println(arr);
		TreeSet<Integer> ts = new TreeSet<>();
		ts.addAll(arr);
		System.out.println(ts);
		int array[]= {34,67,68,23,0,34};
		TreeSet<Integer> ts2 = new TreeSet<>();
//		Integer arr2[]=Arrays.stream(array).boxed().toArray(Integer[]::new);
		for(int i=0;i<array.length;i++) {
			ts2.add(array[i]);
		}
//		ts2.addAll(arr2);
		System.out.println(ts2);
		Iterator<Integer> itr2 = ts2.iterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next()+" ");
		}
		
		System.out.println("In Descending Order :");
		Iterator<Integer> i2 =ts2.descendingIterator();
		while(i2.hasNext()) {
			System.out.print(i2.next()+" ");
		}
		
		SortedSet<Integer> obj=Collections.synchronizedSortedSet(ts2);
		System.out.println("\n"+obj);
	}
}
