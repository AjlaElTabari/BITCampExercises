import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner br = null;
		try {
			br = new Scanner(new File("Caesar.ciph"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String origigi = "";
		String decoded = "";
		int c = 0;
		int shift = 6;
		String decodedText = "";
		
			while(br.hasNext()) {
				origigi = br.next();
				origigi = origigi.toLowerCase();
				decoded = "";
				
				for (int i = 0; i < origigi.length(); i++) {
					if (origigi.charAt(i) >= 97  && origigi.charAt(i) <= 122) {
						if (origigi.charAt(i) >= 97 + shift) {
							c = origigi.charAt(i) - shift;
							decoded += (char)c;
						} else {
							c = origigi.charAt(i) + 26 - shift;
							decoded += (char)c;
						}
						
					} else {
						c = origigi.charAt(i);
						decoded += (char)c;
					}

			}
				decodedText += decoded + " ";
			}
			
			String str = "nije bitan.";
			int str2 = 0;
			
			for (int i = 0; i < str.length(); i++) {
				str2 += (int)str.charAt(i);
			}
			
			System.out.println(str2);

			System.out.println(decodedText);

	}
}


