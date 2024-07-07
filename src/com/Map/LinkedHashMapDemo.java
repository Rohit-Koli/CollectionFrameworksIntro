package com.Map;
import java.util.*;
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(101, "Rohit");
		lhm.put(101,"Rohit Koli");//It will not add Duplicate key 
		lhm.put(102,"Rohit");//We can add duplicate values but cannot add duplicate keys values
		lhm.put(null, "Meghraj");
		lhm.put(null, "Tushar");//Will add only updated null value key
		lhm.put(103, "Tushar");
		lhm.put(104, "Umesh");
		lhm.put(105, null);
//		lhm.put(106, null);
		lhm.put(null, null);
		System.out.println(lhm);
		System.out.println("Size is : "+lhm.size());
		
		LinkedHashMap<Integer, String> lhm2 = new LinkedHashMap<>(200);
		System.out.println(lhm2.size());
		//Another declaration method of LinkedHashMap
		Map<Integer, String> mp = new LinkedHashMap<>();
		mp.put(10, "Hitesh");
		mp.put(20, "Rakesh");
		System.out.println(mp);
		
//		for('')
		
		mp.putAll(lhm);
		System.out.println(mp);
		
//		for(Map.Entry<Integer, String> m :mp.entrySet()) {
//			System.out.print(m.getKey()+" "+m.getValue()+" , ");
//		}
		
		Iterator i =mp.entrySet().iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println(mp.containsKey(10));
		System.out.println(mp.containsValue("Rohit"));		
		
		System.out.println(mp.putIfAbsent(154, "ROhit"));
		System.out.println(mp);
		
	}
}
