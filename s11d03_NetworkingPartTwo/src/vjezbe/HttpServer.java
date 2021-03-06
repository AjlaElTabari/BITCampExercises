package vjezbe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HttpServer {
		public static void main(String[] args) {
			try {			
				ServerSocket server = new ServerSocket(2706);
				System.out.println("Server started.");
				Set<String> ipSet = new TreeSet<>();
				
				BufferedReader br = new BufferedReader(new FileReader("ips.txt"));
				
				String line = null;
				while ((line = br.readLine()) != null) {
					ipSet.add(line);
				}
				
				while (true) {
					Socket client = server.accept();	
					
					BufferedWriter clientWriter = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
					BufferedReader clientReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
					
					BufferedReader fileReader = null;
					String htmlDoc = "";
					boolean printIps = true;
					try {
						String fromClient = clientReader.readLine();
						String[] wantedAddress = fromClient.split(" ");
					
						String address = "src/vjezbe/index.html";
								
						fileReader = new BufferedReader(new FileReader(new File(address)));
						
					} catch (NullPointerException ex) {
						continue;
					}
					
					while (fileReader.ready()) {
						htmlDoc += fileReader.readLine();
					}
					
					if (printIps) {
						Iterator<String> it = ipSet.iterator();
						while (it.hasNext()) {
							htmlDoc += it.next() + "<br>\n";
						}
					}
					
					htmlDoc += "</p></body></html>";
					clientWriter.write(htmlDoc);				
					clientWriter.close();
					client.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
