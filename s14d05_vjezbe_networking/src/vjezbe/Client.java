package vjezbe;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		try {
			Socket client = new Socket("localhost", 2706);
			
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String command = "GET";
			String fileName = "myao.jpg";
			int bufferSize = 15;
			
			String openConnectionCommand = command + " " + fileName + " " + bufferSize;
						
			writer.write(openConnectionCommand);
			writer.newLine();
			writer.flush();
			
			System.out.println("input stream?");
			
			InputStream in = client.getInputStream();
			File file = new File("received.jpg");
			
			FileOutputStream fileWrite = new FileOutputStream(file);
			
			byte[] data = new byte[bufferSize];
			int bytesRead;
			
			System.out.println("Client " + bufferSize);
			
			// Radi dok ima sta citati
			while ((bytesRead = in.read(data, 0, data.length)) > 0) {
				
				System.out.println("Bytes received: " + bytesRead);
				
				fileWrite.write(data, 0, bytesRead);
			}
			fileWrite.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
