
public class Area {
	public static void main(String[] args) {
				
		int h = 4;
		int R = 6;
		
		double r = R/2.0;
		
		//Circumference and Area of a Roller
		double rollerVolume = Math.pow(r, 2) * Math.PI * h;
		double rollerArea = 2 * Math.pow(r, 2) * Math.PI + 2 * (r) * Math.PI * h;
		
		System.out.printf("\nV: %.2f cm3\nP: %.2f cm2", rollerVolume, rollerArea);

		
	}

}
