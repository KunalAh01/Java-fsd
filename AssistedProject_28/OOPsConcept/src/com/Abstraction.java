package com;

abstract class employee{
	abstract void name();
}
class employee1 extends employee{
	public void name() {
		System.out.println("My name is Mohit");
	}
}
class employee2 extends employee{
	public void name() {
		System.out.println("My name is Rohit");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		employee1 e1=new employee1();
		employee2 e2=new employee2();
		
		e1.name();
		e2.name();

	}

}
