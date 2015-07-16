package vjezbe;

import java.util.Scanner;

public class UnosOdKorisnikaDokNeUneseParniBroj {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;

		do {
			System.out.println("Unesite broj");
			num = input.nextInt();
		} while (num % 2 != 0);

		System.out.println("Unijeli ste paran broj. Kraj izvrsavanja programa");
		
		input.close();

	}

}
