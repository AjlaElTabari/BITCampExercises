package predavanja;

public class Main_Point {

	public static void main(String[] args) {
		
		Coordinate2D point1 = new Coordinate2D(2, 4);
		Coordinate2D point2 = new Coordinate2D(3, 6);
		Coordinate2D point3 = new Coordinate2D(5, 1);
		Coordinate2D point4 = new Coordinate2D(point1);
		
		System.out.print("Distance between points: " + point1 + " and " + point2 + " is ");
		System.out.println(String.format("%.2f", point1.getDistance(point2)));
		
		System.out.println("Point1: " + point1);
		System.out.println("Point2: " + point2);
		System.out.println("Point3: " + point3);
		
		System.out.println("Are point2 and point3 are equal? " + point2.equals(point3)); 

		System.out.println("Point4: " + point4);
		System.out.println("Are point4 and point1 are equal? " + point1.equals(point4));

	}

}
