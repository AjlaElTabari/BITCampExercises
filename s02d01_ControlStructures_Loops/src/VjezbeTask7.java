

import java.util.Scanner;

public class VjezbeTask7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj za koji zelite provjeriti da li je palindrom");
		int num = input.nextInt();
		
		int palindrome = num; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome /= 10;
        }
        
        if(reverse == num) {
        	System.out.println("Unesni broj je palindrom.");
        }
        else {
        	System.out.println("Unesni broj nije palindrom.");
        }

		input.close();
	}

}
