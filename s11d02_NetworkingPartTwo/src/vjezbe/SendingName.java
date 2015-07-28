package vjezbe;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class SendingName {

	public static void main(String[] args) {
		
		try {
			Socket toZaid = new Socket("10.0.82.98", 8888);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(toZaid.getOutputStream()));
			
			writer.write("Ajla");
			writer.newLine();
			writer.flush();
			
			System.out.println("Poslala poruku Zaidu.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
