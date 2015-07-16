package zadaca;

import java.util.Scanner;

public class Task2NMemberOfFibonacciArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		// Asking user to enter what member of Fibonacci array They want
		System.out.println("Koji clan Fibonacijevog niza zelite izracunati? ");
		int n = input.nextInt();
		
		// Limitiation: 1 < n < 50
		if (n > 50 || n <= 1)
		{
			System.out.println("Broj mora biti veci od 1 i manj od 50.");
		}
		// Checking if desired member is second one
		else if (n == 2){
			System.out.println("Drugi clan Fib niza je " + 1);
		}
		// Calculating Fibonacci array until we reach desired member
		else {
			long fib1 = 1, fib2 = 1, fib3 = 0;
			int counter = 2;
			do {
				fib3 = fib1 + fib2;
				fib1 = fib2;
				fib2 = fib3;
				counter++;
			} while (counter != n);
			
			// Print out desired member
			System.out.println(n + "ti clan Fib niza je " + fib3);
		}
		
		input.close();

	}

}
