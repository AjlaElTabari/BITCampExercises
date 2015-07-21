package vjezbe;

import java.io.IOException;
import java.io.InputStream;

public class MyBufferedReader {
private InputStream is;
	
	public MyBufferedReader(InputStream is) {
		this.is = is;
	}
	
	public int read(char[] c, int off, int len) {
		int res = 0;
		try {
			res = is.read(convertCharsToBytes(c), off, len);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public int read(char[] c) {
		int res = 0;
		try {
			res = is.read(convertCharsToBytes(c));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public int read() {
		int res = 0;
		try {
			res = is.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	private byte[] convertCharsToBytes(char[] chars) {
		byte[] bytes = new byte[chars.length];
		for (int i = 0; i < chars.length; i++) {
			bytes[i] = (byte) chars[i];
		}
		return bytes;
	}
	
	public String readLine() {
		String s = "";
		while(is.available() > 0) {
			
			s += is.read();
		}
		return s;
	}
}
