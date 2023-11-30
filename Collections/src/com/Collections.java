package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Collections {

	public static void main(String[] args) {
		

				//creating arraylist
				System.out.println("ArrayList");
				ArrayList<String> name=new ArrayList<String>();   
				name.add("Kunal");//
				name.add("Ahlawat");    	   
			      System.out.println(name);  
				
			      //creating vector
			      System.out.println("\n");
			      System.out.println("Vector");
			      Vector<Integer> id = new Vector();
			      id.addElement(5); 
			      id.addElement(10); 
			      System.out.println(id);
				
				//creating linkedlist
			      System.out.println("\n");
			      System.out.println("LinkedList");
			      LinkedList<String> country=new LinkedList<String>();  
			      country.add("INDIA");  
			      country.add("RUSSIA");  	      
			      Iterator<String> itr=country.iterator();  
			      while(itr.hasNext()){  
			       System.out.println(itr.next());  
			      }
			       
			       //creating hashset
			       System.out.println("\n");
			       System.out.println("HashSet");
			       HashSet<Integer> set=new HashSet<Integer>();  
			       set.add(10);  
			       set.add(11);  
			       set.add(12);
			       set.add(13);
			       System.out.println(set);
			       
			       //creating linkedhashset
			       System.out.println("\n");
			       System.out.println("LinkedHashSet");
			       LinkedHashSet<String> set2=new LinkedHashSet<String>();  
			       set2.add("Hello");  
			       set2.add("Welcome");  
			       set2.add("To");
			       set2.add("Java");	       
			       System.out.println(set2);
			      	} 
			      }  
			


	