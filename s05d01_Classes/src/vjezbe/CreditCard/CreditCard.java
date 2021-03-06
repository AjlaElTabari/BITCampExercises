package vjezbe.CreditCard;

public class CreditCard {
	private String ccNumber;
	private String bank;
	private int validToMonth;
	private int validToYear;
	private double balance;
	
	/**
	 * @param ccNumber
	 * @param bank
	 * @param validToMonth
	 * @param validToYear
	 */
	public CreditCard(String ccNumber, String bank, int validToMonth,
			int validToYear) {
		super();
		this.ccNumber = ccNumber;
		this.bank = bank;
		this.validToMonth = validToMonth;
		this.validToYear = validToYear;
	}
	
	public double getBalance () {
		return balance;
	}
	
	public void addMoney (double amount) {
		balance += amount;
	}
	
	public void takeMoney (double amount) {
		balance -= amount;
	}
	
}
