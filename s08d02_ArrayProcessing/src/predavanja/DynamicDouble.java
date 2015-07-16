package predavanja;

import java.util.Arrays;

public class DynamicDouble {
	private double[] array;
	private int count;
	
	public DynamicDouble(int n, double value) {
		this.array = new double[n];
		this.count = n;
		Arrays.fill(this.array, value);
	}
	
	public DynamicDouble(int n) {
		this(n, 0.0);
		this.count = 0;
	}
	
	public DynamicDouble() {
		this(8);
	}
	
	
	public void addElement(double x) {
		if (count >= array.length) {
			double[] tmp = array;
			array = new double[1 + array.length * 2];
			
			for (int i = 0; i < tmp.length; i++) {
				array[i] = tmp[i];
			}
		}
		array[count] = x;
		count++;
	}
	
	public void addElement(double[] xs) {
		double[] tmp = array;
		array = new double[array.length + xs.length];
		
		for (int i = 0; i < tmp.length; i++) {
			array[i] = tmp[i];
		}
		
		for (int i = 0; i < xs.length; i++) {
			array[tmp.length + i] = xs[i];
		}
		
		count = array.length;
	}
	
	public int getValidSize() {
		return count;
	}
	
	public int getActualSize() {
		return array.length;
	}
	
	public String toString() {
		String s = getValidSize() + "\t [ ";
		for (int i = 0; i < count; i++) {
			s += array[i] + " ";
		}
		s += "] \n" + getActualSize() + "\t [ ";
		for (int i = 0; i < getActualSize(); i++) {
			s += array[i] + " ";
		}
		
		s += "]";
		return s;
	}
	
	public void removeQuick(int offset) throws IndexOutOfBoundsException {
		if (count == 0) {
			throw new IndexOutOfBoundsException(); 
		} else if (offset >= count) {
			throw new IndexOutOfBoundsException(); 
		}
		array[offset] = array[count-1];
		count--;
		
		if(count <= array.length / 3) {
			double[] tmp = new double[getActualSize() / 3];
			
			for (int i = 0; i < tmp.length; i++) {
				tmp[i] = array[i];
			}
			array = tmp;
		}
	}
	
	public void removeSlow(int offset) throws IndexOutOfBoundsException {
		if (count == 0) {
			throw new IndexOutOfBoundsException(); 
		} else if (offset >= count) {
			throw new IndexOutOfBoundsException(); 
		}
				
		if(count <= array.length / 3) {
			double[] tmp = new double[getActualSize() / 3];
			
			for (int i = 0; i < tmp.length; i++) {
				if (i < offset) {
				tmp[i] = array[i];
				} else {
					tmp[i] = array[i + 1];
				}
			}
			array = tmp;
		}

		count--;
	}


	public static void main(String[] args) {
		double[] arr = {1, 2, 3, 4, 5, 6, 7};
		
		DynamicDouble dd = new DynamicDouble(8, 9);
		dd.addElement(6);
		System.out.println(dd);
		dd.addElement(arr);
		System.out.println(dd);
	}
	
}
