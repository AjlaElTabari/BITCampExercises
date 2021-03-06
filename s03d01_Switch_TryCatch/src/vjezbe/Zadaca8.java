package vjezbe;

import java.util.Scanner;

public class Zadaca8 {

	public static void main(String[] args) {
		// Asking user to enter url link in specified format
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter URL link in following format: http://stranica.com/homepage");
		String url = input.next();
		String name = "", subpage = "";

		int urlLength = url.length();

		// Iterating through the url address finding site name
		for (int i = 0; i < urlLength; i++) {
			if (url.charAt(i) == '/' && url.charAt(i + 1) == '/') {
				i += 2;
				do {
					name += url.charAt(i);
					i++;
				} while (url.charAt(i) != '/');
			} 			
		}
		
		// Iterating through the url address finding site subpage
		for (int i = 0; i < urlLength; i++) {
			if (url.charAt(i) == '/' && url.charAt(i - 1) != '/' && url.charAt(i - 1) != ':') {
				i ++;
				do {
					subpage += url.charAt(i);
					i++;
				} while (i < urlLength);
			} 			
		}

		System.out.println("Name: " + name);
		System.out.println("Subpage is: " + subpage);

		input.close();

	}

}
