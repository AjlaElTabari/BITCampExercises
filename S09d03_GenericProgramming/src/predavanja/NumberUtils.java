package predavanja;

public class NumberUtils {

	public static int getMax(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static Number getMax(Number[] array) {
		Number max = 0;
		if (array != null && array.length > 0) {
			max = array[0];
			for (int i = 1; i < array.length; i++) {
				if (array[i].doubleValue() > max.doubleValue()) {
					max = array[i].doubleValue();
				}
			}
		}
		return max;
	}
}
