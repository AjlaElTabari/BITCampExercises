package predavanja;

public class PrimeCounter extends Thread{
	private int start;
	private int end;
	private static Integer COUNT = 0;
	
	public PrimeCounter(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void countPrimes() {
		for (int i = start; i < end; i++) {
			if(isPrime(i)) {
				synchronized(COUNT) {
					COUNT++;
				}
			}
		}
	}
	private boolean isPrime(int number) {
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public int getCount() {
		return COUNT;
	}
	
	@Override
	public void run(){
		countPrimes();
	}
}
