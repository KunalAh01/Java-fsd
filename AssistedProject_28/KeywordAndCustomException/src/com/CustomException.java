package com;

class voteException extends Exception{
	public voteException() {
		
	}
	public voteException(String msg) {
//		super()
		super(msg);
		
	}
}

public class CustomException {

	public static void main(String[] args) {
		
				int age=14;
				try {
				if(age<18) {
					throw new voteException("Age must be greater than 18");
				}
				else {
					System.out.println("You Can Vote!");
				}
				}catch(Exception e){
					System.out.println(e.toString());
					
				}
			}

		}

