package vjezbe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Planet implements Comparable<Planet> {
	private String name;
	private Double diameter;
	private Double mass;
	private Double distanceFromTheStar;

	/**
	 * @param name
	 * @param diameter
	 * @param mass
	 * @param distanceFromTheStar
	 */
	public Planet(String name, Double diameter, Double mass,
			Double distanceFromTheStar) {
		super();
		this.name = name;
		this.diameter = diameter;
		this.mass = mass;
		this.distanceFromTheStar = distanceFromTheStar;
	}
	
	public static void sortByName(ArrayList<Planet> list) {		
		Collections.sort(list, new Comparator<Planet>() {

			@Override
			public int compare(Planet p1, Planet p2) {
				return p1.name.compareTo(p2.name);
			}
		});
	}
	
	public static void sortByDiameter(ArrayList<Planet> list) {		
		Collections.sort(list, new Comparator<Planet>() {

			@Override
			public int compare(Planet p1, Planet p2) {
				return p1.diameter.compareTo(p2.diameter);
			}
			
		});
	}
	
	public static void sortByMass(ArrayList<Planet> list) {		
		Collections.sort(list, new Comparator<Planet>() {

			@Override
			public int compare(Planet p1, Planet p2) {
				return p1.mass.compareTo(p2.mass);
			}
			
		});
	}
	
	public static void sortByDistanceFromTheStar(ArrayList<Planet> list) {		
		Collections.sort(list, new Comparator<Planet>() {

			@Override
			public int compare(Planet p1, Planet p2) {
				return p1.distanceFromTheStar.compareTo(p2.distanceFromTheStar);
			}
		});
	}

	@Override
	public String toString() {
		return "Planet: " + name + "\nDiameter: " + diameter + "\nMass: " + mass
				+ "\nDistance from native star: " + distanceFromTheStar + "\n\n";
	}

	@Override
	public int compareTo(Planet p) {
		return this.name.compareTo(p.name);
	}
}
