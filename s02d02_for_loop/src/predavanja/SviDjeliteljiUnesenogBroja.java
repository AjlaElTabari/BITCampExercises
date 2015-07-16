package predavanja;

import java.util.Scanner;

public class SviDjeliteljiUnesenogBroja {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite broj za koji zelite pronaci djelitelje bez ostatka");
		int a = input.nextInt();

		System.out.println("Djelitelji unesenog broja su: ");

		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				System.out.print(i + " ");
			}
		}

		input.close();
	}

}
