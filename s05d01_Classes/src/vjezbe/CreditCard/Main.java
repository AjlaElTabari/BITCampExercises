package vjezbe.CreditCard;

public class Main {

	public static void main(String[] args) {
		CreditCard c1 = new CreditCard("1203 4005 6330 43688", "City Bank", 6, 1018);
		System.out.println(c1.getBalance());
		c1.addMoney(2500);
		System.out.println(c1.getBalance());
		c1.takeMoney(500);
		System.out.println(c1.getBalance());
		
		Wallet w1 = new Wallet(6);
		System.out.println(w1.getBalance());
		w1.addMoney(200);
		System.out.println(w1.getBalance());
		w1.addMoney(150);
		System.out.println(w1.getBalance());
		w1.takeMoney(60);
		System.out.println(w1.getBalance());
		w1.addCard(c1);

	}

}
