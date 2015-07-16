package predavanja;

import java.util.Scanner;

public class NajmanjiZajednickiDjelilac {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite brojeve");
		int a = input.nextInt();
		int b = input.nextInt();
		
		
		boolean hasDividers = false;

		for (int i = 2; i <= a && i <= b; i++) {
			if(a % i == 0 && b % i == 0){
				System.out.println("Najmanji zajednicki djelilac");
				System.out.println(i);
				hasDividers = true;
				break;
			}
		}

		if (!hasDividers) {
			System.out.println("Uneseni brojevi nemaju zajednickih djelilaca.");
		}
		input.close();

	}

}
