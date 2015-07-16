package predavanja;
import java.util.Scanner;

public class ForPetlja {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite maksimalan broj");
		int a = input.nextInt();
		
		
		for (int i = 0; i <= a; i += 2) {
			System.out.print(i + " ");
		}

		input.close();
	}

}
