package museum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Represents a museum showpiece. For every showpiece, unique id will be
 * generated. Implements Comparable interface, that's why showpieces can be
 * sorted. 
 * 
 * @author ajla.eltabari
 *
 */
public class Showpiece implements Comparable<Showpiece> {
	private static int ID_COUNTER = 0;
	private int id;
	private String name;
	private String description;

	/**
	 * Constructor that makes an showpiece object
	 * 
	 * @param name
	 * @param description
	 */
	public Showpiece(String name, String description) {
		this.id = ID_COUNTER++;
		this.name = name;
		this.description = description;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Showpiece other = (Showpiece) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/**
	 * Prints out information about showpiece.
	 */
	public String toString() {
		return String.format("Showpiece id: %d \nName: %s \nDescription: %s",
				this.id, this.name, this.description);
	}

	@Override
	public int compareTo(Showpiece o) {
		return this.getName().compareTo(o.getName());
	}

	public static void sortShowpiecesByName(ArrayList<Showpiece> list) {
		Collections.sort(list, new Comparator<Showpiece>() {

			@Override
			public int compare(Showpiece o1, Showpiece o2) {
				return o1.name.compareTo(o2.name);
			}
		});
	}
}
