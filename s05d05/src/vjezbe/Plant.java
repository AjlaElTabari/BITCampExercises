package vjezbe;

public class Plant extends LifeForm {
	public static final int THERE_IS_A_BIT = 0;
	public static final int THERE_IS_SOME = 1;
	public static final int THERE_IS_A_LOT = 2;
	private boolean isToxic;
	private int quantity;
	
	/**
	 * @param isAlive
	 * @param isToxic
	 * @param quantity
	 */
	public Plant(boolean isAlive, boolean isToxic, int quantity) {
		super(isAlive);
		this.isToxic = isToxic;
		this.quantity = quantity;
	}
	
	/**
	 * @return the isToxic
	 */
	public boolean isToxic() {
		return isToxic;
	}

	/**
	 * @param isToxic the isToxic to set
	 */
	public void setToxic(boolean isToxic) {
		this.isToxic = isToxic;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		
		String s = super.toString();
		s += "Is toxic? ";
		s += (this.isToxic) ? "Yes" : "No";
		s += "\nQuantity: ";
		if (this.quantity == 0) {
			s += "There is a bit.";
		} else if (this.quantity == 1) {
			s += "There is a some.";
		} else if (this.quantity == 2) {
			s += "There is a lot.";
		}
		s += "\n";
		return s;
	}
	
}
