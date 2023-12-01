package com;

class apps implements Runnable{
	

@Override
public synchronized void run() {
	Thread tt1=Thread.currentThread();
	String name=tt1.getName();
	for(int i=0;i<8;i++) {
		System.out.println(name + " name");
		try {
			tt1.sleep(1000);
		}catch(Exception e) {
			System.out.println(e);
		}
		if(i==0 && name.equals("Kunal")) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

}

public class SleepWait {

	public static void main(String[] args) {

		apps b1=new apps();
		Thread t1=new Thread(b1);
		Thread t2=new Thread(b1);
		Thread t3=new Thread(b1);
		t1.setName("Kunal");
		t2.setName("Gaurav");
		t3.setName("Anshit");
		t1.start();
		t2.start();
		t3.start();

	}

}


