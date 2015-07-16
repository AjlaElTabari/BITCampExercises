package zadaca;

import java.util.Scanner;

public class Task10FindingLargestCommonDivider {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Asking user to enter two numbers
		System.out.println("Unesite brojeve za koje zelite pronaci NZD");
		int a = input.nextInt();
		int b = input.nextInt();
		
		// Checking which number is smaller
		int c = 0;
		if (a > b) {
			c = b;
		}
		else if (b > a) {
			c = a;
		}
		else {
			System.out.println("Uneseni brojevi su jednaki i njihov najveci zajednicki djelilac je " + a);
		}

		// Finding the first common divider starting from the smaller entered no, 
		// if found it is the largest common divider and we are terminating program execution
		for (int i = c; i >= 1; i--) {
			if(a % i == 0 && b % i == 0){
				System.out.print("Najveci zajednicki djelilac je ");
				System.out.println(i);
				break;
			}
		}
		input.close();


	}

}
