package vjezbe;

public class PrimeNosOneThread {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int counter = 0;
		for (int i = 10; i < 1_000_000; i++) {
			if (isPrime(i)) {
				counter++;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("Number of prime numbers: " + counter);
		System.out.println("Time needed with one thread: " + (end - start));
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
