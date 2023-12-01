package com;
class a implements Runnable {

	@Override
	public void run() {
		
		Thread tt1=Thread.currentThread();
		String name= tt1.getName();
				System.out.println("name is "+name);
	for(int i=0;i<5;i++) {
		System.out.println("i "+i);
		try {
			tt1.sleep(1000);
		}catch(Exception e) {}
		
	}
		
	}
	
}

public class RunnableInterface {

	public static void main(String[] args) {
		
				Runnable r1=new a();
				Thread t1=new Thread(r1);
				Thread t2=new Thread(r1);
				Thread t3=new Thread(r1);
				t1.setName("Kunal");
				t2.setName("Ahlawat");
				t3.setName("Vinayak");
				
				System.out.println("status of Thread t1 "+t1.isAlive());
				System.out.println("status of Thread t1 "+t2.isAlive());
				System.out.println("status of Thread t1 "+t3.isAlive());
				t1.start();
				t2.start();
				t3.start();
				System.out.println("status of Thread t1 "+t1.isAlive());
				System.out.println("status of Thread t1 "+t2.isAlive());
				System.out.println("status of Thread t1 "+t3.isAlive());
			}

		}

