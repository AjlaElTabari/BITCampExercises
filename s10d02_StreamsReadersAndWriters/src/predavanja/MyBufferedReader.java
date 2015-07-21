package predavanja;

import java.io.*;

public class MyBufferedReader {
	public static void main(String[] args) {
		InputStream is = null;
			try {
				is = new FileInputStream("nesto.txt");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		
		Reader r = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(r);
		
		PrintWriter pw = new PrintWriter(System.out);
		
			
		try {
			String res = br.readLine();
			while (res != null) {
				pw.println(res);
				
				res = br.readLine(); 
			} 
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//pw.close();
	}
}
