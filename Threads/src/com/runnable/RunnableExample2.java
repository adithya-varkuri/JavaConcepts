package com.runnable;

public class RunnableExample2 implements Runnable {

	@Override
	public void run() {
		System.out.println("in run2");
	 for(int i=0 ; i<100 ;i++) {
	    	System.out.println("secondrun" + i + ",");
	    }
	 }

}
