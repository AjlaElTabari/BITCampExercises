

import java.util.Scanner;

public class VjezbeTask5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numNo = input.nextInt();
		int counter = 1;

		while (counter <= numNo) {
			if (counter % 2 != 0 && counter % 3 == 0 && counter % 5 != 0) {
				System.out.println(counter);
			}
			counter++;
		}

		input.close();
	}

}
