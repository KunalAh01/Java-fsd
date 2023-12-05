package com;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> ss = new Stack<Integer>();
		System.out.println("Empty "+ss.empty());
		ss.push(100);
		ss.push(200);
		ss.push(300);
		ss.push(400);
		System.out.println("Empty "+ss.empty());
		System.out.println(ss);
		System.out.println("Remove "+ss.pop());		// remove and display 
		System.out.println(ss);
		System.out.println("Search top most element "+ss.peek());	// display top most element 
		System.out.println(ss);

	}

}
