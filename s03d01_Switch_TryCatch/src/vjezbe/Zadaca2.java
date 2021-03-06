package vjezbe;

import java.util.Scanner;

public class Zadaca2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Asking user to enter series of brackets that needs to be checked
		System.out.println("Enter series of curly brackets ");
		String bracketSeries = input.nextLine();
		
		// Declaring counters for opened and closed brackets
		int openBrackets = 0, bracketSeriesSize = 0;
		
		bracketSeriesSize = bracketSeries.length();
		
		// counting opened and closed  brackets
		for (int i = 0; i < bracketSeriesSize; i++) {
			char bit = bracketSeries.charAt(i);
			if (bit == '{') {
				openBrackets++;
			}
			else {
				openBrackets--;
			}
			
			if(openBrackets < 0) {
				System.out.println(false);
				System.exit(0);
			}
		}
		
		if (openBrackets == 0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		input.close();

	}

}
