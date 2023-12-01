package com;
class Sum 
{
    public int add(int x, int y) 
    { 
        return (x + y); 
    } 
    public int add(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double add(double x, double y) 
    { 
        return (x + y); 
    } 
}

public class Polymorphism {

	public static void main(String[] args) {
	
		        Sum s1 = new Sum(); 
		        System.out.println(s1.add(15, 27)); 
		        System.out.println(s1.add(14, 15, 20)); 
		        System.out.println(s1.add(21.3, 25.5)); 
		    } 
		}

