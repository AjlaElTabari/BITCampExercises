package predavanja;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
	
	public static void runExample() {
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		es.submit(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("Prvi task");
			}
		});
		
		es.submit(new Runnable() {

			@Override
			public void run() {
				System.out.println("Drugi task");
				
			}
		});
		
		es.shutdown();
	}
	
	public static void main(String[] args) {
		new ExecutorServiceExample().runExample();
	}
}
