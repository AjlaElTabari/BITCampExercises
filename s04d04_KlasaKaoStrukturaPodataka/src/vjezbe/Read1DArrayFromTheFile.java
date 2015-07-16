package vjezbe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Read1DArrayFromTheFile {

	public static void main(String[] args) {

		getFromFile();
	}

	public static void getFromFile (){
		Scanner input = null;
		try {
			input = new Scanner(new File("src/ba/BITCamp/ajla/s04d04/vjezbe/1DArrayMembers"));
		} catch (FileNotFoundException ex) {
			System.out.println("File not found.");
			System.exit(0);
		}
			
		int size = 0;
		while (input.hasNextInt()) {
			input.nextInt();
			size++;
		}
		
		int[]arr = new int [size];
		
		try {
			input = new Scanner(new File("src/ba/BITCamp/ajla/s04d04/vjezbe/1DArrayMembers"));
		} catch (FileNotFoundException ex) {
			System.out.println("File not found.");
			System.exit(0);
		}
		
		for (int i = 0; i < arr.length; i++) {
			 arr[i] = input.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
 	}
}
