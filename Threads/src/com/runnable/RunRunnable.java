package com.runnable;

public class RunRunnable {
	
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableExample1());
		t1.start();
		
		System.out.println("end of first thread");
		
		Thread t2 = new Thread(new RunnableExample2());
		t2.start();
		
		System.out.println("end of second thread");
		
		System.out.println("End of runnable threads");
		
	}

}
