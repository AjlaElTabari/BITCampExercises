package predavanja;

public class CardMain {

	public static void main(String[] args) {
		
		try{
			Card c1 = new Card(14, Card.HEART);
			System.out.println(c1.getCard());		
			Card c2 = new Card(13, Card.DIAMOND);
			System.out.println(c2.getCard());		
			Card c3 = new Card(12, Card.CLUB);
			System.out.println(c3.getCard());	
		} catch (IllegalArgumentException e) {	
			e.printStackTrace();
		}

	}

}
