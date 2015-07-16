package predavanja;

import java.util.Scanner;

public class PrintanjeZvjezdicaUgnjezdenaForPetlja {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Koliko redova zelite?");
		int a = input.nextInt();
		System.out.println("Koliko zvjezdica u redu zelite?");
		int b = input.nextInt();

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		input.close();
	}

}
