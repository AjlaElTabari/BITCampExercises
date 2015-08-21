package zaid;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class Server {
	
	private static int bufferSize;
	
	public static void main(String[] args) {
		ServerSocket server = startServer(2706);
		
		Socket client = findClient(server);
		
		String msg = readFromClient(client);
		
		sendFile(msg, client);
	}
	
	/**
	 * Starts the server on the given port and
	 * returns the <code>ServerSocket</code> object.
	 * 
	 * @param port - Specified port.
	 * @return <code>ServerSocket</code> object.
	 */
	private static ServerSocket startServer(int port) {
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(port);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			showError("Wrong port specified. Port: " + port);
			System.exit(1);
		} catch (BindException e) {
			e.printStackTrace();
			showError("Server already listening on that port. Port: " + port);
			System.exit(1);
		} catch (IOException e) {
			e.printStackTrace();
			showError("Could not start server.");
			System.exit(1);
		}
		
		return server;
	}
	
	/**
	 * Blocks and waits for a client to connect with
	 * infinite timeout set.
	 * 
	 * @param server - Given server to listen for clients.
	 * @return The client that connected on the server.
	 */
	private static Socket findClient(ServerSocket server) {
		Socket client = null;
		
		try {
			client = server.accept();
		} catch (IOException e) {
			e.printStackTrace();
			showError("Could not find client.");
			System.exit(1);
		}
		
		return client;
	}
	
	/**
	 * Reads a single message from the client and
	 * checks if it's valid.
	 * 
	 * Note: Only reads one line.
	 * 
	 * @param client Given client that connected on the server.
	 * @return The message that the client sent.
	 */
	private static String readFromClient(Socket client) {
		String msg = null;
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
			msg = reader.readLine();
		} catch (IOException ex) {
			ex.printStackTrace();
			showError("Could not get I/O operations from client. IP: " + client.getInetAddress().getHostAddress());
			System.exit(1);
		}
		
		String[] splitted = null;
		try {
			if (msg == null) {
				throw new IllegalArgumentException("Wrong format of message.");
			}
			
			splitted = msg.split(" ");
			
			if (splitted.length != 3 || !"GET".equalsIgnoreCase(splitted[0]) || "null".equals(splitted[1])) {
				throw new IllegalArgumentException("Wrong format of message.");
			}
			
			bufferSize = Integer.parseInt(splitted[2]);
			
			if (bufferSize < 0) {
				throw new NumberFormatException();
			}			
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
			showError("Wrong buffer size given by client. Buffer size: " + splitted[2]);
			showError("Buffer size will be set to 1024.");
			bufferSize = 1024;
		} catch (IllegalArgumentException ex) {
			ex.printStackTrace();
			showError("Message from client is badly formatted.");
			System.exit(1);
		}
		
		return msg;
	}

	/**
	 * If all is well, this method sends the file,
	 * based on the information in the <code>msg</code> string
	 * to the given client.
	 * 
	 * @param msg - Message that the client sent.
	 * @param client - Client to whom the file needs to be sent.
	 */
	private static void sendFile(String msg, Socket client) {
		String[] splitted = msg.split(" ");
		
		File wantedFile = new File(splitted[1]);
		
		FileInputStream fis = null;
		try {
			if (wantedFile.isDirectory()) {
				throw new FileNotFoundException();
			}
			
			fis = new FileInputStream(wantedFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			showError("File not found: " + wantedFile);
			System.exit(1);
		}
		
		byte[] buffer = new byte[bufferSize];
		int readBytes;
		
		try {
			OutputStream out = client.getOutputStream();
			
			while ( (readBytes = fis.read(buffer, 0, bufferSize)) > 0) {
				out.write(buffer, 0, readBytes);
				out.flush();
			}
			
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
			showError("Could not read from file:" + wantedFile);
			System.exit(1);
		}
		
	}
	
	/**
	 * Displays an error on a pop-up window.
	 * 
	 * @param msg Message to be displayed.
	 */
	private static void showError(String msg) {
		JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
	}

}
