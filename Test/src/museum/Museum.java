package museum;

import java.util.ArrayList;

/**
 * Represents museum with its showpieces and employees.
 * 
 * @author ajla.eltabari
 *
 */
public class Museum {
	private ArrayList<Showpiece> showpieces;
	private ArrayList<Employee> employees;

	/**
	 * Constructor
	 * 
	 * @param showpieces
	 * @param employees
	 */
	public Museum(ArrayList<Showpiece> showpieces, ArrayList<Employee> employees) {
		super();
		this.showpieces = showpieces;
		this.employees = employees;
	}

	/**
	 * Prints out information about museum.
	 */
	@Override
	public String toString() {
		return "Museum has: " + employees.size() + " employees. They are: \n"
				+ employees + "\nIn this muesum you can see: " + showpieces;
	}

	/**
	 * Using method from implemented interface Searchable, finds all entries
	 * that meet search criteria and returns them.
	 * 
	 * @param artpieces
	 * @param s
	 * @return
	 */
	
	public ArrayList<Object> fitsSearch(ArrayList<Artpiece> artpieces, String s) {
		ArrayList<Object> searched = new ArrayList<>();
		for (int i = 0; i < artpieces.size(); i++) {
			if (artpieces.get(i).fitsSearch(s)) {
				searched.add(artpieces.get(i));
			}
		}

		return searched;
	}

}
