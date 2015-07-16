package vjezbe;

import java.util.Scanner;

public class ObjektiVjezba {

	public static void main(String[] args) {
		System.out.println("Upisite ime");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		
		for(int i = 0; i < name.length(); i++) {
			if(i % 2 == 0) {
				System.out.print(name.toUpperCase().charAt(i));
			}
			else {
				System.out.print(name.toLowerCase().charAt(i));
			}
		}

		input.close();
	}

}
