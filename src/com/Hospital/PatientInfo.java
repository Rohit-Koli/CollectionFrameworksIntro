package com.Hospital;

public class PatientInfo {
	private int patientNo;
	private String name;
	private String docName;
	private String docSpecialization;
	private int billNo;
	private double billAmount;
	public int getPatientNo() {
		return patientNo;
	}
	public void setPatientNo(int patientNo) {
		this.patientNo = patientNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getDocSpecialization() {
		return docSpecialization;
	}
	public void setDocSpecialization(String docSpecialization) {
		this.docSpecialization = docSpecialization;
	}
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public PatientInfo(int patientNo, String name, String docName, String docSpecialization, int billNo,
			double billAmount) {
		super();
		this.patientNo = patientNo;
		this.name = name;
		this.docName = docName;
		this.docSpecialization = docSpecialization;
		this.billNo = billNo;
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "PatientInfo [patientNo=" + patientNo + ", name=" + name + ", docName=" + docName
				+ ", docSpecialization=" + docSpecialization + ", billNo=" + billNo + ", billAmount=" + billAmount
				+ "]";
	}
	
}
