package vjezbe;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Nizovi9 {

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
				int a = input.nextInt();
				while (a < 0 || a > 9) {
					System.out.println("Invalid input");
					a = input.nextInt();					
				} 
				newArray[i] = a;
			}	
		} catch (NullPointerException e) {
			System.out.println("Array cannot be null");
		}
		
		//int[] numbers = new int[10];
		
		for (int i = 0; i < newArray.length; i++) {
			
		}
		
		int zeros = 0, ones = 0, twos = 0, threes = 0, fours = 0, fives = 0, sixes = 0, sevens = 0, eights = 0, nines = 0;
		for (int i = 0; i < newArray.length; i++) {
			switch(newArray[i]) {
			case 0:
				zeros++;
				break;
			case 1:
				ones++;
				break;
			case 2: 
				twos++;
				break;
			case 3: 
				threes++;
				break;
			case 4: 
				fours++;
				break;
			case 5: 
				fives++;
				break;
			case 6: 
				sixes++;
				break;
			case 7: 
				sevens++;
				break;
			case 8: 
				eights++;
				break;
			case 9: 
				nines++;
				break;
			}
		}

		System.out.println("Zeros: " + zeros);
		System.out.println("Ones: " + ones);
		System.out.println("Twos: " + twos);
		System.out.println("Threes: " + threes);
		System.out.println("Fours: " + fours);
		System.out.println("Fives: " + fives);
		System.out.println("Sixes: " + sixes);
		System.out.println("Sevens: " + sevens);
		System.out.println("Eights: " + eights);
		System.out.println("Nines: " + nines);
		
		input.close();
	}
}
