package predavanja;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FIleHandler {
	private static final String PATH_TO_PUBLIC = "./public";
	
	public static String getContent(String route) throws FileNotFoundException, IOException {
		String fullPath = routeBuilder(route);
		
		// otvoriti stream
		
		BufferedReader br = new BufferedReader(new FileReader(fullPath));
		StringBuilder sb = new StringBuilder();
		
		String line = null;
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
//		try {
//			
//			FileInputStream fs = new FileInputStream(fullPath);
//			
//			StringBuilder sb = new StringBuilder();
//			int read = 0;
//			while ((read = fs.read()) != -1) {
//				sb.append((char)read);	
//			}
//				
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		return sb.toString();
	}
	
	private static String routeBuilder(String route) {
		if (route.equals("/")) {
			route = "/index.html";
		}
		return PATH_TO_PUBLIC + route;
	}
}
