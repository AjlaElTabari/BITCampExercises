package predavanja;

import java.io.*;

public class Main {

	public static void main(String[] args) {
//		InputStream is = System.in;
//		OutputStream os = System.out;
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("nesto.txt");
			os = new FileOutputStream("nesto.txt", true);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		
		Reader r = new InputStreamReader(System.in);
		Writer w = new OutputStreamWriter(System.out);
				
		BufferedReader br = new BufferedReader(r);
		BufferedWriter bw = new BufferedWriter(w);
		
		byte[] buffer = new byte[3];
		
		try {
			int read = 0;
			do {
				read = is.read(buffer);
				os.write(buffer, 0, read);
			} while ((is.available()) > 0);
			
			String s = "\nHello World\n";
			buffer = s.getBytes();
			os.write(buffer);

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
