package com.Vector;
import java.util.Vector;
import java.util.List;
public class Vector_Demo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add("ABC");
		v.add(null);
		v.add(1234567890);		
		
		System.out.println(v);
		System.out.println(v.capacity());//Capacity is increasing by initial Capacity *2
		
		List<Integer> l = new Vector<>();
		l.add(7888);
		System.out.println(l);
		
		Vector<Integer> vInteger = new Vector<>();
//		
//		for(int i=1;i<100;i++) {
//			vInteger.add(i);
//			System.out.println(vInteger.capacity());
//		}
//		vInteger.add(11);
//		System.out.println(vInteger);	
		
		//We can define size by the following method
		Vector<Integer> v2 = new Vector<>(20);
		System.out.println("Before Insertion of Elements and then the capacity is :"+v2.capacity());
		for(int i=1;i<42;i++) {
			v2.add(i);
		}
		System.out.println("After Insertion of Elements and then the capacity is :"+v2.capacity());
		System.out.println(v2);
	}
}
