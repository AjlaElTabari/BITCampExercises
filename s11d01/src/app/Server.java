package app;

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
			ServerSocket server = new ServerSocket(8081);
			System.out.println("Application started.");
			System.out.println("Server socket made.");

			System.out.println("Listening for a client...");
			Socket client = server.accept();
			System.out.println("Client found!");

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			System.out.println("I/O operating available now.");
			
			writer.write("Kako si? Sta mai?");
			writer.newLine();
			writer.flush();

			Scanner input = new Scanner(System.in);
//			System.out.println("Client: " + reader.readLine());
//			System.out.print("Msg: ");
//			writer.write(input.nextLine());
//			writer.flush();
			
			boolean end = false;
			while (!end) {
				System.out.print("Msg: ");
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
				
				System.out.println("Client: " + reader.readLine());
			}
			
			input.close();
			reader.close();
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
