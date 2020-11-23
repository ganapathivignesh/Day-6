package com.thread;



public class MainThread {

	public static void main(String[] args) {
		
		Thread1 t1=new Thread1();//thread 1 born stage
	    Thread2 t2=new Thread2();//object
	    Thread t3=new Thread(t2);//thread 2 born stage
	    t1.start();
	    t3.start();
	    
		

	}

}
