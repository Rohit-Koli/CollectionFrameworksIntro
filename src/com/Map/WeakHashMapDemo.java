package com.Map;

import java.util.WeakHashMap;
import java.util.*;

public class WeakHashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> w = new WeakHashMap<>();
		w.put(106, "ABC");
		w.put(null, "Hello");
		w.put(null, "hh");
//		w.put(null, null);
		w.put(104, "ABC");
		w.put(104, "kkk");
		w.put(102, "kkk");
		System.out.println(w);
		System.gc();
		System.out.println(w);
	}
}
