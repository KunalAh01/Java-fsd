package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {

	public static void main(String[] args) {
			
		HashMap<Integer,String> map1=new HashMap<Integer,String>();      
		map1.put(1,"Kunal");    
		map1.put(2,"Anubhav");    
		map1.put(3,"Vinayak");   
			       
		      System.out.println("\nThe elements of Hashmap are ");  
		      for(Map.Entry m:map1.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
		      
		      
	      Hashtable<Integer,String> map2=new Hashtable<Integer,String>();       
	      map2.put(4,"Kanika");  
	      map2.put(5,"Anshi");  
	      map2.put(6,"Khushi");  
	      map2.put(7,"Karuna");  

		      System.out.println("\nThe elements of HashTable are ");  
		      for(Map.Entry n:map2.entrySet()){    
		       System.out.println(n.getKey()+" "+n.getValue());    
		      }
			           
	      TreeMap<Integer,String> map3=new TreeMap<Integer,String>();    
		      map3.put(8,"Mohit");    
		      map3.put(9,"Rohit");    
		      map3.put(10,"Ankur");       
		      
	      System.out.println("\nThe elements of TreeMap are ");  
		      for(Map.Entry l:map3.entrySet()){    
			       System.out.println(l.getKey()+" "+l.getValue());    
			      }    
			      
			   }  
		}


	
