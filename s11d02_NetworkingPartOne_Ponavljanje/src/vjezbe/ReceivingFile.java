package vjezbe;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.URLConnection;

public class ReceivingFile {

	public static void main(String[] args) {
		try {
			Socket toZaid = new Socket("10.0.82.98", 7777);
			
			InputStream in = toZaid.getInputStream();
			File file = new File("received.txt");
			FileOutputStream fileWrite = new FileOutputStream(file);
			
			byte[] data = new byte[1024];
			int bytesRead;
			
			// Radi dok ima sta citati
			while ((bytesRead = in.read(data, 0, data.length)) > 0) {
				fileWrite.write(data, 0, bytesRead);
			}
			fileWrite.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
