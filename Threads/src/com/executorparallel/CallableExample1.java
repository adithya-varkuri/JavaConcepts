package com.executorparallel;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableExample1 implements Callable<Object> {

	@Override
	public Integer call() throws Exception {
		System.out.println("in call 1");
		Random generator = new Random(); 
	    Integer randomNumber = generator.nextInt(5); 
	    for(int i=0 ; i<100 ;i++) {
	    	System.out.println("firstcall" + i + ",");
	    }
	    Thread.sleep(10*1000);
	    return randomNumber; 
	}
	

	

}
