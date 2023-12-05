package com;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> q1 = new PriorityQueue();
		
		q1.add(3);q1.add(8);q1.add(7);q1.add(4);q1.add(5);q1.add(1);
		System.out.println(q1);
		System.out.println("Remove "+q1.poll());
		System.out.println(q1);

	}

}
