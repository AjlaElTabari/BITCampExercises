package zadaca;
import java.util.Scanner;

public class Task4SumofDividersofEnteredNo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Asking user to enter the number
		System.out
				.println("Unesite broj za koji zelite pronaci i sabrati djelitelje bez ostatka");
		int a = input.nextInt();
		int sum = 0;

		// Finding all int dividers of entered number
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				// Summing those dividers
				sum += i;
			}
		}
		// Printing out calculated sum
		System.out.print("Suma sjelitelja unesenog broja je " + sum);
		input.close();

	}

}
