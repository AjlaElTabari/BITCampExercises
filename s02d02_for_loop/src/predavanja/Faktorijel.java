package predavanja;

import java.util.Scanner;

public class Faktorijel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite broj");
		int a = input.nextInt();
		int faktorijel = 1;

		System.out.println("Faktorijel unesenog broja iznosi: ");

		for (int i = 1; i <= a; i++) {
			faktorijel *= i;
			}

		System.out.println(faktorijel);
		
		input.close();
	}

}
