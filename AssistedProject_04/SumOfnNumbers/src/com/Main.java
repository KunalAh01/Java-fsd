package com;

public class Main {
	static int sumNatural(int n) {
		int sum=(n*(n-1))/2;
		return sum;
	}
	static int sum(int x ,int y) {
		return sumNatural(y) -sumNatural(x);
	}

	public static void main(String[] args) {
		int a=2;
		int b=6;
		System.out.println("sum "+sum(a,b));

	}

}
