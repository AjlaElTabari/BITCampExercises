package predavanja;

public class PrintersNetwork_Main {

	public static void main(String[] args) {
		
		Printer p1 = new Printer("BITCamp 1");
		Printer p2 = new Printer("BITCamp 2");
		Printer p3 = new Printer("BITCamp 3");
		Printer p4 = new Printer("BITCamp 4");
		Printer p5 = new Printer("BITCamp 5");
		
		p1.addPaper(100);
		p1.addInk();		
		
		p2.addPaper(30);
		p2.addInk();
		
		p3.addPaper(80);
		p3.addInk();
		
		p4.addPaper(46);
		p4.addInk();
		
		p5.addPaper(20);
		p5.addInk();
		
		Printer[] printers = new Printer[] {p1, p2, p3, p4, p5};
		
		PrintersNetwork network = new PrintersNetwork(printers);
		
		network.distributeJob(10);
	}

}
