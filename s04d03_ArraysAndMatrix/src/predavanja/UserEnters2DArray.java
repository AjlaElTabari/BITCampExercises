package predavanja;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserEnters2DArray {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			int rows = 0, cols = 0, desiredColumn = 0;
			System.out.println("\nPlease enter the size of desired matrix");
			System.out.println("How many rows your matrix will have?");
			rows = input.nextInt();
			System.out.println("How many columns your matrix will have?");
			cols = input.nextInt();

			int[][] matrix = new int[rows][cols];

			ArraysHelper.fill2DArrayFromTheConsole(matrix);

			System.out
					.println("\nRegarding input you provide, the matrix looks like this:");
			ArraysHelper.print2DArray(matrix);

			System.out.println("\nWhat column do you want to see?");
			desiredColumn = input.nextInt();
			System.out.println(Arrays.toString(ArraysHelper.get2DArrayColumn(
					matrix, desiredColumn)));
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("Wrong input!");
		}

	}
}
