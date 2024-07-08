package com.Hospital;
import java.util.Comparator;
public class SortByBillAmount implements Comparator<PatientInfo>{

	@Override
	public int compare(PatientInfo o1, PatientInfo o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getBillAmount()-o2.getBillAmount());
	}

}
