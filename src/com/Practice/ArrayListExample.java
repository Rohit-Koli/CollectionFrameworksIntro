package com.Practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//ArrayList : Dynamic Array ,non Synchronized
public class ArrayListExample {
	public class Ex05 {

	}

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		for(int i=1;i<11;i++) {
			li.add(i);
		}
		Collections.shuffle(li);
		System.out.println(li);
//		li.add(null);
		System.out.println("Does Array Contains 5 ?:"+li.contains(5));
		System.out.println("Is Our Array Empty ? :"+li.isEmpty());
		System.out.println("What is The size of our ArrayList ?:"+li.size());
		System.out.println("Does Array Contains Null ?:"+li.contains(null));
//		System.out.println("What is the First Occurence of Number 5 :"+li.);
		Object[] arr=li.toArray();//List to Array
		for(Object o:arr) {
			System.out.print(o+" ");
		}
				
		System.out.println("\nIndex of 8 is :"+li.get(7));
		System.out.println("Remover index position 3 from ArrayList :"+li.remove(3));
		System.out.println(li+" Size is :"+li.size());
		System.out.println("Adding Element at 3 index :");//Shift Other Elements to the right
		li.add(3,4);
		System.out.println(li);
		System.out.println("Last Occurence of 3 is :"+li.lastIndexOf(3));//Returm the Last occurennce of the Element
		System.out.println("Firts Occurence of 5 is :"+li.get(5));//Print the first occurence of the Element
		li.add(10);
		Collections.sort(li);		
		System.out.println("Sorted List is :"+li);		
		System.out.println(Collections.binarySearch(li, 10));
		
		List<Integer> li2 = new ArrayList<>();
		li2.add(2);
		li2.add(5);
		li2.add(20);
		li2.add(90);
		System.out.println("\nList 2 is :"+li2);
		li2.retainAll(li);
		System.out.println(li2);//Only print the NUmber that are commanly present in both lists
		
	}
}
