package com.Map;
import java.util.*;
public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(107, "Rohit");
		tm.put(108, "Sachin");
		tm.put(103, "Megharaj");
//		tm.put(null, "Hitesh");
		tm.put(109, "Tushar");
		tm.put(104, "Tushar");
		tm.put(101, null);
		tm.put(106, null);
		System.out.println(tm);
		
		//Another method to declare a new TreeMap class
		//Sort the data according to their key values
		SortedMap<Integer, String> sm = new TreeMap<>();
		sm.put(109, "Rohit");
		sm.put(102, "Sachin");
		sm.put(103, "Megharaj");
//		sm.put(null, "Hitesh");
		sm.put(104, "Tushar");
		sm.put(104, "Tushar");
		sm.put(101, null);
		sm.put(106, null);
		System.out.println(sm);
		for(Map.Entry<Integer, String> m : sm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println(tm.entrySet());
		System.out.println("Keys are :"+tm.keySet());
		System.out.println("Values are :"+tm.values());
		
		System.out.println(tm.ceilingKey(102));
		System.out.println(tm.floorKey(102));
		
		System.out.println(tm.ceilingEntry(107));
		System.out.println(tm.floorEntry(102));
		
		System.out.println("First Entry :"+tm.firstEntry());
		System.out.println(tm.lastEntry());
		
		System.out.println(tm.higherEntry(103));
		System.out.println(tm.lowerEntry(103));
		
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm);
		System.out.println(tm.pollLastEntry());
		System.out.println(tm);
		
		System.out.println("Descending Values are :"+tm.descendingMap());
		
//		TreeMap<Character,String> tm2 = new TreeMap<>();
//		tm2.put('z', null)
		
		System.out.println(tm.tailMap(104));
		System.out.println(tm.subMap(104, 109));
		Collections.synchronizedMap(tm);
		System.out.println(tm);
	}
}
