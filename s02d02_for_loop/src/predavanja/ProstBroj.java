package predavanja;

import java.util.Scanner;

public class ProstBroj {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite broj");
		int a = input.nextInt();
		boolean isPrime = true;

		if (a == 1) {
			isPrime = true;
		}
		if (a % 2 == 0) {
			System.out.println("Broj je paran i nije prost.");
		}

		for (int i = 3; i <= a / 2; i += 2) {
			if (a % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("Broj je prost");
		} else {
			System.out.println("Broj nije prost");
		}

		input.close();

	}

}
