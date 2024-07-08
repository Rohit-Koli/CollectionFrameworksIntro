package com.SerializationAndSerializableInterface;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationDemo {
	public static void main(String[] args) throws IOException {
		Student s1 = new Student(118, "Rohit", "rohit@gmail.com", "Pass@123");
		Student s2 = new Student(201, "Meghraj", "meghraj@gmail.com", "megha@123");
		Student s3 = new Student(306, "Umesh", "umesh@gmail.com", "umesh@123");
		Student s4 = new Student(04, "Tushar", "tushar@gmail.com", "tushar@098");
		
		//Write this data
		FileOutputStream file = new FileOutputStream("C:\\Users\\ROHIT\\eclipse-workspace\\CollectionFrameworksIntro\\src\\com\\SerializationAndSerializableInterface\\dataFile.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		//Serialization Logic
		out.writeObject(s1);
		out.writeObject(s2);
		out.writeObject(s3);
		out.writeObject(s4);
		
		out.close();
		file.close();
		
		System.out.println("Data Inserted !");
	}
}
