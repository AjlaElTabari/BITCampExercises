package predavanja;

import java.util.Scanner;

public class SviParniBrojevi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite broj");
		int a = input.nextInt();

		System.out.println("Svi parni brojevi do unesenog broja su broja su: ");

		for (int i = 1; i <= a; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		input.close();

	}

}
