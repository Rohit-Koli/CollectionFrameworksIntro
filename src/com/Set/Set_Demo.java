package com.Set;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
public class Set_Demo {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(null);
		hs.add(1);
		hs.add("RCPIT");
		hs.add(null);
		
		System.out.println(hs);
		
		int arr[]= {1,3,5,7,9,1,5,5,1};
		hs.add(arr);
		System.out.println(hs);
		//Elements present in HashSet
		System.out.println("Size is :"+hs.size());
		
		Set<Integer> s = new HashSet<>();
		s.add(10);
		s.add(9000);
		s.add(234);
		s.add(897934);
		System.out.println(s);
		
		Set syncHash=Collections.synchronizedSet(s);
		System.out.println(syncHash);
		System.out.println("++++++++++++++++++++++++++");
		//.remove(elementValue)
		s.remove(10);
		System.out.println(s);
		//Comparing 2 values with each other 
		System.out.println(syncHash.equals(s));	
		
		Iterator <Object> i = hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
						
	}
}
