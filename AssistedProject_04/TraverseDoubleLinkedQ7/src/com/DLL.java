package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class DLL {

	public static void main(String[] args) {
		List<Integer> ll=new LinkedList<Integer>();
		ll.add(11);ll.add(7);ll.add(15);ll.add(97);
		System.out.println(ll);
		ListIterator<Integer> li= ll.listIterator();
		
		System.out.println("In forward direction");
				while(li.hasNext()) {
					Object obj=li.next();
					System.out.println(obj);
				}
				
				System.out.println("In backword direction");		
				while(li.hasPrevious())
				{
					System.out.println(li.previous());
				}
	}

}
