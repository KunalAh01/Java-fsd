package com;
interface Parent1{  
    default void show() 
    { 
        System.out.println("Parent1"); 
    } 
} 
interface Parent2{  
    default void show() 
    { 
        System.out.println("Parent2"); 
    } 
}  

public class DiamondProblem implements Parent1, Parent2  {
	 public void show() 
	    {  
		 Parent1.super.show(); 
		 Parent2.super.show(); 
	    } 

	public static void main(String[] args) {
		DiamondProblem dp = new DiamondProblem(); 
		        dp.show(); 
		    } 
		}



