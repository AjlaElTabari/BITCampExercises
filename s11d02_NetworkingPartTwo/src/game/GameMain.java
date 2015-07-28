package game;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class GameMain {

	public static void main(String[] args) {
		HashMap<String, String> connections = new HashMap<>();

		try {
			BufferedReader in = new BufferedReader(new FileReader(
					"received.txt"));
			String line = "";
			while ((line = in.readLine()) != null) {
				String parts[] = line.split(" ");
				connections.put(parts[0], parts[1]);
			}
			in.close();
			// System.out.println(connections);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Sockets
		// One server and two clients

		boolean connectionRefused = true;

		Scanner in = new Scanner(System.in);
		String msg = "";
		String a = "";
		try {
			ServerSocket server = new ServerSocket(8888);
			Socket client = server.accept();
			InetAddress ip = client.getInetAddress();
			String address = ip.getHostAddress();
			System.out.println(connections.get(address));

			Socket toZaid = new Socket("10.0.82.98", 8888);

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			msg = reader.readLine();
			System.out.println(msg);

			// poruka za Zaida
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					toZaid.getOutputStream()));

			a = in.nextLine();
			writer.write(msg + " " + a);
			writer.newLine();
			writer.flush();

			System.out.println("Poslala poruku Zaidu.");
		} catch (IOException e) {
			// connectionRefused = true;
		}

		while (connectionRefused) {
			try {
				Socket toRandom = new Socket(getRandomIP(connections), 8888);

				InetAddress ipRandom = toRandom.getInetAddress();
				String addressRandom = ipRandom.getHostAddress();
				System.out.println(connections.get(addressRandom));

				// poruka za nekoga random
				BufferedWriter writer1 = new BufferedWriter(
						new OutputStreamWriter(toRandom.getOutputStream()));

				writer1.write(msg + " " + a);
				writer1.newLine();
				writer1.flush();

				System.out.println("Poslala poruku nekome.");
				connectionRefused = false;

			} catch (IOException e) {
				// connectionRefused = true;
			}
		}
		// System.out.println(getRandomIP(connections));
	}

	private static String getRandomIP(HashMap<String, String> map) {
		String address = "";

		Set keySet = map.keySet();

		int size = keySet.size();
		int item = new Random().nextInt(size);
		int i = 0;
		for (Object obj : keySet) {
			if (i == item) {
				if (!obj.toString().equals("10.0.82.22"))
					address = obj.toString();
			}
			i++;
		}

		return address;
	}

}
