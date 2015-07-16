package predvanja;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnosiBrojeveDokSeNeUneseMinusJedan {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter integer numbers, enter -1 to end entering");
		int[] arrayOfInts = null;
		try {
			arrayOfInts = new int [10]; 
			@SuppressWarnings("unused")
			int i = 0, poz = 0;
			while (true) {
				int num = input.nextInt();
				if (poz < arrayOfInts.length) {
					arrayOfInts[poz] = num;
					poz++;
				} else {
					for (int j = 1; j <= arrayOfInts.length; j++) {
						arrayOfInts[j - 1] = arrayOfInts[j];
					}
					arrayOfInts[arrayOfInts.length-1] = num;
					poz++;
				} 
			}
		} catch (InputMismatchException e) {
			System.out.println("Wrong input!");
		}
		
		int max = -1;
		try {
			for (int i = 0; i < arrayOfInts.length; i++) {
				int arrayElements = arrayOfInts[i];
				if (arrayElements > max) {
					max = arrayElements;
				} 
			}
			System.out.println("Max is: " + max);
		} catch (NullPointerException e) {
			System.out.println("Array cannot be null");
		}
	
		for (int i = 0; i < arrayOfInts.length; i++) {
			System.out.println(arrayOfInts[i]);
		}
	
	input.close();
		
	}

}
