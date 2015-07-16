

import java.util.Scanner;

public class VjezbeTsk6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int counter = 0;
		
		while (num >= 1) {
			num /= 10;
			counter++;
		}
		
		System.out.println(counter);

		input.close();
	}

}
