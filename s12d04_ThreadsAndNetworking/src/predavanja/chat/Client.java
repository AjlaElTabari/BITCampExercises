package predavanja.chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

public class Client {
	private Socket socket;
	private String id;
	private BufferedReader reader;
	private BufferedWriter writer;
	private LinkedBlockingQueue<Message> messages;

	public Client(Socket socket) {
		this.socket = socket;
		this.id = socket.getInetAddress().getHostAddress();
		try {
			this.reader = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			this.writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addMessage(Message msg) {
		messages.add(msg);
	}

	public void sendMessages() {
		try {
			Iterator<Message> it = messages.iterator();
			while (it.hasNext()) {
				writer.write(it.next().getMessage());
			}
			writer.flush();
		} catch (IOException e) {
			messages.clear();
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
