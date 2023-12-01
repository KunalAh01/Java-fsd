package com;

class Bike  
{ 
    public String model; 
    public int speed; 
   
    public void dis1(String model) {
    	System.out.println("This is a base class for all bike "+ model);
    }
   
} 
class Pulsar extends Bike  
{ 
  

public void dis2() {
	   System.out.println("Drive safe");
   }
   
}

public class Inheritence {

	public static void main(String[] args) {
		
		        Pulsar b1 = new Pulsar();
		        b1.dis1("pulsar");
		        b1.dis2();
		    } 
		}


	