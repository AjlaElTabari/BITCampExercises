package vjezbe;

public class Tiger extends Animal {
	public static final int HIBERNATION = 0;
	public static final int HUNTING = 1;
	public static final int EATING = 2;
	private double speed;
	private int state;
	
	/**
	 * @param isAlive
	 * @param weight
	 * @param mainFood
	 * @param speed
	 * @param state
	 */
	public Tiger(boolean isAlive, double weight, int mainFood, int health, double speed,
			int state) {
		super(isAlive, weight, mainFood, health);
		this.speed = speed;
		this.state = state;
	}

	public String toString() {
		String s = super.toString();
		s += "Speed: " + this.speed + "\n";
		s += "State: ";
		if (this.state == 0) {
			s += "Hibernation";
		} else if (this.state == 1) {
			s += "Hunting";
		} else if (this.state == 2) {
			s += "Eating";
		}
		s += "\n";
		return s;
	}
	
	/**
	 * 
	 */
	public void eat(LifeForm lf){
		if(lf instanceof Animal && !(lf instanceof Tiger) && this.state == HUNTING && this.isAlive() == true) {
			if(lf instanceof Zebra) {
				Zebra z = (Zebra)lf;
				if(z.getState() == Zebra.TERMINATING_ILL || z.getState() == Zebra.ILL) {
					System.out.println("Zebra was ill, tiger is dead :(");
					this.setAlive(false);
				} else {
				this.state = EATING;
				System.out.println("mmmm njam njam njam");
				}
			}		
		} else {
			System.out.println("Tiger cannot eat plants or tigers!");
		}
	}

}
