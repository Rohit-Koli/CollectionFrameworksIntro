package com.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
public class Example02 {
	public static void main(String[] args) {
		
		//Program to remove duplicate elements from Array
		int arr[]= {1,2,5,8,2,6,12,89,4,2,8};
		ArrayList<Integer> ar= new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			ar.add(arr[i]);
		}
		System.out.println("Before "+ar);
		
		LinkedHashSet<Integer> ls = new LinkedHashSet<>();
		ls.addAll(ar);
		System.out.println("After :"+ls);
		Collections.shuffle(ar);
		System.out.println("After Shufle of ArrayList : "+ar);
		Collections.sort(ar);
		System.out.println("Sorted Array is :"+ar);
	}
}
