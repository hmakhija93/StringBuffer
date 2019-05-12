/* Name: Himanshu Makhija
 * Filename: StringBuffer.java
 * Description: This is my version of StringBuffer. I used the javadocs for StringBuffer (https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html). 
 */

public final class StringBuffer extends Object {
	// **** DATA FIELDS ****
	char[] buffer;
	int index;

	// **** CONSTRUCTORS ****
	public StringBuffer() {
		buffer = new char[16];
		index = 0;
	}

	public StringBuffer(int capacity) {
		if (capacity < 0) capacity = 16;
		buffer = new char[capacity];
	}

	public StringBuffer(String str) {
		buffer = new char[str.length()];
		for (int i = 0; i < str.length(); i++) buffer[i] = str.charAt(i);
	}

	// **** PRIVATE STRINGBUFFER METHODS ****
	private boolean increaseCapacity() {
		char[] temp = new char[buffer.length * 2];
		if (temp.length <= buffer.length) return false;
		buffer = temp;
		return true;
	}

	// **** PUBLIC STRINGBUFFER METHODS ****
	public StringBuffer append(boolean b) {
		if (b) {
			
		} else {

		}
	}
}
