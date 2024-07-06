package com.Practice;
import java.util.*;

//Vector:Same as ArrayList but it is Synchronized , thread safe, Less efficient
public class VectorExample {
	public static void main(String[] args) {
		List<Integer> li = new Vector<>();
		li.add(10);
		System.out.println(li);
	}
}
