package vjezbe;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Nizovi6 {
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
			

		System.out.println("Enter array members and locations for these members");
		int v = 0, idx = 0;
		
		try {
			for (int i = 0; i < newArray.length; i++) {
				System.out.println("Enter index");
				idx = input.nextInt();
				newArray[idx] = 0;	
				System.out.println("Enter value");
				v = input.nextInt();
				newArray[idx] = v;	
			}
		} catch (NullPointerException e) {
			System.out.println("Array cannot be null");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}catch (InputMismatchException e){
			System.out.println("Wrong input!");
		}
		
		System.out.println(Arrays.toString(newArray));
		input.close();

	}

}
