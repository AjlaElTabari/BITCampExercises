package predvanja;

import java.util.Scanner;

public class FirstArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter array length");
		int arrayL = input.nextInt();
		
		int[] newArray = new int[arrayL];
		
		System.out.println("Enter array members");
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = input.nextInt();
		}
		
		System.out.println("Array members are:");
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}
		

		input.close();
	}

}
