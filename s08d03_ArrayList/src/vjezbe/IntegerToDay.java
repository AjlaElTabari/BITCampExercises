package vjezbe;

import java.util.ArrayList;
import java.util.Arrays;

public class IntegerToDay {

	public static void main(String[] args) {
		System.out.println(getDay(5));

	}

	public static String getDay(int day) {
		ArrayList<String> days = new ArrayList(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
		return days.get(day-1);
	}
}
