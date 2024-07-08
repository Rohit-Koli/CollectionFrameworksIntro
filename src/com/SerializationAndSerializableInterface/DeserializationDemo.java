package com.SerializationAndSerializableInterface;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//TO read Input from the data
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\ROHIT\\\\eclipse-workspace\\\\CollectionFrameworksIntro\\\\src\\\\com\\\\SerializationAndSerializableInterface\\\\dataFile.txt");
		//To read the output using this following object
		ObjectInputStream out1 = new ObjectInputStream(file);
		Student std  = (Student) out1.readObject();
		Student std2 = (Student) out1.readObject();
		Student std3 = (Student) out1.readObject();
		Student std4 = (Student) out1.readObject();
		System.out.println(std.getName()+" "+std.getRollNo()+" "+std.getUserName()+" "+std.getPass());
		System.out.println(std2.getName()+" "+std2.getRollNo()+" "+std2.getUserName()+" "+std2.getPass());
		System.out.println(std3.getName()+" "+std3.getRollNo()+" "+std3.getUserName()+" "+std3.getPass());
		System.out.println(std4.getName()+" "+std4.getRollNo()+" "+std4.getUserName()+" "+std4.getPass());
		
		
		
	}
}
