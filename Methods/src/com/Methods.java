package com;

public class Methods {
	static void sum(int a ,int b) {
		int c;
		c=a+b;
		System.out.println(c);
	}
	public void myPublic() {
		System.out.println("It is a public method");
	}

	public static void main(String[] args) {
		sum(7,9);
		
		Methods m1= new Methods();		
		m1.myPublic();

	}

}
