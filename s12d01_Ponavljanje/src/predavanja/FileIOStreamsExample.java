package predavanja;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileIOStreamsExample {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("src/HelloWorld.txt");
		
			byte[] buffer = new byte[10];
			
			while (is.available() > 0) {
				is.read(buffer);
				for (byte b : buffer) {
					System.out.println(b);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
