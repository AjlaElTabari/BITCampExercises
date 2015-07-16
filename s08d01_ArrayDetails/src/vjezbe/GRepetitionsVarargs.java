package vjezbe;

public class GRepetitionsVarargs {

	public static void main(String[] args) {
		System.out.println(getRepetitions(7, 5, 2, 3, 5, 9, 7, 7, 25, 63));

	}
	
	public static int getRepetitions(int desiredNo, int... params) {
		int counter = 0;
		for (int number : params) {
			if (number == desiredNo) {
				counter++;
			}
		}
		return counter;
	}

}
