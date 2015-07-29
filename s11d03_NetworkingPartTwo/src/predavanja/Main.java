package predavanja;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
	private static final int PORT = 7321;

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(PORT);

			while (true) {
				Socket client = server.accept();
				BufferedReader br = new BufferedReader(new InputStreamReader(
						client.getInputStream()));

				String line = "";

				String method = "";
				String location = "";
				String protocol = "";

				while ((line = br.readLine()) != null) {
					if (line.contains("GET") || line.contains("POST")) {
						
						String parts[] = line.split(" ");

						method = parts[0];
						location = parts[1];
						protocol = parts[2];
						break;
					}
				}
				
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
						client.getOutputStream()));
				
				try {
					String htmlContent = FIleHandler.getContent(location);
					
					Result.ok(bw, htmlContent);
				} catch (FileNotFoundException e) {
					Result.notFound(bw);
				} catch (IOException e) {
					Result.serverError(bw);
				}
				
				
				client.close();
				
				//System.out.println(method + " " + location + " " + protocol);
				//break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
