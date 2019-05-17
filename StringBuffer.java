/* Name: Himanshu Makhija
 * Filename: StringBuffer.java
 * Description: This is my version of StringBuffer. I used the javadocs for StringBuffer to create the skeleton for the class (https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html). 
 */
public final class StringBuffer extends Object {
	// **** DATA FIELDS ****
	char[] buffer;
	int index;

	// **** CONSTRUCTORS ****

	/* Function: No-arg Constructor 
	   Description: Initializes a StringBuffer object with standard capacity and no values in buffer.
	   Parameters: None.
	   Return: StringBuffer object.
	*/
	public StringBuffer() {
		buffer = new char[16];
		index = 0;
	}

	/* Function: Capacity Constructor
	   Description: Initializes a StringBuffer object with the specified capacity, assuming capacity is valid. Otherwise we set capacity to standard. 
	   Parameters: int capacity - The requested capacity for the StringBuffer.
	   Return: StringBuffer object.
	*/
	public StringBuffer(int capacity) {
		if (capacity < 0) capacity = 16;
		buffer = new char[capacity];
		index = 0;
	}

	/* Function: String Constructor
	   Description: Initializes a StringBuffer object with the specified String. The String's value is copied into the buffer, and the index is set to the next available index in buffer.
	   Parameters: String str - The specified initial chars to be inserted in buffer.
	   Return: StringBuffer object.
	*/
	public StringBuffer(String str) {
		buffer = new char[str.length()];

		// Declare i outside of the loop to track the next available index
		int i = 0;
		for (; i < str.length(); i++) buffer[i] = str.charAt(i);
		index = i;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer(StringBuffer sb) {

	}

	// **** PRIVATE STRINGBUFFER METHODS ****

	/* Function: doubleCapacity 
	   Description: This is a private function that will double the available capacity of the buffer, if possible. 
	   Parameters: None.
	   Return: boolean - The result of attempting to double the buffer size.
	*/
	private boolean doubleCapacity() {
		// Check if length overflows
		if (buffer.length * 2 <= buffer.length) return false;
		
		char[] temp = new char[buffer.length * 2];
		buffer = temp;
		return true;
	}

	/* Function:
	   Description:
	   Parameters:
	   Return:
	*/
	private char[] copy(char[] dest) {
		return new char[0];
	}

	// **** PUBLIC STRINGBUFFER METHODS ****

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(boolean b) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(char c) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(char[] cStr) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(char[] cStr, int offset, int len) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(double d) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(float f) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(int i) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(long l) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(Object obj) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(String str) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(StringBuffer sb) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public int capacity() {
		return 0;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public char charAt(int ind) {
		return 0;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer delete(int start, int end) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer deleteCharAt(int ind) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public void ensureCapacity(int minCap) {
		return;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
		return;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public int indexOf(String str) {
		return 0;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public int indexOf(String str, int fromIndex) {
		return 0;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer insert(int offset, boolean b) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer insert(int offset, char c) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer insert(int offset, char[] cStr) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer insert(int ind, char[] cStr, int offset, int len) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer insert(int offset, double d) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer insert(int offset, float f) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer insert(int offset, int i) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer insert(int offset, long l) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer insert(int offset, Object obj) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer insert(int offset, String str) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public int lastIndexOf(String str) {
		return 0;
	}
	
	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public int lastIndexOf(String str, int fromIndex) {
		return 0;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public int length() {
		return 0;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer replace(int start, int end, String str) {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer reverse() {
		return this;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public void setCharAt(int ind, char c) {
		return;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public void setLength(int newLength) {
		return;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public String subString(int start) {
		return "";
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public String subString(int start, int end) {
		return "";
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public String toString() {
		return "";
	}

	/* Function: trimToSize
	   Description: The idea is to trim the buffer capacity down to the size of the actual contents in buffer.
	   Parameters: None.
	   Return: None.
	*/
	public void trimToSize() {
		// Create trimmed array skeleton
		char[] temp = new char[index];
		
		// Call private copy function to fill temp with buffer's values
		temp = copy(temp);
	
		// Assign buffer to temp
		buffer = temp;
	
		return;
	}

	/* Function: 
	   Description: 
	   Parameters: 
	   Return: 
	*/
	public static void main(String[] args) {
		// TEST NO-ARG CONSTRUCTOR
		StringBuffer sb1 = new StringBuffer();
		if (sb1.buffer.length == 16) System.out.println("No-arg constructor size PASS!");
		else System.out.println("No-arg constructor size FAIL.");
		if (sb1.index == 0) System.out.println("No-arg constructor index PASS!");
		else System.out.println("No-arg constructor index FAIL.");

		// TEST CAPACITY CONSTRUCTOR
		sb1 = new StringBuffer(-1);
		StringBuffer sb2 = new StringBuffer(9);
		if (sb1.buffer.length == 16) System.out.println("Capacity constructor invalid size PASS!");
		else System.out.println("Capacity constructor invalid size FAIL.");
		if (sb1.index == 0) System.out.println("Capacity constructor invalid-sized index PASS!");
		else System.out.println("Capacity constructor invalid-sized index FAIL.");

		if (sb2.buffer.length == 9) System.out.println("Capacity constructor valid size PASS!");
		else System.out.println("Capacity constructor valid size FAIL.");
		if (sb2.index == 0) System.out.println("Capacity constructor valid-sized index PASS!");
		else System.out.println("Capacity constructor valid-sized index FAIL.");

		// TEST STRING CONSTRUCTOR
		sb1 = new StringBuffer("Hello");
		if (sb1.buffer.length == 5) System.out.println("String constructor size PASS!");
		else System.out.println("String constructor size FAIL.");
		if (sb1.index == 5) System.out.println("String constructor index PASS!");
		else System.out.println("String constructor index FAIL.");

		return;
	}
}
