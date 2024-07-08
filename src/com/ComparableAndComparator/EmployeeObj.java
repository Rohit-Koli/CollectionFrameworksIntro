package com.ComparableAndComparator;
import java.util.*;
public class EmployeeObj {
	public static void main(String[] args) {
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(new Employee(1008,"Rohit",45000,1234567890));
		emps.add(new Employee(1002,"Megharaj",35000,987654321));
		emps.add(new Employee(1003,"Tushar",55000,865842107));
		emps.add(new Employee(1001,"Umesh",65000,708543245));
		emps.add(new Employee(1007,"Hitesh",30000,87043345));
		emps.add(new Employee(1005,"Ankush",70000,908375300));
		
//		System.out.println(emps.toString());
		for(Employee o:emps) {
			System.out.println(o.getEmp_id()+" "+o.getEmpName()+" "+o.getSalary()+" "+o.getContact());
		}
		
		Collections.sort(emps);
		System.out.println(emps.toString());
	}
}
