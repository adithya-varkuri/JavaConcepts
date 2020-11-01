package com.callable;

import java.util.concurrent.Callable;

public class CallableExample2 implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println("in call2");
		 for(int i=0 ; i<100 ;i++) {
		    	System.out.println("secondcall" + i + ",");
		    }
		Thread.sleep(10*1000);
		return "adithya";
	}

}
