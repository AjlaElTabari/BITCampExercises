package vjezbe;

public class WhenThreadsDontMakeSense {
	private static Integer COUNTER = 0;

	private static void startThreads() {
		Thread t1 = new Thread(new MyThread());
		Thread t2 = new Thread(new MyThread());

		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {
			startThreads();

			System.out.println("Interation " + i + ":" + COUNTER);
			COUNTER = 0;
		}
	}

	private static class MyThread implements Runnable {

		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				synchronized(COUNTER) {
				COUNTER += 10;
				}
			}

		}

	}
}
