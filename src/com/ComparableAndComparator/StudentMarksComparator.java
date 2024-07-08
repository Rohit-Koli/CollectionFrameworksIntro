package com.ComparableAndComparator;

import java.util.Comparator;

public class StudentMarksComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getMarks()-o2.getMarks());
	}

}
