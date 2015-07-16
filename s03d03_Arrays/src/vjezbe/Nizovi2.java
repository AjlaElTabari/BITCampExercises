package vjezbe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nizovi2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int arrayL = 0;
		try {
			System.out.println("Enter array length");
			arrayL = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Wrong input!");
		}
		
		int[] newArray = null;
		try {
			newArray = new int[arrayL];
		} catch (NegativeArraySizeException e) {
			System.out.println("Array size cannot be a negative number!");
		}
				
		try {
			System.out.println("Enter array members");
			for (int i = 0; i < newArray.length; i++) {
				newArray[i] = input.nextInt();	
			}
		} catch (NullPointerException e) {
			System.out.println("Array cannot be null");
		}
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}

		input.close();
	}

}
