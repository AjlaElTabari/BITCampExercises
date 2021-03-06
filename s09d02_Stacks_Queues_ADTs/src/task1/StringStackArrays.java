package task1;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Represents a stack of String objects using arrays Implements few standard
 * methods for stack manipulation
 * 
 * @author ajla.eltabari
 *
 */
public class StringStackArrays {
	private String[] stack;

	/**
	 * Empty constructor Initialize String array to 0
	 */
	public StringStackArrays() {
		this.stack = new String[0];
	}

	/**
	 * Checks if an array is empty
	 * 
	 * @returns true if an array is empty, and false if it is not
	 */
	public boolean empty() {
		return (stack.length == 0);
	}

	/**
	 * Inserts new value at the end of the array
	 * 
	 * @param value
	 *            that needs to be added
	 * @returns added value
	 */
	public String push(String value) {
		stack = Arrays.copyOf(stack, stack.length + 1);
		stack[stack.length - 1] = value;
		return value;
	}

	/**
	 * Deletes last value from the stack
	 * 
	 * @returns deleted value
	 * @throws EmptyStackException
	 *             in case that stack is empty
	 */
	public String pop() throws EmptyStackException {
		if (stack.length > 0) {
			String temp = stack[stack.length - 1];
			stack = Arrays.copyOf(stack, stack.length - 1);
			return temp;
		} else {
			throw new EmptyStackException();
		}
	}

	/**
	 * Returns last value on the stack
	 * 
	 * @return
	 * @throws EmptyStackException
	 *             in case that stack is empty
	 */
	public String peek() throws EmptyStackException {
		if (stack.length > 0) {
			return stack[stack.length - 1];
		} else {
			throw new EmptyStackException();
		}
	}

	/**
	 * Returns the 1-based position where an object is on this stack. If the
	 * object o occurs as an item in this stack, this method returns the
	 * distance from the top of the stack of the occurrence nearest the top of
	 * the stack; 
	 * the topmost item on the stack is considered to be at distance 1.
	 */
	public int search(String value) {
		for (int i = stack.length - 1; i >= 0 ; i--) {
			if (stack[i].equals(value)) {
				return stack.length - i;
			}
		}
 		return -1;
	}

	/**
	 * Prints out stack values
	 */
	public String toString() {
		return Arrays.toString(stack);
	}
}
