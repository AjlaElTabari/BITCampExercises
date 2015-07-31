package homework25;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

public class NormalServer {
	public static void main(String[] args) {
		try {
			ServerSocket server =  new ServerSocket(2707);
			
			Socket client = server.accept();
			InetAddress ip = client.getInetAddress();
			String address = ip.getHostAddress();
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("ips.txt", true));
			writer.write(address + " " + Calendar.getInstance().getTime());
			writer.newLine();
			writer.flush();

			OutputStream clientWriter = client.getOutputStream();
			FileInputStream clientReader = new FileInputStream(new File("src/vjezbe/myao.jpg"));
			
			byte[] buffer = new byte[1024];
			int readBytes;
			
			while ((readBytes = clientReader.read(buffer, 0, buffer.length)) > 0) {
				clientWriter.write(buffer, 0, readBytes);
				clientWriter.flush();
			}
			clientReader.close();
			clientWriter.close();
			client.close();
			server.close();	
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
