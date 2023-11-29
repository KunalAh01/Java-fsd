package com;

public class AccessModifiers2 extends Students {
	public void disAcc() {
//		System.out.println("value of a "+ a);//we can't access private access modifier in another class
		System.out.println("value of name "+ name);
		System.out.println("value of c "+c);
		System.out.println("value of d "+ d);
		
	}

}
