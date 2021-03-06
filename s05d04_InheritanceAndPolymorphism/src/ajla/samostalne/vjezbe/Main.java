package ajla.samostalne.vjezbe;

public class Main {

	public static void main(String[] args) {
		
	
		Workstation ws = new Workstation("Andorid Ubuntu", 32, 16000, 2.8, 1500, 4, 4, 8, false);
		
		DesktopComputer dc = new DesktopComputer("Windows", 8, 3000, 2.4, 4500, 2, true, false, true);
		
		Laptop lt = new Laptop("iOS", 4, 1800, 2.5, 17, true, 4, true, false);
		
		PocketPC pocket = new PocketPC("Android", 4, 800, 0.15, 5, true, true, true, false);
		
		ws.printInformation();
		dc.printInformation();
		lt.printInformation();
		pocket.printInformation();
	}

}
