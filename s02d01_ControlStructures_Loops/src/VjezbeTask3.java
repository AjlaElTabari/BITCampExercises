

import java.util.Scanner;

public class VjezbeTask3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numNo = input.nextInt();
		int counter = 1;
		int sum = 0;

		while (counter <= numNo) {
			sum += counter;
			counter++;
		}
		System.out.println(sum);

		input.close();
	}

}
