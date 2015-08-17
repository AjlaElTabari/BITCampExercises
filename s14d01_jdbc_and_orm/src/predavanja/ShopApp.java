package predavanja;

import java.math.BigDecimal;

import org.avaje.agentloader.AgentLoader;

import predavanja.models.Product;
import predavanja.models.Purchase;
import predavanja.models.User;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;



public class ShopApp {
	
	// Transformacija klasa
	static {
		AgentLoader.loadAgentFromClasspath("avaje-ebeanorm-agent",
				"debug=1;packages=predavanja.models.**");
	}
	
	// Inicijalizacija servera. Obavezno mora biti nakon transformacije klasa!
	private static EbeanServer server = Ebean.getServer("h2"); 

	public static void main(String[] args) {

		// kreiranje novog zapisa o korisniku u bazi
		
		User first = new User();
		first.setFullName("Ajla El Tabari");
		first.setEmail("ajla@tabari.me");
		first.setBalance(new BigDecimal(0));

		Ebean.save(first);
		
		User second = new User();
		first.setFullName("Gordan Masic");
		first.setEmail("gogo@bitcamp.ba");
		first.setBalance(new BigDecimal(0));

		Ebean.save(second);
		
		Product p1 = new Product();
		p1.setTitle("Monitor");
		p1.setPrice(new BigDecimal("99.99"));
		p1.setQuantity(20);
		
		Ebean.save(p1);
		
		Purchase pur1 = new Purchase();
		pur1.setProduct(p1);
		pur1.setUser(first);
		
		first.setBalance(first.getBalance().subtract(p1.getPrice()));
		p1.setQuantity(p1.getQuantity() - 1);
		
		Ebean.save(pur1);

	}
}
