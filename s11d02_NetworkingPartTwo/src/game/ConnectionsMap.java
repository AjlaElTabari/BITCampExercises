package game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class ConnectionsMap {

	public static void main(String[] args) {
		HashMap<String, String> connections = new HashMap<>();
		
		 try {
			BufferedReader in = new BufferedReader(new FileReader("received.txt"));
			 String line = "";
		        while ((line = in.readLine()) != null) {
		            String parts[] = line.split(" ");
		            connections.put(parts[0], parts[1]);
		        }
		        in.close();
		        System.out.println(connections);	
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		 System.out.println(getRandomIP(connections));
	}
	
	private static String getRandomIP(HashMap<String, String> map) {
		String address = "";
		
		Set keySet = map.keySet();
		
		int size = keySet.size();
		int item = new Random().nextInt(size); 
		int i = 0;
		for (Object obj : keySet)
		{
		    if (i == item) {
		    	if (!obj.toString().equals("10.0.82.22"))
		    	address = obj.toString();
		    }
		    i = i + 1;
		}
		
		return address;
	}

}
