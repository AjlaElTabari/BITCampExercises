package vjezbe.background.logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class LoggerThread extends Thread {
	private Socket sensor;
	
	public LoggerThread(Socket sensor) {
		this.sensor = sensor;
	}
	@Override
	public void run() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new InputStreamReader(sensor.getInputStream()));
			PrintWriter pw = new PrintWriter(new FileOutputStream(new File("src/backgroundLogger.txt"), true));
			
			String receivedMsg = "";
			String msgToWrite = "";
			String msgType = "";
			
			receivedMsg = reader.readLine();
			
			String parts[] = receivedMsg.split(" ");
			msgType = parts[0];
			
			System.out.println(msgType);
			
			if (msgType.equals("1") || msgType.equals("2") || msgType.equals("3") || msgType.equals("4")) {
				switch(msgType) {
				case "1": 
					msgToWrite = "[Temperature] " + parts[1] + " K";
					break;
				case "2": 
					msgToWrite = "[Pressure] " + parts[1] + " hPa";
					break;
				case "3": 
					msgToWrite = "[Movement] " + parts[1] + " TRUE";
					break;
				case "4":
					msgToWrite = "[Error] " + receivedMsg.substring(2);
					
				}
			} else {
				msgToWrite = "[COMM.ERROR] " + msgType + " is not a valid communication indentification number!";
			}
			
			pw.write(msgToWrite);
			pw.println();
			pw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
