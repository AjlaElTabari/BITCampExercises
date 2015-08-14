package predavanja.searchEngine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WebContent {

	public static void main(String[] args) {
			URL klix;
			try {
				klix = new URL("http://klix.ba");
				URLConnection connection = klix.openConnection();
				BufferedReader in = new BufferedReader(new InputStreamReader(
						connection.getInputStream()));
				String inputLine;
				while ((inputLine = in.readLine()) != null) 
					System.out.println(inputLine);
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
