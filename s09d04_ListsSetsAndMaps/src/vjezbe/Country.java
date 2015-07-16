package vjezbe;

import java.util.*;

public class Country {
	public static enum SortCriteria {NAME, POPULATION, AREA};
	private String name;
	private Integer population;
	private Double area;
	
	public Country(String name, int population, double area) {
		this.name = name;
		this.population = population;
		this.area = area;
	}
	
	public static void sortCountries(ArrayList<Country> list, EnumSet<SortCriteria> enumSet) {
		if (enumSet.contains(SortCriteria.NAME)) {
			Collections.sort(list, new Comparator<Country>() {

				@Override
				public int compare(Country o1, Country o2) {
					return o1.name.compareTo(o2.name);
				}
			});
		} else if (enumSet.contains(SortCriteria.POPULATION)) {
			Collections.sort(list, new Comparator<Country>() {

				@Override
				public int compare(Country o1, Country o2) {
					return o1.population.compareTo(o2.population);
				}
			});
		} else if (enumSet.contains(SortCriteria.AREA)) {
			Collections.sort(list, new Comparator<Country>() {

				@Override
				public int compare(Country o1, Country o2) {
					return o1.area.compareTo(o2.area);
				}
			});
		}
	}
	
	public String toString() {
		return name + " " + population + " " + area;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Country> countries = new ArrayList<>();
		
		Country bih = new Country("Bosnia and Herzegovina", 1500000, 51000);
		Country hr = new Country("Hrvatska", 500000, 80000);
		Country jo = new Country("Jordan", 750000, 45000);
		Country me = new Country("Macedonia", 6000000, 100000);
		Country sr = new Country("Serbia", 35000000, 90000);

		countries.add(me);
		countries.add(sr);
		countries.add(bih);
		countries.add(hr);
		countries.add(jo);

		System.out.println(countries);
		
		EnumSet<SortCriteria> enumSet = EnumSet.of(SortCriteria.NAME);
		sortCountries(countries, enumSet);
		
		System.out.println(countries);
	}

}
