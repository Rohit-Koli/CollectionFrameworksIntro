package com.Set;
import java.util.*;
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
//		ts.add(null);
		ts.add(45);
		ts.add(10);
		ts.add(34);
		ts.add(0);
		ts.add(4556);
		ts.add(10);//cannot able to add Duplicated values  
		ts.add(32);
		System.out.println(ts);
		TreeSet<String> ts2 = new TreeSet<>();
		ts2.add("Shirput");
		ts2.add("Mumbai");
		ts2.add("Delhi");
		ts2.add("Nashik");
		ts2.add("Dhule");
		ts2.add("Kuwe");
		System.out.println(ts2);
	}
}
