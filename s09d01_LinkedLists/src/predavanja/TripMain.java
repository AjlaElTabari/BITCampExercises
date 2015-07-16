package predavanja;

import java.util.Scanner;

public class TripMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Trip t = new Trip();
		
		Place head = null;
		Place last = null;
		
		System.out.println("Please enter place");
		
		while(true) {
			
			String str = input.nextLine();
			
			if(!str.equals("")) {
				t.addPlace(new Place(str));
			} else {
				break;
			}
		}
		
		System.out.println(t);
						
		
		
		
		input.close();

	}

}
