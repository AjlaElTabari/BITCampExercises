package vjezbe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket client = null;
		String request = "";
		
		try {
			server = new ServerSocket(2706);
			client = server.accept();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			request = reader.readLine();
		} catch (IOException e1) {
			System.out.println("Connection couldn't be established.");
			e1.printStackTrace();
		}
		
		try {			
			String[] parts = request.split(" ");
			String command = parts[0];
			String file = parts[1];
			int bufferSize = Integer.parseInt(parts[2]);
			
			OutputStream clientWriter = client.getOutputStream();
			FileInputStream clientReader = new FileInputStream(new File(file));
			
			byte[] buffer = new byte[bufferSize];
			int readBytes;
			
			while ((readBytes = clientReader.read(buffer, 0, buffer.length)) > 0) {
				clientWriter.write(buffer, 0, readBytes);
				System.out.println("Bytes sent: " + readBytes);
				
			}
			clientWriter.close();
			client.close();
			
			server.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
