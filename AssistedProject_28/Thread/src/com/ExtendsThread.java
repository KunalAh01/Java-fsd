package com;

public class ExtendsThread extends Thread {
 	public void run()
 	{
  		System.out.println("Thread Running");
}


	public static void main(String[] args) {
		
		ExtendsThread th = new  ExtendsThread();
		  		th.start();
		 	}
		}



