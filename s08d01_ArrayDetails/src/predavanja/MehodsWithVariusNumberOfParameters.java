package predavanja;

public class MehodsWithVariusNumberOfParameters {

	public static void main(String[] args) {
		System.out.println(sumParams(1, 2, 3, 4, 5, 6));
		System.out.println(sumParams(1, 2));
		System.out.println(sumParams(1));
		
		//int[] arr = {5, 5, 5, 5};
		System.out.println(sumParams(new int[]{5, 5, 5, 5}));
		
		System.out.println(stringify("as", "dsfs", "-5d8"));
		System.out.println(stringify(1.3, 2.003, 3, 4, 5, 6));

	}

	private static int sumParams(int... params) {
		int sum = 0;
		for (int i= 0; i <params.length; i++) {
			sum += params[i];
		}
		return sum;
	}
	
	private static String stringify(Object... params) {
		StringBuilder sb = new StringBuilder();
		for (Object s : params) {
			sb.append(s);
		}
		return sb.toString();
	}
}
