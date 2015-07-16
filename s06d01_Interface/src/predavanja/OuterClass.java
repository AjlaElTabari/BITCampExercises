package predavanja;

public class OuterClass {
	private int number;
	private InnerClass ic;
	
	public OuterClass() {
		number = 10;
		ic = new InnerClass(20);
	}
	static class InnerClass {
		private int innerNumber;
		private int number;
		
		public InnerClass(int number) {
			this.number = number;
		}
		
		public void printVariables(int number) {
			System.out.println("Param number: " + number);
			System.out.println("Inner number: " + this.number);
			//System.out.println("Outher number: " + OuterClass.this.number);
		}
	}
}
