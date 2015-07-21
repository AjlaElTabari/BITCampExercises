package predavanja;

import java.io.*;

public class UserMain {

	public static void main(String[] args) {
		User u = new User("Ajla", 31);
		try {
			OutputStream os = new FileOutputStream("user.dat", true);
			InputStream is = new FileInputStream("user.dat");
			ObjectOutputStream osw = new ObjectOutputStream(os);
			osw.writeObject(u);
			
			ObjectInputStream ois = new ObjectInputStream(is);
			User fromFile = (User)ois.readObject();
			System.out.println(fromFile);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
