package vjezbe;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		 BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter("ips.txt"));
			writer.write("Test");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
