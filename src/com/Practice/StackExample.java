package com.Practice;

import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

//Stack
public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.add(934);
		st.add(432589);
		st.add(934);
		st.add(543589);
		st.add(943534);
		st.push(434352589);//We can use push also
		st.push(04534);
		st.push(345);
		st.push(845);//Add Element to the top of the stack
		System.out.println(st);
		System.out.println(st.pop());//Returns the first Element with removing it
		System.out.println(st.peek());//Returns the first Element without removing it
		System.out.println(st);
		System.out.println("Is our Stack is Empty ?:"+st.isEmpty());
		ListIterator<Integer> i=st.listIterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
	}
}
