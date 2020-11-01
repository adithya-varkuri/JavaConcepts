package com.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class RunCallables {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println(System.currentTimeMillis());
		FutureTask<String> futureString =  new FutureTask<>(new CallableExample2());
		Thread  t = new Thread(futureString);
		t.start();
		String randomvalueString = futureString.get(); 
		System.out.println(randomvalueString);
		System.out.println(System.currentTimeMillis());
		
		System.out.println(System.currentTimeMillis());
		FutureTask<Integer> futureInteger =  new FutureTask<>(new CallableExample1());
		Thread  t2 = new Thread(futureInteger);
		t2.start();
		
		Integer randomvalueInt = futureInteger.get(); 
		System.out.println(randomvalueInt);
		System.out.println(System.currentTimeMillis());
		
		System.out.println("end of program");
		
	}

}
