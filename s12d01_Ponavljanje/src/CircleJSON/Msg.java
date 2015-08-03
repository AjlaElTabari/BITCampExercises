package CircleJSON;

public class Msg {
	private String name;
	private String timestamp;
	private String message;
	
	
	/**
	 * Empty Constructor
	 */
	public Msg() {
		super();
		this.name = null;
		this.timestamp = null;
		this.message = null;
	}
	
	/**
	 * @param name
	 * @param timestamp
	 * @param message
	 */
	public Msg(String name, String timestamp, String message) {
		super();
		this.name = name;
		this.timestamp = timestamp;
		this.message = message;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
