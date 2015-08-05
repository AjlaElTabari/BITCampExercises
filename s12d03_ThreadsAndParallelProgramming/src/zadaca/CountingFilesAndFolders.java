package zadaca;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class CountingFilesAndFolders {
	static LinkedBlockingQueue<Runnable> queue;
	static ArrayList<Worker> workers;
	static int counterFile = 0;
	static int counterDirectory = 0;
	static Object lockFileCounterFile = new Object();
	static Object lockFileCounterDirectory = new Object();

	public static void main(String[] args) {
		
		queue = new LinkedBlockingQueue<>();
		// Produce the tasks and add them to the queue
		File root = new File("/");
		queue.add(new Task(root));
		
		long start = System.currentTimeMillis();
		// Make the consumers and let them consume
		workers = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			Worker w = new Worker();
			w.start();
			workers.add(w);
		}
		
		for (Worker w : workers) {
			try {
				w.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		

		
		//while (true) {
			if (queue.isEmpty()) {
				long end = System.currentTimeMillis();
				System.out.println("Directories: " + counterDirectory);
				System.out.println("Files: " + counterFile);
				System.out.println("Time needed to count: " + (end - start));
			}
		//}
	}
	
	// Consumers
	static class Worker extends Thread {
		
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
	
	static class Task implements Runnable {
		private File file;

		public Task(File file) {
			this.file = file;
		}

		@Override
		public void run() {
			try {
				for (File f : file.listFiles()) {
					if (f.isFile() && !f.isHidden()) {
						synchronized (lockFileCounterFile) {
							counterFile++;						
						}
					} else if (f.isDirectory() && !f.isHidden()) {
						synchronized (lockFileCounterDirectory) {
							counterDirectory++;						
							queue.add(new Task(f));
						}
					}
				}
			} catch (NullPointerException e) {
				
			}
		}
	}
}
