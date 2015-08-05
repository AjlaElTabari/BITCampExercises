package vjezbe;

import java.util.Random;

public class RandomNosOneThread {
	public static void main(String[] args) {
		int[] numbers = new int [10_000_000];
		
		Random rand = new Random();
		int random = 0;
		int counter = 0;

		for (int i = 0; i < numbers.length; i++) {
			random = 1 + rand.nextInt(100 - 1 + 1);
			numbers[i] = random;
		}
		
		random = 1 + rand.nextInt(100 - 1 + 1);
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < numbers.length; i++) {
			random = 1 + rand.nextInt(100 - 1 + 1);
			if (numbers[i] == random) {
				counter++;
			}
		}
		
		long end = System.currentTimeMillis();

		System.out.println("ponavlja se: " + counter);
		System.out.println("Time needed with multiple threads: " + (end - start));
	}
}
