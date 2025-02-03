package com.Stack;

import java.util.Iterator;
import java.util.Stack;

public class StackIntro {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		for(int i=0;i<10;i++) {
			stack.push(i);
		}
		System.out.println("Stack Size is : "+stack.size()+"\n");
		Iterator<Integer> itr =stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("is Stack Empty ? :"+stack.isEmpty());
	}
}
