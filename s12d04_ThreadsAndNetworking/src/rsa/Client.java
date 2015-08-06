package rsa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		try {
			
			while (true) {
			Socket socket = new Socket("10.0.82.16", 8000);
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
				String line = reader.readLine();
				String parts[] = line.split(" ");
				
				BigInteger a = new BigInteger(parts[0]);
				BigInteger b = new BigInteger(parts[1]);
				System.out.println(a + " " + b);
				BigInteger result = isFb(a, b);
				System.out.println(result);
				if (!result.equals(new BigInteger("0"))) {
					break;
				}
				
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private static BigInteger isFb(BigInteger start, BigInteger end) {
		BigInteger res = new BigInteger("0");;
		BigInteger num = new BigInteger("1050809377681880902769");
		for (BigInteger i = start; end.compareTo(i) > 0; i = i.add(new BigInteger("1"))) {
			if(num.mod(i).equals(new BigInteger("0"))) {
				res = i;
				break;
			}
		}
		return res;
	}
}
