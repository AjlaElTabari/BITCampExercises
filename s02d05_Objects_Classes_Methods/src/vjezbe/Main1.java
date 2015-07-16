package vjezbe;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		// Instancing class Drink
		/*Drink voda = new Drink("Voda", false, 2016, "none");
		
		System.out.println(voda);
		
		Drink pepsi = new Drink("Pepsi", true, 2015, "black");
		
		System.out.println(pepsi);*/
		
		Scanner input = new Scanner(System.in);
		
		// Instancing class Bug
		String type, color;
		int size;
		boolean isDangerous, looksNice;
		
		System.out.println("What type is your bug? ");
		type = input.next();	
		System.out.println("Does your bug look nice? ");
		looksNice = input.nextBoolean();
		System.out.println("Is your bug dangerous? ");
		isDangerous = input.nextBoolean();
		System.out.println("What size is your bug in mm? ");
		size = input.nextInt();
		System.out.println("What color is your bug? ");
		color = input.next();
		
		
		Bug bug1 = new Bug(type, looksNice, isDangerous, size, color);
		
		System.out.println("\n" + bug1);
		
		// Calling the method to check if given number is prime, that method is defined below main method in this class
		System.out.println("Enter the number for checking ");
		int a = input.nextInt();
		System.out.println(isPrime(a));

		input.close();

	}
	
	public static boolean isPrime(int num) {
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}

