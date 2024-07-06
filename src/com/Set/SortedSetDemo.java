package com.Set;
import java.util.*;
public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet<Character> ss = new TreeSet<>();
		ss.add('z');
		ss.add('t');
		ss.add('j');
		ss.add('w');
		ss.add('k');
		ss.add('c');
		ss.add('j');
		System.out.println(ss);
//		System.out.println(ss);
		TreeSet<Object> s = new TreeSet<>();
		s.add(10);
		s.add(45);
//		ss.addAll(s);
//		s.addAll(ss);
//		System.out.println(s);
		s.add(16570);
		s.add(45564);
		s.add(14543);
		s.add(45435);
		s.add(31450);
		s.add(44324);
		
		//print the Above the Closest Number
		System.out.println("Ceiling Method :"+s.ceiling(9));
		//print the Lower
		System.out.println("Floor Method :"+s.floor(23));
		
		//Will print greatest element from the lower values
		System.out.println("Lower Method :"+s.lower(455657));
		
		//Will print lowest values among the higher values 
		System.out.println("Higher Method :"+s.higher(45565));		
		
		System.out.println("First :"+s.first());
		System.out.println("Last :"+s.last());
		
		//Obj.headSet(Value,true/false)
		//Will print to that values with ascending order
		System.out.println("Headset is :"+s.headSet(14543,false));//without declared array 
		//with Value when we assign true
		System.out.println("Headset is :"+s.headSet(14543,true));
		
		//tailSet: works opposite to headSet 
		System.out.println("TailSet is :"+s.tailSet(14543,true));
		System.out.println("TailSet is :"+s.tailSet(14543,false));
		
		//subset:
		//Create a new subset from the following values
		System.out.println("Subset is :"+s.subSet(10, 1000));
		
		Iterator<Object> iter =s.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		
//		ListIterator<Object> ls =s
		
	}
}
