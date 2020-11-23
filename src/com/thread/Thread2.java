package com.thread;


public class Thread2 implements Runnable {

	  int b[]= {17,15,14,13,10,19};
	@Override
	public void run() {
		for(int j=0;j<b.length;j++)
		{
			System.out.println("thread2 "+b[j]+" ");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
