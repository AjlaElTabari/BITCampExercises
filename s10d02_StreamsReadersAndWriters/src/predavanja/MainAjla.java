package predavanja;

import java.io.*;

public class MainAjla {

	public static void main(String[] args) {
		InputStream is = System.in;
		
		byte[] buffer = new byte[3];
		
		try {
			int read = 0;
			do {
				read = is.read(buffer);
				System.out.println("Procitao: " + read);
				printByteArray(buffer, read);
			} while ((is.available()) > 0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Gotovo");
		


	}
	
	private static void printByteArray(byte[] array, int length) {
		for (int i = 0; i < length; i++) {
			System.out.print((char)array[i]);
		}
		System.out.println();
	}

}
