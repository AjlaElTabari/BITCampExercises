package zadaca;
import java.util.Scanner;

public class Task9PrintingTriangleMadeOfStars {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Asking user to enter size of triangle side
		System.out.println("Kolika je stranica zeljenog trougla?");
		int a = input.nextInt();

		// Drowing triangle using * and nested for loops
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		input.close();

	}

}
