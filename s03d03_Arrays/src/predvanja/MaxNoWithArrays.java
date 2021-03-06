package predvanja;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxNoWithArrays {

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
		
		int max = -1;
				
		try {
			System.out.println("Enter array members, enter 0 to end entering");
			for (int i = 0; i < newArray.length; i++) {
				int num = input.nextInt();
				if (num > 0) {
					newArray[i] = num;
				} else {
					break;
				}
			}
			
			for (int i = 0; i < newArray.length; i++) {
				int arrayElements = newArray[i];
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
