package predavanja_inheritance;

public class Main {

	public static void main(String[] args) {
		Employee e = new Employee("John", "male");
		System.out.println(e);
		
		SalaryEmployee se = new SalaryEmployee("Sue", "female", 2000);
		System.out.println(se);

		HourlyEmployee he = new HourlyEmployee("Joe", "male", 15);
		System.out.println(he);
		
		PartTime pe = new PartTime("bbb", "male", 2000, 2);
		System.out.println(pe);
	}

}
