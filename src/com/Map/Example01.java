package com.Map;
import java.util.*;
public class Example01 {
	public static void main(String[] args) {
		Map<Character,String> m = new HashMap<>();
		
		m.put('S', "Sunday");
		m.put('M', "Monday");
		m.put('T', "Tuesday");
		m.put('w', "Wednesday");
		m.put('T', "Thursday");
		m.put('F', "Friday");
		m.put('S', "Saturday");
		System.out.println(m);
//		for(m.entrySet():) {
//			
//		}
		Map<Integer,String> m2 = new HashMap<>();
		
		m2.put(1, "Sunday");
		m2.put(2, "Monday");
		m2.put(3, "Tuesday");
		m2.put(4, "Wednesday");
		m2.put(5, "Thursday");
		m2.put(6, "Friday");
		m2.put(7, "Saturday");
		
		//This is how we can get key and their value pairs 
		for(Map.Entry<Integer, String> obj :m2.entrySet()) {
			System.out.println("No : "+obj.getKey()+" Day :"+obj.getValue());
		}
		
		System.out.println("\n============================");
		Iterator i2=m2.entrySet().iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
	}
}
