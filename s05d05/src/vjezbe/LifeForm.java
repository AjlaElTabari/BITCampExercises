package vjezbe;

public abstract class LifeForm {
	private boolean isAlive;

	/**
	 * @param isAlive
	 */
	public LifeForm(boolean isAlive) {
		super();
		this.isAlive = isAlive;
	}

	/**
	 * @return the isAlive
	 */
	public boolean isAlive() {
		return isAlive;
	}


	/**
	 * @param isAlive the isAlive to set
	 */
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}


	public String toString() {
		String s = "Is this life form alive? ";
		s += (isAlive) ? "Yes" : "No";
		s += "\n";
		return s;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		if (this == obj) {
			return true;
		}
		
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		
		LifeForm lf = (LifeForm) obj;
		if (this.isAlive != lf.isAlive) {
			return false;
		}
		
		return true;
		
		
	}
 
}
