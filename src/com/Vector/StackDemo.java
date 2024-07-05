package com.Vector;
import java.util.Stack;
import java.util.Vector;
public class StackDemo {
	public static void main(String[] args) {
		
		Vector v = new Stack();
		v.add(10);
		v.add(null);
		v.add("MCA");
		v.add(10.34);
		v.add('h');
		v.add('h');
		System.out.println(v);
		
		//.remove(index)
		v.remove(0);
		System.out.println(v);

		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		
		System.out.println(st);
		
		st.pop();
		System.out.println(st);
		st.remove(1);
		System.out.println(st);
		//Add element from tail side (Back) not from head side(front) 
		st.add(100);
		System.out.println(st);
//		
//		System.out.println(st);
	}
}
