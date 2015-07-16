

import java.util.Scanner;

public class VjezbeTask8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int counter = 3;
		boolean isFreeNum = true;

		if (num == 1) {
			System.out.printf("Uneseni broj je %d, i on je prost broj.", num);
		} else if (num % 2 == 0) {
			System.out
					.printf("Uneseni broj je %d, i paran je, samim tim nije prost broj.",
							num);
			isFreeNum = false;
		} else {
			while (counter < num / 2) {
				if (num % counter == 0) {
					System.out.printf(
							"Uneseni broj je %d, i on nije prost broj.", num);
					isFreeNum = false;
					break;
				}
				counter += 2;
			}

			if (isFreeNum) {
				System.out.printf("Uneseni broj je %d, i on je prost broj.",
						num);
			}
		}

		input.close();
	}

}