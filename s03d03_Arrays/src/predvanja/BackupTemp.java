package predvanja;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BackupTemp {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter integer numbers, enter -1 to end entering");
		int[] arrayOfInts = null;
		try {
			arrayOfInts = new int [10]; 
			int i = 0;
			while (true) {
				int num = input.nextInt();
				if (num > -1) {
					arrayOfInts [i] = num;
					i++;
					if (i == arrayOfInts.length) {
						i = 0;
					}
				} else {
					break;
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
	
	
	input.close();

	}

}
