package museum;

/**
 * This interface contains fitsSearch(String s) method. It would be implemented
 * every time this interface is implemented. This method should be implemented
 * in a way that object can be searched by all its attributes.
 * 
 * @author ajla.eltabari
 *
 */
public interface Searchable {
	/**
	 * Should check if any of objects attributes is equal, or contains (if some
	 * kind of description is in case) provided string.
	 * 
	 * @param s
	 * @return
	 */
	public boolean fitsSearch(String s);
}
