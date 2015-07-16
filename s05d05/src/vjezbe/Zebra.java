package vjezbe;

public class Zebra extends Animal {
	public static final int HEALTHY = 0;
	public static final int ILL = 1;
	public static final int TERMINATING_ILL = 2;
	private int age; // in Months
	private int state;

	/**
	 * @param isAlive
	 * @param weight
	 * @param mainFood
	 * @param age
	 * @param state
	 */
	public Zebra(boolean isAlive, double weight, int mainFood, int health,
			int age, int state) {
		super(isAlive, weight, mainFood, health);
		this.age = age;
		this.state = state;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}

	public String toString() {
		String s = super.toString();
		s += "Age: " + this.age + "\n";
		s += "State: ";
		if (this.state == 0) {
			s += "Healthy";
		} else if (this.state == 1) {
			s += "Ill";
		} else if (this.state == 2) {
			s += "Terminating ill";
		}
		s += "\n";
		return s;
	}

	public void eat(LifeForm lf) {
		if (lf instanceof Plant && this.isAlive() == true) {
			Plant p = (Plant) lf;
			if (p.isToxic() == true) {
				System.out.println("Plant was toxic, zebra is dead :(");
				this.setAlive(false);
			}
			System.out.println("mmmm njam njam njam");
		} else {
			System.out
					.println("Zebras can eat only plants and only if they are alive.");
		}
	}
}
