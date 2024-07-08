package com.Hospital;

import java.util.Comparator;

public class SortId implements Comparator<PatientInfo>{

	@Override
	public int compare(PatientInfo o1, PatientInfo o2) {
		// TODO Auto-generated method stub
		return o1.getPatientNo()-o2.getPatientNo();
	}

	
	
}
