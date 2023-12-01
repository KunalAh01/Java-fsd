package com;

public class Finally {

	public static void main(String[] args) {
		
	       
            int a=12,b=0;
            int c,d=1;
            	try
	            {
	                c=a/b;
	            }
	            catch(ArithmeticException e)
	            {
	                System.out.print(e.toString());
	            }
	            finally
	            {
	                System.out.print("\nvalue of d is "+d);
	            }
	        }
	}



