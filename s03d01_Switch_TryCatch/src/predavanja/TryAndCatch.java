package predavanja;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAndCatch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = 0;
		try {
			n = input.nextInt();
			System.out.println(n);
		} catch (InputMismatchException e){
			System.out.println("Pogresan unos!");
			e.printStackTrace();
		}
		

		input.close();
	}
}
