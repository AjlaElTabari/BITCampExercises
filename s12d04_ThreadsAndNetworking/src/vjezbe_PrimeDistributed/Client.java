package vjezbe_PrimeDistributed;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
	private static int counter = 0;

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("10.0.82.98", 8000);
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String line = reader.readLine();
			System.out.println(line);
			String parts[] = line.split(" ");
			
			int a = Integer.parseInt(parts[0]);
			int b = Integer.parseInt(parts[1]);
			
			long start = System.currentTimeMillis();
			for (int i = a; i < b; i++) {
				if (isPrimeEfficient(i)) {
					counter++;
				}
			}
			System.out.println(System.currentTimeMillis() - start);
			System.out.println(counter);
			writer.write(counter + "");
			writer.newLine();
			writer.flush();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static boolean isPrimeEfficient(int num) {
		if (num == 2) {
			return true;
		}
		
		if (num % 2 == 0) {
			return false;
		}
		
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
