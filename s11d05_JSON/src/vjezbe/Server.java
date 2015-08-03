package vjezbe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			Socket socket = server.accept();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			ServerGUI window = new ServerGUI();
			
			while (true) {
				String command = reader.readLine();
				window.draw(command);				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
