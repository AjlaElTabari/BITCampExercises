package vjezbe;

import java.io.IOException;
import java.io.OutputStream;

public class MyBufferedWriter {
	private OutputStream os;
	
	public MyBufferedWriter(OutputStream os) {
		this.os = os;
	}
	
	public void write(char c) {
		try {
			os.write(c);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void write(int i) {
		try {
			os.write(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void write(String s) {
		try {
			for (int i = 0; i < s.length(); i++) {
				os.write(s.charAt(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void newLine() {
		try {
			os.write(10);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void flush() {
		try {
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
