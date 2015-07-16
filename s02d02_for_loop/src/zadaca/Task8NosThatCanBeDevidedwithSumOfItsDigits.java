package zadaca;
import java.util.Scanner;

public class Task8NosThatCanBeDevidedwithSumOfItsDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Asking user to enter the number
		System.out.println("Please enter the number");
		int n = input.nextInt();
		
		// Using division to access every single digit of entered no
		// Adding those digits to desired sum
		
		for (int i = 1; i < n; i++) {
			int sum = 0;
			int num = i;
			for (int j = i; j >= 1; j = num) {
				sum += (j % 10);
				num /= 10;
			}
			
			//Checking if number can be divided with sum of its digits
			if (i % sum == 0){
				System.out.println(i);
			}
		}
		
		input.close();
	}

}
