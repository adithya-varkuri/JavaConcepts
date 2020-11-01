package com.executorparallel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ExecutorserviceExample {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executor = Executors.newFixedThreadPool(5);

		List<Callable<Object>> tasks = new ArrayList<Callable<Object>>();
		tasks.add(new CallableExample1());
		tasks.add(new CallableExample2());
		List<Future<Object>> results = executor.invokeAll(tasks);	
		
		Integer valueInt = (Integer) results.get(0).get();
		System.out.println("int value " + valueInt);
		String valueString = (String) results.get(1).get();
		System.out.println("String  value " + valueString);
		
		executor.shutdown();
		System.out.println("end of excutor");
		
		
		
		
		
	}

}
