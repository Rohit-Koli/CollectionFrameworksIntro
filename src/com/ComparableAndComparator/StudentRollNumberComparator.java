package com.ComparableAndComparator;

import java.util.Comparator;

public class StudentRollNumberComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (int)o1.getRoll()-o2.getRoll();
	}
	
}
