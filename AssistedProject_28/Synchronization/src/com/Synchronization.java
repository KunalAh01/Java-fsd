package com;

class a extends Thread{

	@Override
	synchronized public void run() {
		
			for(int i=0;i<15;i++) {
				System.out.println("i "+i);
			}
	}
	
	
}
class b extends Thread{
	@Override
	synchronized public void run() {
		
			for(int j=0;j<15;j++) {
				System.out.println("i "+j);
			}
	}
	
}


public class Synchronization {

	public static void main(String[] args) {
				
				a obj1=new a();
				b obj2=new b();
				obj1.start();
				obj2.start();
			}

		}


