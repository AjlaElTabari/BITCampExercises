package predavanja;

public class Main_Circle {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(0, 1, 1);
		Circle c2 = new Circle(2, 4, 1);
		Circle c3 = new Circle(new Coordinate2D(1, 4), 6);
		Circle c4 = new Circle(new Coordinate2D(0, 2), 5);
		
		System.out.println(c1.areCirclesIntersecting(c2));		
		System.out.println(c2.areCirclesIntersecting(c3));		
		System.out.println(c3.areCirclesIntersecting(c4));		

	}

}
