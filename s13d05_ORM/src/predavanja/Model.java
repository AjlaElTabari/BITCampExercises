package predavanja;

public abstract class Model {
	private String tableName;
	
	public String findByPK(Integer key) {
		return "SELECT * FROM " + tableName + " WHERE id = " + key;
	}
	
	public String findByAttribute(String attribute, String value) {
		return "SELECT * FROM " + tableName + " WHERE " + attribute + " = '" + value + "'";
	}
}
