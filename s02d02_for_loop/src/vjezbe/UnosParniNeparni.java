package vjezbe;

import java.util.Scanner;

public class UnosParniNeparni {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0, countParni = 0, countNeparni = 0;

		do {
			System.out.println("Unesite broj");
			num = input.nextInt();
			if (num % 2 == 0 && num != 0) {
				countParni++;
			}
			else if (num != 0) {
				countNeparni++;
			}
		} while (num != 0);

		System.out.printf("Unijeli ste %d parnih brojeva i %d neparnih brojeva", countParni, countNeparni);
		
		input.close();


	}

}
