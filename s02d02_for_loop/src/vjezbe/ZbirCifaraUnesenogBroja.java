package vjezbe;

import java.util.Scanner;

public class ZbirCifaraUnesenogBroja {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum = 0;
		
		for (int i = num; i >= 1; i = num) {
			sum += (i % 10);
			num /= 10;
		}
		
		/*while (num >= 1) {
			sum += (num % 10);
			num /= 10;
		}*/
		
		System.out.println(sum);
		

		input.close();
	}

}
