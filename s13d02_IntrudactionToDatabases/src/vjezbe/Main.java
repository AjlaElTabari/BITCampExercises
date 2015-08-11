package vjezbe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader reader = new BufferedReader(new FileReader(new File(
				"src/vjezbe/example.csv")));
		ArrayList<Employee> employees = new ArrayList<>();

		String[] employeeParts = null;
		try {
			String per = reader.readLine();
			while (reader.ready()) {
				per = reader.readLine();
				employeeParts = per.split(",");
				Employee p = new Employee(Integer.parseInt(employeeParts[0]),
						employeeParts[1], Integer.parseInt(employeeParts[2]),
						Boolean.parseBoolean(employeeParts[3]));
				employees.add(p);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(employees);
		System.out.println();
		System.out.println(Employee.getPersonsWIthSalaryOver5000(employees));
		System.out.println();
		System.out.println(Employee.getPersonsBySlaraYAndId(employees));
		System.out.println();
		Employee.getNames(employees);
		System.out.println();
		Employee.getNamesAndSalaries(employees);
		System.out.println();

		BufferedReader reader1 = new BufferedReader(new FileReader(new File(
				"src/vjezbe/example1.csv")));
		ArrayList<Manager> managers = new ArrayList<>();

		String[] ManagerParts = null;
		try {
			String men = reader1.readLine();
			while (reader1.ready()) {
				men = reader1.readLine();
				ManagerParts = men.split(",");
				Manager m = new Manager(Integer.parseInt(ManagerParts[0]),
						ManagerParts[1]);
				managers.add(m);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(managers);
		System.out.println();

		for (int i = 0; i < managers.size(); i++) {
			for (int j = 0; j < employees.size(); j++) {
				if (managers.get(i).getEmployee_id() == employees.get(j)
						.getId()) {
					System.out.println(employees.get(j).getId() + " "
							+ employees.get(j).getName() + " "
							+ employees.get(j).getSalary() + " "
							+ managers.get(i).getName());
				}
			}
		}
	}

}
