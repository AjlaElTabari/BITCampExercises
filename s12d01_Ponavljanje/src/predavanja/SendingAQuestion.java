package predavanja;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class SendingAQuestion {
	public static void main(String[] args) {
		
		try {
			Socket toBenjo = new Socket("10.0.82.113", 7321);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(toBenjo.getOutputStream()));
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(toBenjo.getInputStream()));
			
			Scanner input = new Scanner(System.in);
			System.out.println("Question:");
			String question = input.nextLine();
			
			writer.write(question);
			writer.newLine();
			writer.flush();
		
			String res = reader.readLine();
			System.out.println(res);
			
			writer.close();
			reader.close();
			
			System.out.println("Poslala poruku Benji.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
