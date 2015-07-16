package zadaca;
import java.util.Scanner;

public class Task3DigitsSumofEnteredNo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Asking user to enter the number
		System.out.println("Please enter the number");
		int num = input.nextInt();
		int sum = 0;
		// Using division to access every single digit of entered no
		// Adding those digits to desired sum
		for (int i = num; i >= 1; i = num) {
			sum += (i % 10);
			num /= 10;
		}
		// Printing calculated sum
		System.out.println(sum);
		input.close();
	}

}
