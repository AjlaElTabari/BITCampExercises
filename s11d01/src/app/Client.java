package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			System.out.println("Client application started.");
			Socket socket = new Socket("localhost", 8081);
			System.out.println("Client connected to localhost.");

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			System.out.println("I/O operating available now.");
			
			System.out.println("Server: " + reader.readLine());
			
			writer.write("E'o pomalo!");
			writer.newLine();
			writer.flush();
		
			Scanner input = new Scanner(System.in);
			System.out.println("Server: " + reader.readLine());
			System.out.print("Msg: ");
			writer.write(input.nextLine());
			writer.flush();
	
			boolean end = false;
			while (!end) {
				System.out.println("Client: " + reader.readLine());
				
				System.out.print("Msg: ");
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
