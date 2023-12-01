package com;

public class TryCatch {

	public static void main(String[] args) {
		
		       int[] array = {2,4,6,8,10,12};
		        try 
		        {
		           System.out.println(array[10]);
		        }
		        catch (ArrayIndexOutOfBoundsException e) 
		        {
		            System.out.println(e.toString()); 
		        }
		        finally 
		        {
		            System.out.println("The size of array is " + array.length);
		        }
		    }
		}

