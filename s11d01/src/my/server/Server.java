package my.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(1806);
			Socket client = server.accept();
			
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			
			writer.newLine();
			writer.flush();

			Scanner input = new Scanner(System.in);
			
			boolean end = false;
			while (!end) {
				System.out.println("Narena: " + reader.readLine());
				System.out.print("Msg: ");
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
				
			}
			
			input.close();
			reader.close();
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
