package com.Hospital;
import java.util.*;

public class MainHospital {
	
	public static List<PatientInfo> p = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);
	public void addPatient() {
		
		System.out.println("Enter Patient Id :");
		int p_id=sc.nextInt();		
		sc.nextLine();
		
		System.out.println("Enter Patient Name :");
		String name=sc.nextLine();
		
		System.out.println("Enter Doctor Name :");
		String docName=sc.nextLine();
		System.out.println("Enter Doctor's Specialization :");
		String docSpecialization=sc.nextLine();
		System.out.println("Enter Bill No :");
		int billNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Bill Amount :");
		double billAmount=sc.nextDouble();
		p.add(new PatientInfo(p_id,name,docName,docSpecialization,billNo,billAmount));
		System.out.println("Data Added !");
		sc.close();
	}
	
	public void menuOptions() {
		System.out.println("1.To add Patient");
		System.out.println("2.View Patients record by Id :");
		System.out.println("3.View Patients record by Name :");
		System.out.println("4.View Patients record by Doctor's Name :");
		System.out.println("5.View Patients record by Doctor's Specialization :");
		System.out.println("6.View Patients record by Bill No :");
		System.out.println("7.View Patients record by Bill Amount :");
		System.out.println("8.Exit");
	}
	
	public void printDetails() {
		System.out.println("Patient Details are Following :");
		for(PatientInfo i:p) {
			System.out.println("Id :"+i.getPatientNo()+",Name:"+i.getName()+", Doctor Name :"+i.getDocName()+", Specialization :"+i.getDocSpecialization()+", Bill No :"+i.getBillNo()+", Bill Amount :"+i.getBillAmount());
		}
	}
	public static void main(String[] args) {
		
		MainHospital obj = new MainHospital();
		
		p.add(new PatientInfo(403,"Rohit Koli","Rakesh Patil","Neuro",340,5000.67));
		p.add(new PatientInfo(739,"Meghraj Narkhede","Sachin Pawar","Dentist",783,1800.00));
		p.add(new PatientInfo(306,"Sachin Kuwar","Rakesh Patil","Neuro",230,370.87));
		p.add(new PatientInfo(105,"Hitesh Patil","Ankush Patil","Ortho",450,1200.72));
		p.add(new PatientInfo(102,"Tushar Patil","John Creamer","Sergeoun",732,3400.09));
		p.add(new PatientInfo(206,"Aniket Patil","Sachin Pawar","Dentist",319,2534.45));
		
		int choice=0;
		int count=0;
		while(count==0) {
			obj.menuOptions();
			choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
				case 1:
					obj.addPatient();
					break;
				case 2:
					Collections.sort(p,new SortId());
					obj.printDetails();
					break;
				case 3:
					Collections.sort(p,new SortByPatientName());
					obj.printDetails();
					break;
				case 4:
					Collections.sort(p,new SortByDocName());
					obj.printDetails();
					break;	
				case 5:
					Collections.sort(p,new SortByDocSpecialization());
					obj.printDetails();
					break;
				case 6:
					Collections.sort(p,new SortByBillNo());
					obj.printDetails();
					break;
				case 7:
					Collections.sort(p,new SortByBillAmount());
					obj.printDetails();
					break;
				case 8:
					count=1;
					sc.close();
					break;					
			}
		}
		System.out.println("Thank You for using our Application !");	
	}
}
