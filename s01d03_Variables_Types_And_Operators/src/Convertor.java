

import java.util.Scanner;

public class Convertor {
	public static void main(String[] args) {
		
		int celsius;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite stepene C");
		celsius = input.nextInt();
		
		System.out.println(celsius + "C = " + (celsius + 273.15) + "K");
		System.out.println(celsius + "C = " + (celsius * 1.8000 + 32.00) + "F");
		System.out.println();
				
		int degrees;
		System.out.println("Unesite stepene");
		degrees = input.nextInt();
		System.out.println(degrees + " degrees = " + degrees*(Math.PI/180) + " radians");
		
		input.close();
	}
}
