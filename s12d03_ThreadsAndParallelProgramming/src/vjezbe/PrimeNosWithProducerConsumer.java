package vjezbe;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class PrimeNosWithProducerConsumer {

	static LinkedBlockingQueue<Runnable> queue;
	static ArrayList<Slave> slaves;
	static int endInterval = 1_000_000;
	static volatile Integer counter = 0;
	static Object lock = new Object();
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		queue = new LinkedBlockingQueue<>();
		// Produce the tasks and add them to the queue
		int step = endInterval / 1000;
		for (int i = 0; i < 1000; i++) {
			System.out.print(i * step + " - ");
			System.out.println( (i + 1) * step);
			queue.add(new Task(i * step, (i + 1) * step));
		}
		
		// Make the consumers and let them consume
		slaves = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			Slave s = new Slave();
			s.start();
			slaves.add(s);
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (true) {
			if (queue.isEmpty()) {
				long end = System.currentTimeMillis();
				System.out.println("Number of prime numbers: " + counter);
				System.out.println("Time needed with multiple threads: " + (end - start));
				//System.out.println("Nije tacno ima ih 78498");
				
				break;
			}
		}
		
	}
	
	// Consumers
	static class Slave extends Thread {
		
		@Override
		public void run() {			
			while (!queue.isEmpty()) {
				try {
					Runnable job = queue.take();
					job.run();					
				} catch (InterruptedException e) {
					break;
				}
			}
		}
	}
	
	// Jobs to do
	static class Task implements Runnable {
		int start;
		int end;
		
		public Task(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public void run() {
			for (int i = start; i < end; i++) {
				if (isPrime(i)) {
					synchronized(lock) {
						counter += 1;
					}
				}
			}
		}
	}
	
	private static boolean isPrime(int number) {
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
