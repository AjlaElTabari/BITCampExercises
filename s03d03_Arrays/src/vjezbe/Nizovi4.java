package vjezbe;

import java.util.Arrays;
import java.util.Scanner;

public class Nizovi4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter some string");
		String string = input.nextLine();
		
		int arrayL = string.length();
		
		char[] chArr = new char [arrayL];
		
		for (int i = 0; i < chArr.length; i++) {
			chArr[i] = string.charAt(i);
		}
		
		char[] chArrRev = new char [arrayL];
		
		int j = chArr.length - 1;
		for (int i = 0; i < chArr.length; i++) {
			chArrRev[j] = chArr[i];
			j--;
		}
		
		System.out.println(Arrays.toString(chArrRev));

		input.close();
	}

}
