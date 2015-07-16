package vjezbe;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Planet mercury = new Planet("Mercury", 3389.5, 0.107, 0.65);
		Planet venus = new Planet("Venus", 2389.5, 0.007, 0.63);		
		Planet mars = new Planet("Mars", 1389.5, 0.120, 0.61);		
		Planet jupiter = new Planet("Jupiter", 4389.5, 0.207, 0.60);
		Planet saturn = new Planet("Saturn", 8389.5, 0.160, 0.59);
		
		ArrayList<Planet> sollarSystem = new ArrayList<>();
		sollarSystem.add(mercury);
		sollarSystem.add(venus);
		sollarSystem.add(mars);
		sollarSystem.add(jupiter);
		sollarSystem.add(saturn);

//		System.out.println(mercury);
//		System.out.println(sollarSystem);
		
		//Planet.sortByDiameter(sollarSystem);
		Planet.sortByDistanceFromTheStar(sollarSystem);
		System.out.println(sollarSystem);


	}

}
