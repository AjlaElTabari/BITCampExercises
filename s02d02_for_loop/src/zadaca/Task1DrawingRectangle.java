package zadaca;

import java.util.Scanner;

public class Task1DrawingRectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		// Asking user for sides of rectangle
		System.out.println("Rectangle side1");
		int a = input.nextInt();
		System.out.println("Rectangle side2");
		int b = input.nextInt();

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if ((i == 1 || i == a) && (j == 1 || j == b)) {
					System.out.print("+");
				}
				else if (j == 1 || j == b){
					System.out.print("|");
				}
				else if (i == 1 || i == a) {
					System.out.print("-");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		input.close();
	}

}
