package predavanja.grep.application;

import java.util.Scanner;

public class MainSearch {
	
	public static void main(String[] args) {
		System.out.println("Enter search: ");
		Scanner input = new Scanner(System.in);
		
		String searchString = input.nextLine();
		
		Search s = new Search(searchString);
		s.startSearch();
		
		input.close();
	}
}
