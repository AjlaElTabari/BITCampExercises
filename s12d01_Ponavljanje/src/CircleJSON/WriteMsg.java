package CircleJSON;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;

public class WriteMsg {
	
	public static void main(String[] args) {
		ArrayList<String> messages = new ArrayList<>();
		
		String myMsg = "Omnia mea mecum porto";
		messages.add(myMsg);
				
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			mapper.writeValue(new File("C:/Users/Zaid/Desktop/messages.json"), messages);
			System.out.println("It worked!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
