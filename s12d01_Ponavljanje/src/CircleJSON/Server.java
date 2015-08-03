package CircleJSON;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;

import org.codehaus.jackson.map.ObjectMapper;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			Socket socket = server.accept();
			Socket client = new Socket("10.0.82.106", 8000);

			InputStream input = socket.getInputStream();
			OutputStream output = client.getOutputStream();
			FileOutputStream fos = new FileOutputStream("src/messages.json");
			FileInputStream fis = new FileInputStream("src/messages.json");

			ArrayList<Msg> messages = new ArrayList();

			byte[] buffer = new byte[1024];
			int read;
			while ((read = input.read(buffer, 0, 1024)) > 0) {
				fos.write(buffer, 0, read);
				fos.flush();

			}

			ObjectMapper mapper = new ObjectMapper();

			messages = mapper.readValue(new File("src/messages.json"),
					ArrayList.class);
			Msg myMsg = new Msg("Ajla", Calendar.getInstance().getTime()
					.toString(), "Omnia mea mecum porto.");
			messages.add(myMsg);

			mapper.writeValue(client.getOutputStream(), messages);			
//			try {
//				mapper.writeValue(new File("src/messages.json"), myMsg);
//				System.out.println("It worked!");
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			byte[] buffer1 = new byte[1024];
//			int kolko;
//			while ((kolko = fis.read(buffer1, 0, 1024)) > 0) {
//				output.write(buffer1, 0, kolko);
//				output.flush();
//			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
