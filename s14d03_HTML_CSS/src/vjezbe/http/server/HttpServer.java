package vjezbe.http.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import vjezbe.http.server.Zaid.ClientThread;

public class HttpServer {
	private static final String INDEX = "/index.html";
	private static final String MEDIA = "/media.html";
	private static final String DISCO = "/discography.html";
	private static final String ABOUT = "/about.html";
	private static final String CSS = "/main.css";
	
	private static ServerSocket server = null;
	private static BufferedReader reader = null;
	private static BufferedWriter writer = null;
	private static Map<String, String> siteMap = new HashMap<>();
	
	public static void startServer() {
		try {
			server = new ServerSocket(2706);
			System.out.println("Server started.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void waitForClients() {
		try {
			Socket client = server.accept();
			new ClientThread(client);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void loadWebsite() {
		loadSiteToTheMap(INDEX, "src/vjezbe/index.html");
		loadSiteToTheMap(MEDIA, "src/vjezbe/media.html");
		loadSiteToTheMap(DISCO, "src/vjezbe/discography.html");
		loadSiteToTheMap(ABOUT, "src/vjezbe/about.html");
		loadSiteToTheMap(CSS, "src/vjezbe/main.css");
		
		System.out.println(siteMap);
	}
	
	public static class ClientThread extends Thread {
		
		private Socket client;		
		private BufferedWriter writer;
		
		public ClientThread(Socket client) {			
			this.client = client;
			
			try {
				writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			} catch (IOException e) {
				System.err.println("Could not get I/O from client.");
				System.err.println("Message: " + e.getMessage());
				return;
			}
			
			start();			
		}
		
		@Override
		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
				String request = reader.readLine();
				String webpage = "";
				
				System.out.println(request);
				System.out.println(request.split(" ")[1]);
				
				switch (request.split(" ")[1]) {
				case INDEX:
					webpage = siteMap.get(INDEX);
					break;
				case MEDIA:
					webpage = siteMap.get(MEDIA);
					break;
				case DISCO:
					webpage = siteMap.get(DISCO);
					break;
				case ABOUT:
					webpage = siteMap.get(ABOUT);
					break;
				case CSS:
					webpage = siteMap.get(CSS);
					break;
				}
				
				writer.write(webpage);
				writer.newLine();
				writer.close();
				client.close();
			} catch (IOException e) {
				System.err.println("Could not send webpage to" + client.getInetAddress().getHostAddress());
				System.err.println("Message: " + e.getMessage());
			}
			System.out.println("Website sent!");
		}
	}
	
	private static void loadSiteToTheMap(String key, String path) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String page = "";
			while (reader.ready()) {
				page += reader.readLine();
			}
			
			siteMap.put(key, page);
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}		
}

