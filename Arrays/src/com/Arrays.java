package com;

public class Arrays {

	public static void main(String[] args) {
		String[] cars;
		String[] bike= {"pulser","apache","tvs"};
		int[] a=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		System.out.println(a.length);
		System.out.println("............");
		for(int i=0;i<a.length;i++) {
			System.out.println(i);
		}
		System.out.println("for each");
		for(String element:bike) {
			System.out.println(element);
		}

	}

}
