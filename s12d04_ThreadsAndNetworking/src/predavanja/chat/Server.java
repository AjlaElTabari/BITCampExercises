package predavanja.chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class Server {
	private static LinkedBlockingQueue<Client> clients;
	private static LinkedBlockingQueue<Message> messages;
	
	private static ExecutorService pool = Executors.newFixedThreadPool(8);
	
	
	public static void main(String[] args) {
		clients = new LinkedBlockingQueue<Client>();
		messages = new LinkedBlockingQueue<Message>();
		
		// Listeners
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
		

		// Senders
		pool.submit(new Sender());
		pool.submit(new Sender());
		pool.submit(new Sender());
		
		ServerSocket server;
		try {
			server = new ServerSocket(6815);
			Socket socket;
			
			while (true) {
				socket = server.accept();
				clients.add(new Client(socket));
				
				new Thread(new Listener()).start();
				new Thread(new Sender()).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static class Listener implements Runnable {

		@Override
		public void run() {
			Client client = null;
			try {
				client = clients.take();
				clients.add(client);
				BufferedReader reader = client.getReader();
				
				StringBuilder sb = new StringBuilder();
				
				while(reader.ready()) {
					sb.append(reader.readLine());
					Message msg = new Message(client.getId(), sb.toString());
					messages.add(msg);
				}			
				
				clients.add(client);
				
			} catch (InterruptedException | IOException e) {
				clients.remove(client);
				e.printStackTrace();
			}			
			pool.submit(this);
		}
	}
	
	private static class Sender implements Runnable {

		@Override
		public void run() {
			try {
				Message msg = messages.take();
				Client[] clientCopy = null;
				synchronized (clients) {
					clientCopy = new Client[clients.size()];
					for (int i = 0; i < clientCopy.length; i++) {
						clientCopy[i] = clients.take();
						clients.add(clientCopy[i]);
					}
				}
				
				for (int i = 0; i < clientCopy.length; i++) {
					BufferedWriter writer = clientCopy[i].getWriter();
					writer.write(msg.getMessage());
					writer.flush();
				}
				
			} catch (InterruptedException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pool.execute(this);
			
		}
		
	}

}
