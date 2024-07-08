package com.Practice;
import java.util.*;
public class WeakHashMapPractice {
	public static void main(String[] args) {
		Map<Integer, String> w = new WeakHashMap<>();
		w.put(106, "ABC");
		w.put(null, "Hello");
		w.put(103, null);
//		w.put(null, null);
		w.put(104, "ABC");
		w.put(104, "kkk");
		w.put(102, "kkk");
		System.out.println(w.getOrDefault(105, "Kuwe"));
		for(Map.Entry<Integer,String> m :w.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
