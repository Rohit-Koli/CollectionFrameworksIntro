package com.ComparableAndComparator;
import java.util.*;
public class Employee implements Comparable<Employee>{
	private int emp_id;
	private String empName;
	private double salary;
	private long contact;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int emp_id, String empName, double salary, long contact) {
//		super();
		this.emp_id = emp_id;
		this.empName = empName;
		this.salary = salary;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", empName=" + empName + ", salary=" + salary + ", contact=" + contact
				+ "]";
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (int) (this.salary-o.salary);
	}
	
}
