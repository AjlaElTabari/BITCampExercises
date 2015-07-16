package vjezbe;

public abstract class Animal extends LifeForm {
	public static final int ANOTHER_ANIMALS = 0;
	public static final int PLANTS = 1;
	public static final int MAX_HEALTH = 100;
	public static final int MIN_HEALTH = 0;
	private double weight; 
	private int mainFood;
	private int health;
	
	/**
	 * @param isAlive
	 * @param weight
	 * @param mainFood
	 */
	public Animal(boolean isAlive, double weight, int mainFood, int health) {
		super(isAlive);
		this.weight = weight;
		this.mainFood = mainFood;
		this.health = health;
	}

	public String toString() {
		String s = super.toString();
		s += "Weight: " + this.weight + "\n";
		s += "Main food: ";
		s += (this.mainFood == 0) ? "Another animals" : "Plants";
		s += "Helath " + this.health + "\n";
		return s;
	}
	
	public abstract void eat(LifeForm lf);
}
