package zadaca;
import java.util.Scanner;

public class Task7PrintingAllPerfectNosFrom1ToEnteredNo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// Asking user to enter limit number
		System.out.println("Unesite broj");
		long n = input.nextLong();

		// Finding and calculating sum of dividers for every number from 1 to n
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			// Checking if number is perfect
			if (i == sum) {
				System.out.println(i);
			} 
		}
		
		input.close();
	}

}
