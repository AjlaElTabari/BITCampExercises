package vjezbe;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int counter = 0;
		int sum = 0;
		
		do {
			System.out.println("Unesite broj");
			num = input.nextInt();
			sum += num;
			counter++;
		} while (num != 0);
		
		if (sum != 0) {
			System.out.println("Prosjek unesenih brojeva je: " + sum/(counter-1));
		}
		else {
			System.out.println("Suma unesenih brojeva je nula. Ja ne znam operirati s nulama");
		}

		input.close();
	}

}
