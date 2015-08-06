package predavanja.chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
	private Socket socket;
	private String id;
	private BufferedReader reader;
	private BufferedWriter writer;
	
	public Client (Socket socket) {
		this.socket = socket;
		this.id = socket.getInetAddress().getHostAddress();
		try {
			this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			this.writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the reader
	 */
	public BufferedReader getReader() {
		return reader;
	}

	/**
	 * @return the writer
	 */
	public BufferedWriter getWriter() {
		return writer;
	}

	public void close() {
		try {
			this.socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
