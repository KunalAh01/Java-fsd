package com;

public class Throw {

	public static void main(String[] args) {
		
		int age=17;
			try {
				if(age<18) {

					throw new Exception("Age must be greater than 18");

				}
				else {
					System.out.println("You Can Vote!");
				}
				}catch(Exception e){
					System.out.println(e.toString());
					
				}
			}

	

}
