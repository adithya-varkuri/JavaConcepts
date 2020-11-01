package com.executorwait;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.runnable.RunnableExample1;
import com.runnable.RunnableExample2;

public class ExecutorserviceExample {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		System.out.println("starting runable executor 1");
		executor.submit(new RunnableExample1());
		System.out.println("starting runnable executor 2");
		executor.submit(new RunnableExample2());
		
		System.out.println("end of  executor");
		
		executor.shutdown();
		
		boolean finished =false;
		//This thread waits untill all the threads are completed 
		finished= executor.awaitTermination(15, TimeUnit.MINUTES);
		System.out.println(finished);
		System.out.println("executor shutdown");
		
		
		
	}

}
