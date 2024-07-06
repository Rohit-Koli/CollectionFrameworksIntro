package com.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class MapDemo {
	public static void main(String[] args) {
		//We can Directly mention key and their values 
		//  Key   , Value
		//Implementation of map is HashMap
		Map<Integer,String> mp = new HashMap<>();
		mp.put(1, "Rohit");
		mp.put(2, "Megharaj");
		mp.put(3, "Tushar");
		mp.put(4, "Umesh");
		
		mp.put(1, "Rohit");//Not allowed
		mp.put(5, "Rohit");//Duplicate value is allowed but not the key
		
		mp.put(6, null);//Null data is allowed
		mp.put(null, "Hello");
		
		System.out.println(mp);	
		
		mp.remove(6,null);
		System.out.println(mp);
		mp.replace(5,"Rohit Koli");
		//One more method to replace
//		mp.replace(5, "Rohit","Rohit Koli");
		System.out.println(mp);
		
		System.out.println("Values Are :");
		Iterator<String>i =mp.values().iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		System.out.println("\nKeys are :");
		Iterator<Integer> i2 =mp.keySet().iterator();
		while(i2.hasNext()) {
			System.out.print(i2.next()+" ");
		}
		System.out.println();
		
	}
}
