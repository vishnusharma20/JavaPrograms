package demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolConcept implements Runnable{
	
	private String name;
	
	ThreadPoolConcept(String name) {
		this.name=name;
	}

	
	public void run() {
		System.out.println("Thread Started :" + name);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread Ended :" + name);
		
	}

	
	public static void main(String[] args) {
		
		ExecutorService es= Executors.newFixedThreadPool(2);
		
		for(int i=1; i<10;i++) {
		Runnable r1= new ThreadPoolConcept("Worker Thread :" + i);
		es.execute(r1);
		}
		
		es.shutdown();
		
		while(!es.isTerminated()) {}
		System.out.println("All request completed successfully");
	}
	
}


