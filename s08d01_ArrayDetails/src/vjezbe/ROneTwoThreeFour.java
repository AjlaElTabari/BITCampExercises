package vjezbe;


public class ROneTwoThreeFour {

	public static void main(String[] args) {
		char[] chArr = {'A', 'P', 'B', 'D'};
		int[] intArr = {1, 5, 0, 4};
		mixArrays(chArr, intArr);

	}

	public static void mixArrays(char[] arrString, int[] arrInt) {
		int counter = 0;
		String res = "";
		for (char s : arrString) {
			res += ((char)s + "" + arrInt[counter]);
			counter++;
		}
		System.out.println(res);
	}
}
