package com.Hospital;

import java.util.Comparator;

public class SortByDocName implements Comparator<PatientInfo>{

	@Override
	public int compare(PatientInfo o1, PatientInfo o2) {
		// TODO Auto-generated method stub
		return o1.getDocName().compareTo(o2.getDocName());
	}

}
