package vjezbe.Suticase;

public class Main {

	public static void main(String[] args) {
		Suitcase s1 = new Suitcase(40);
		System.out.println(s1.getMaxCapcity());
		System.out.println(s1.getCurrCapcity());
		s1.addStaffToTheSuitcase(20);
		System.out.println(s1.getCurrCapcity());
		s1.addStaffToTheSuitcase(30);
		System.out.println(s1.getCurrCapcity());
		s1.addStaffToTheSuitcase(20);
		System.out.println(s1.getCurrCapcity());
	}

}
