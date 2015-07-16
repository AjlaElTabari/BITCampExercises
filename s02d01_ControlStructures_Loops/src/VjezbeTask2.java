

public class VjezbeTask2 {

	public static void main(String[] args) {
		int day = 5, month = 7, year = 1984;
		int currYear = 2015;
		
		while (currYear - year > 0) {
			System.out.println(day + ". " + month + ". " + year);
			year++;
		}

	}

}
