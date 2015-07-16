package zadaca;
import java.util.Scanner;

public class Task6PrintNDigitOfEnteredNo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Asking user to enter the number ad the desired digit
		System.out.println("Unesite broj");
		long num = input.nextLong();
		System.out.println("Koju cifru po redu zelite prikazati?");
		int digit = input.nextInt();
		
		long tempNum = num, newNumrev = 0;
		int counter = 1;
		// Calculating digits from right
		while (tempNum != 0) {
			long remainder = tempNum % 10;
			newNumrev = newNumrev * 10 + remainder;

			// If reched digit is equal desired digit, print it out
			if (counter == digit) {
				System.out.println("Trazena cifra je " + remainder);
			}
			// incrising counter until it reaches desired digit
			counter++;
			tempNum /= 10;
		}
		
		input.close();
	}
}
