package com;

public class Throws {
	static void dis1() throws Exception {

		int a=10/0;

		System.out.println("hello exception dis1 here");
	}
	static void dis2() {
		try {
		dis1();
		}catch(Exception e){
			System.out.println(e.toString());
		}
		System.out.println("hello exception dis2 here");
	}
	
			public static void main(String[] args){
				
				dis2();
				
				System.out.println("hello exception main here");
			
			}

		}


