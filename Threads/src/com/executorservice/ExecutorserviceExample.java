package com.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.callable.CallableExample1;
import com.callable.CallableExample2;
import com.runnable.RunnableExample1;
import com.runnable.RunnableExample2;

public class ExecutorserviceExample {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		System.out.println("starting runable executor 1");
		executor.submit(new RunnableExample1());
		System.out.println("starting runnable executor 2");
		executor.submit(new RunnableExample2());
		
		
	
		System.out.println("starting callable executor 1");
		Future<Integer> futureInt =    executor.submit(new CallableExample1());
		System.out.println("starting callable executor 2");
		Future<String> futureString = executor.submit(new CallableExample2());
		
		System.out.println(futureInt.get());
		
		System.out.println(futureString.get());
		System.out.println("end of  executor");
		
		executor.shutdown();
		
		
		
		
		
	}

}
