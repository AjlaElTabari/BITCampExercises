package museum;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Artpiece arpiece = new Artpiece("Zonalisa", "Eternal smile", "Leonardo Da Vinci", Artpiece.Period.RENAISSANCE);
		//System.out.println(arpiece);
		
		Artpiece arpiece1 = new Artpiece("Monalisa", "AAAA", "Leonardo Da Vinci", Artpiece.Period.RENAISSANCE);
		//System.out.println("\n" + arpiece1);
		
		HistoricalArtefact artefact = new HistoricalArtefact("Katana", "Japanesse blade", "From mine near Tokio", HistoricalArtefact.Period.MIDDLE_AGE);
		//System.out.println("\n" + artefact);

		ArrayList<Artpiece> artpieces = new ArrayList<>();
		artpieces.add(arpiece);
		artpieces.add(arpiece1);
		
		ArrayList<Showpiece> showpieces = new ArrayList<>();
		showpieces.add(arpiece);
		showpieces.add(arpiece1);
		showpieces.add(artefact);
		
		Showpiece.sortShowpiecesByName(showpieces);
		//System.out.println(list);
		
		Employee e1 = new Employee("Ajla", "Tabari", "0507984175024", Employee.Position.CEO, 2000);
		Employee e2 = new Employee("Amra", "Sabic", "0507984175024", Employee.Position.CEO, 2000);
		Employee e3 = new Employee("Gordan", "Masic", "0507984175024", Employee.Position.CEO, 2000);
		//System.out.println(e1);
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		//System.out.println(arpiece1.fitsSearch("renaissance"));		
		//System.out.println(e1.fitsSearch("ajla"));
		
		Museum museum = new Museum(showpieces, employees);
		//System.out.println(museum);
		
		System.out.println(museum.fitsSearch(artpieces, "monalisa"));


	}

}
