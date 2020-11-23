package com.thread;

public class Thread1 extends Thread{
	
	int a[]= {4,6,7,8,9,3};
	
	public void run()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println("thread1 "+a[i]+" ");
		}
	}

}
