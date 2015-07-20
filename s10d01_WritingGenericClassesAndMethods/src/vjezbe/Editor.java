package vjezbe;

public class Editor extends Application {

	public static final int TEXT = 0;
	public static final int PHOTO = 1;
	public static final int VIDEO = 2;
	
	private int type;
	private boolean isFreeware;
	
	/**
	 * @param name
	 * @param year
	 * @param version
	 * @param size
	 * @param type
	 * @param isFreeware
	 */
	public Editor(String name, int year, double version, double size, int type,
			boolean isFreeware) {
		super(name, year, version, size);
		this.type = type;
		this.isFreeware = isFreeware;
	}
	
	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the isFreeware
	 */
	public boolean isFreeware() {
		return isFreeware;
	}

	/**
	 * @param isFreeware the isFreeware to set
	 */
	public void setFreeware(boolean isFreeware) {
		this.isFreeware = isFreeware;
	}
	
	public String toString() {
		String result = "";
		switch (type) {
		case 0:
			result += "Text editor\n";
			break;
		case 1:
			result += "Photo editor\n";
			break;
		case 2:
			result += "Video editor\n";
			break;
		}
		result += "Is freeware? ";
		result += (isFreeware) ? "yes\n" : "no\n";
		
		return result;
	}
	
}
