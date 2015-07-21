package vjezbe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

public class Task3Objects {

	public static void main(String[] args) {
		Player p1 = new Player("Edin Dzeko", "Manchester City", "BiH");
		Player p2 = new Player("Edin Dzeko1", "Manchester City", "BiH");
		Player p3 = new Player("Edin Dzeko2", "Manchester City", "BiH");
		Player p4 = new Player("Edin Dzeko3", "Manchester City", "BiH");
		
		LinkedList<Player> players = new LinkedList<>();
		
		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);
		
		try {
			OutputStream os = new FileOutputStream("Task3.txt");
			ObjectOutputStream osw = new ObjectOutputStream(os);
			InputStream is = new FileInputStream("Task3.txt");
			ObjectInputStream ois = new ObjectInputStream(is);
			
			Iterator<Player> it = players.iterator();
			while (it.hasNext()) {
				osw.writeObject(it.next());
			}	
			
			while (ois.available() > -1) {
				Player newPlayer = (Player)ois.readObject();
				System.out.println(newPlayer);
			}
			
			os.close();
			osw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 

	}
}
