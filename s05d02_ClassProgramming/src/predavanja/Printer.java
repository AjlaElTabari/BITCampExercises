package predavanja;

/**
 * Representing a printer, that has attributes such as paper availability and ink availability
 * Simulates printing pages using those attributes, and displaying message if printing is't possible
 * @author ajla.eltabari
 *
 */
public class Printer {
	private static int TOTAL_PRINTED_PAGES = 0;
	private String name;
	private int paperAvailable;
	private int inkAvailable;
	private int printedPages = 0;
	
	public Printer() {
		this.name = "Default Printer";
		this.inkAvailable = 0;
		this.paperAvailable = 0;
		this.printedPages = 0;
	}
	
	public Printer(String name) {
		this();
		this.name = name;
	}
	
	/**
	 * @return the paperAvailable
	 */
	public int getPaperAvailable() {
		return paperAvailable;
	}

	/**
	 * @return the inkAvailable
	 */
	public int getInkAvailable() {
		return inkAvailable;
	}

	/**
	 * Checks if there is ink in the printer
	 */
	public boolean hasInk() {
		return (this.inkAvailable >= 3) ? true : false;
	}
	
	/**
	 * Checks if there is paper in the printer
	 */
	public boolean hasPaper() {
		return (this.paperAvailable > 0) ? true : false;
	}
	
	/**
	 * @return the printedPages
	 */
	public int getPrintedPages() {
		return this.printedPages;
	}
	
	/**
	 * @return the totalPrintedPages
	 */
	public static int getTotalPrintedPages() {
		return TOTAL_PRINTED_PAGES;
	}
	
	/**
	 * Adds paper to the printer
	 * In the printer can't fit more than 100 papers
	 */
	public void addPaper(int paperAmount) {
		if(this.paperAvailable + paperAmount < 100) {
			this.paperAvailable += paperAmount;
		} else {
			this.paperAvailable = 100;
		}
	}
	
	/**
	 * Adds ink to the printer
	 * Always fill it to the max, max = 100
	 */
	public void addInk() {
		this.inkAvailable = 100;
	}
	
	/**
	 * Prints pages
	 * For every page that is printed, paperAvailable is decreased by 1,
	 * inkAvailable is decreased by 3, and printedPages is increased by 1
	 * If there is no available ink or paper, printing is not possible
	 */
	public void printPages(int numberOfPages) {
		for (int i = numberOfPages; i > 0; i--) {
			if(hasPaper() && hasInk()) {
				this.paperAvailable--;
				this.inkAvailable -= 3;
				this.printedPages++;
				TOTAL_PRINTED_PAGES++;
			} else {
				System.out.println("Printing impossible.");
			}
		}
	}
	
	/**
	 * Printing printer state
	 */
	public String toString() {
		String s = this.name + "\n";
		if(!hasPaper() && !hasInk()){
			s += "No ink nor paper";
		} else if (!hasInk()) {
			s += "No ink";
		} else if(!hasPaper())  {
			s += "No paper";
		} else {
			s += "Ready";
		}
		return s;
	}
}
