package com.Stack;


import java.util.Stack;

public class StackBasicQuestions {
/*	Basic Questions
 * . Reverse a String Using Stack
Problem Statement: Given a string, reverse it using a stack.

Example:

Input: "hello"

Output: "olleh"

Hint: Push each character onto the stack and then pop them to get
the reversed string.

3. Implement a Stack Using Array
Problem Statement: Implement a stack data structure using an
array. Include the following operations:

push()

pop()

peek()

isEmpty()

Example:

Push 10, 20, 30 into the stack.

Pop and print the top element (should print 30).

Hint: Use a fixed-size array and a pointer to track
the top of the stack.

*/
	
	static String stringReverse(String str) {
		Stack<Character> stc = new Stack<>();
		for(int i=str.length()-1;i>=0;i--) {
			stc.push(str.charAt(i));
		}
		return stc.toString();
	}
	
//	2. Check for Balanced Parentheses
//	Problem Statement: Given a string containing parentheses 
//	(), {}, or [], check if the parentheses are balanced.
//
//	Example:
//
//	Input: "({[]})"
//
//	Output: true
//
//	Input: "({[)})"
//
//	Output: false
//
//	Hint: Use a stack to track opening parentheses and match them
//	with closing ones.
	static boolean checkBalancedParanthesis(String str) {
		if(str.length()%2!=0) {
			return false;
		}
		
		Stack<Character> stack = new Stack<>();
		for(char ch:str.toCharArray()) {
			if(ch=='(' || ch=='{' || ch=='[') {
				stack.push(ch);
			}else if(ch==')' || ch=='}' || ch==']') {
				if(stack.empty()) return false;
				char open=stack.pop();
				if(!isMatching(open, ch)) {
					return false;
				}
			}
		}	
		return stack.empty();
	}
	
	static boolean isMatching(char opening,char closing) {
		return (opening=='(' && closing==')') ||
				(opening=='{'&& closing=='}') ||
				(opening=='[' && closing==']');
	}
	
//	4. Next Greater Element
//	Problem Statement: Given an array of integers, find 
//	the next greater element for each element in the array. 
//	If no greater element exists, return -1.
//
//	Example:
//
//	Input: [4, 5, 2, 25]
//
//	Output: [5, 25, 25, -1]
//
//	Hint: Use a stack to keep track of elements and
//	find the next greater element efficiently.
//	 
	static int[] nextGreterElement(int arr[]) {
		int bigNum=arr[0];
//		Stack<Integer> stack = new Stack<>();
		for(int i=1;i<arr.length;i++) {
			int frontPlace=0;
			int endPlace=arr.length-1;
			if(bigNum>arr[i]) {
				arr[frontPlace++]=bigNum;
			}else {
				arr[endPlace--]=-1;
				bigNum=arr[i];
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
//		System.out.println(stringReverse("Hello"));
//		System.out.println(checkBalancedParanthesis("({{}})"));
		int arr[]= {4,5,2,25};
		int []resArr=nextGreterElement(arr);
		for(int i:resArr) {
			System.out.println(i);
		}
	}

}
