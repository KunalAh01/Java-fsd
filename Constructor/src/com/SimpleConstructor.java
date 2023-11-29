package com;


class Bike1{
	int x=9;

	 Bike1() {
		System.out.println("Bike is created");
		System.out.println(x);
	}
	 
}

//parameterized constructor
class Bike2{
	int id;
	String name;
	
	 Bike2(int i,String n) {
		 id=i;
		 name=n;
		 
	}
	 void display() {
		System.out.println(id + " " + name);
	 }
}
public class SimpleConstructor {
		public static void main(String[] args) {
			Bike1 b1=new Bike1();
		Bike2 b2=new Bike2(12, "Kunal");
		b2.display();
		
		
		

	}

}
