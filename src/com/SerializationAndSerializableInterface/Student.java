package com.SerializationAndSerializableInterface;

import java.io.Serializable;

public class Student implements Serializable{
	private int rollNo;
	private String name;
	private String userName;
	transient private  String pass;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Student(int rollNo, String name, String userName, String pass) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.userName = userName;
		this.pass = pass;
	}
	
}
