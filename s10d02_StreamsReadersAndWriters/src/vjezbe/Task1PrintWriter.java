package vjezbe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Task1PrintWriter {

	public static void main(String[] args) {
		PrintWriter pw = null;

//			try {
//				pw = new PrintWriter(new File("task1.txt"));
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			}
			pw = new PrintWriter(System.out);

		for (int i = 1; i <= 100; i++) {
			pw.write(i + " String ");
		}
		pw.close();
	}

}
