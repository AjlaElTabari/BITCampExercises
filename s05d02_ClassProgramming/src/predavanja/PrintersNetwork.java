package predavanja;

/**
 * Representing a network of printers
 * Printing request will be sent to printers network (array of printers) 
 * it will be distributed on available printers (state: ready)
 * @author ajla.eltabari
 *
 */
public class PrintersNetwork {
	private Printer[] printers;

	public PrintersNetwork(Printer[] printers) {
		this.printers = printers;
	}
	
	public static int getNumOfPagesThatCanBePrinted(Printer p) {
		int counter = 0;
		int ink = p.getInkAvailable();
		int paper = p.getPaperAvailable();
		while (ink >= 3 && paper > 0) {
			ink -= 3;
			paper--;
			counter++;
		}
		return counter;
	}
	
	public void distributeJob(int numOfPages) {
		for (int j = 0; j < printers.length; j++) {
			int pgn = getNumOfPagesThatCanBePrinted(printers[j]);
			if(numOfPages > 0) {
				printers[j].printPages(pgn);
				numOfPages -= pgn;
			} else {
				System.out.println("Printing is done!");
				break;
			}
		}

		System.out.println(numOfPages);
	}
}
