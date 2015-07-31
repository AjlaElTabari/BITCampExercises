package vjezbe;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
	private static BufferedWriter writer = null;
	public static void main(String[] args) {
		try {
			Socket client = new Socket("10.0.82.27", 8000);
			writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			ClientGUI window = new ClientGUI();
			
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void sendToServer(String msg) {
		try {
			writer.write(msg);
			writer.newLine();
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
