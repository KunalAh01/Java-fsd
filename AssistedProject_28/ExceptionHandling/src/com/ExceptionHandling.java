package com;
class MyException extends Exception{
	   String str1;
	   MyException(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}

public class ExceptionHandling {

	public static void main(String[] args) {
				try{
					System.out.println("This is try block");
					throw new MyException("Error");
				}
				catch(MyException exp){
					System.out.println("Catch Block") ;
					System.out.println(exp) ;
				}
			   }
			}

