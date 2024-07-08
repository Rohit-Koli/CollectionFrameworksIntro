package com.ComparableAndComparator;
import java.util.*;
public class College {
	public static void main(String[] args) {
		List<Student> s = new LinkedList<>();
		s.add(new Student(20,"Rohit",88.67,1234567));
		s.add(new Student(67,"Megharaj",95.12,5973528));
		s.add(new Student(34,"Tushar",89.45,798340325));
		s.add(new Student(01,"Umesh",60.89,68534240));
		s.add(new Student(18,"Aniket",65.56,6573523));
		s.add(new Student(07,"Ankush",39.99,78395085));
		
		System.out.println("Unsorted :"+s.toString());
		
		//Name Comparator
		Collections.sort(s, new StudentNameComparator());
		System.out.println("Sorted By Name :"+s.toString());
		
		//Student Roll NO 
		Collections.sort(s,new StudentRollNumberComparator());
		System.out.println("Sorted By Roll NO :"+s);
		
		//Marks Comparator
		Collections.sort(s , new StudentMarksComparator());
		System.out.println("");
	}
}
