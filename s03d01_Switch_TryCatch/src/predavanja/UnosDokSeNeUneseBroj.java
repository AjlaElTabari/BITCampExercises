package predavanja;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnosDokSeNeUneseBroj {

	public static void main(String[] args) {
		//getInput();
		try {
			divide(3, 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Nije moguce");
		}
	}
	
	public static int getInput() {
		Scanner input = new Scanner(System.in);
		int number;
	
		while (true) {
			try {
				System.out.println("Unesi broj");
				number = input.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Nije broj");
				input.nextLine();
			}
		}

		input.close();
		return number;
		
	}
	
	public static double divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Not 0");
		}
		return a / b;
	}

}
