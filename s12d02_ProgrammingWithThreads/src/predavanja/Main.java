package predavanja;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Enter search: ");
		Scanner input = new Scanner(System.in);
		
		String searchString = input.nextLine();
		
		FileSearching fs = new FileSearching(searchString);
		fs.startSearch();
		
		input.close();
	}
}
