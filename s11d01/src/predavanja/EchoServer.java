package predavanja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static final int ECHO_PORT = 12347;
	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(ECHO_PORT);
		
		while (true) {
			System.out.println("Waiting for next request...");
			Socket clientSocket = server.accept(); // cekamo da se neko konektuje na nas
			System.out.println("Request accepted, waiting for request...");
			OutputStream os = clientSocket.getOutputStream();
			OutputStreamWriter writer = new OutputStreamWriter(os);
			writer.write("OK\n");
			writer.flush();
			System.out.println("Response flushed, closing connection...");
			os.close();
			clientSocket.close();
		}

		//server.close();
	}
}
