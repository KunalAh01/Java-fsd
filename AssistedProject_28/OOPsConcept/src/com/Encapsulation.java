package com;

class Student { 
    private String Name; 
    private int Roll; 
    private int Age;
    public int getAge()  
    { 
      return Age; 
    } 
    public String getName()  
    { 
      return Name; 
    } 
    public int getRoll()  
    { 
       return Roll; 
    } 
    public void setAge( int newAge) 
    { 
      Age = newAge; 
    } 
    public void setName(String newName) 
    { 
      Name = newName; 
    } 
    public void setRoll( int newRoll)  
    { 
      Roll = newRoll; 
    } 
}
public class Encapsulation {

	public static void main(String[] args) {
		
		 
		        Student s1 = new Student(); 
		        s1.setName("Nikhil"); 
		        s1.setAge(22); 
		        s1.setRoll(07); 
		        System.out.println("Name is " + s1.getName()); 
		        System.out.println("Age is " + s1.getAge()); 
		        System.out.println("RollNo is " + s1.getRoll());      
		    } 
		}



