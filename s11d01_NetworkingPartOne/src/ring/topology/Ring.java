package ring.topology;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ring {

	public static void main(String[] args) {
		try {
			
			// poruka od senadina
			ServerSocket server = new ServerSocket(2706);
			Socket fromSenadin = server.accept();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					fromSenadin.getInputStream()));
			
			String msg = reader.readLine();
			
			System.out.println(msg);
			
			// poruka za Narenu
			Socket toNarena = new Socket("10.0.82.26", 6969);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					toNarena.getOutputStream()));
			
			writer.write(msg);
			writer.newLine();
			writer.flush();
			
			System.out.println("Poslala poruku Nareni.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
