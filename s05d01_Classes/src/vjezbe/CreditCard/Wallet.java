package vjezbe.CreditCard;

public class Wallet {
	private double balance;
	private CreditCard[] creditCards;
	private int maxCardsCanFit;
	

	
	/**
	 * @param maxCardsCanFit
	 */
	public Wallet(int maxCardsCanFit) {
		super();
		this.creditCards = new CreditCard[maxCardsCanFit];
		this.maxCardsCanFit = maxCardsCanFit;
		this.balance = 0;
		this.creditCards = null;
	}

	public double getBalance () {
		return balance;
	}
	
	public void addMoney (double amount) {
		balance += amount;
	}
	
	public void takeMoney (double amount) {
		balance = (balance - amount >= 0) ? balance - amount : balance;
	}
	
	public void addCard (CreditCard c) {
		int cNo = 0;
		for(CreditCard cc : creditCards) {
			cNo++;
		}
		if (creditCards.length > cNo) {
			creditCards[cNo] = c;
		}
	}
	
}
