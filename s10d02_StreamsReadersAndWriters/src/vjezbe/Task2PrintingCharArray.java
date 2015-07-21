package vjezbe;

import java.io.PrintWriter;

public class Task2PrintingCharArray {

	public static void main(String[] args) {
		char[] englishAlphabet = new char[26];
		char counter = 65;
		for (int i = 0; i < 26; i++) {
			englishAlphabet[i] = counter;
			counter++;
		}
		
		PrintWriter pw = new PrintWriter(System.out);
		
		int written = 0;
		int length = englishAlphabet.length;
		while (written < length) {
			if (written + 10 <= length) {
				pw.write(englishAlphabet, written, 10);
				written += 10;	
			} else {
				int len = length - written;
				pw.write(englishAlphabet, written, len);
				written = length;
			}
		}
		pw.close();

	}

}
