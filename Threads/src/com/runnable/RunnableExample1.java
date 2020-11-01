package com.runnable;

import java.util.Random;

public class RunnableExample1 implements Runnable {

	@Override
	public void run() {
		System.out.println("in run 1");
		Random generator = new Random(); 
	    Integer randomNumber = generator.nextInt(5); 
	    for(int i=0 ; i<100 ;i++) {
	    	System.out.println("firstrun" + i + ",");
	    }
		
	}

}
