package predavanja;
import java.util.Scanner;

public class ProstiBrojeviManjiOdUnesenog {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//System.out.println("Unesite broj");
		//int num = input.nextInt();
		
		int endInterval = 20;
		
		for(int j = 1; j <= endInterval; j++){
			// cheks if number is prime
			int num = j;
			boolean isPrime = true;
			for (int i = 2; i < num; i++) {
				// if there is an i which can divide num, num is not prime
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
				if(isPrime) {
					System.out.print(num + " ");
				}
		}
		

		input.close();

	}

}
