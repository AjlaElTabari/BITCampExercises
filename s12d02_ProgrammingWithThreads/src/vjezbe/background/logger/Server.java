package vjezbe.background.logger;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(2706);
			
			while (true) {
				Socket sensor = server.accept();
				
				LoggerThread logger = new LoggerThread(sensor);
				logger.start();
				
			}

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
