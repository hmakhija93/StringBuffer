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

	}

	// **** PUBLIC STRINGBUFFER METHODS ****

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(boolean b) {
	
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(char c) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(char[] cStr) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(char[] cStr, int offset, int len) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(double d) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(float f) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(int i) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(long l) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(Object obj) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(String str) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer append(StringBuffer sb) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public int capacity() {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public char charAt(int ind) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer delete(int start, int end) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer deleteCharAt(int ind) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public void ensureCapacity(int minCap) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public int indexOf(String str) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public int indexOf(String str, int fromIndex) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer insert(int offset, boolean b) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer insert(int offset, char c) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer insert(int offset, char[] cStr) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer insert(int ind, char[] cStr, int offset, int len) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer insert(int offset, double d) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer insert(int offset, float f) {
	
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer insert(int offset, int i) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer insert(int offset, long l) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer insert(int offset, Object obj) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer insert(int offset, String str) {
	
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public int lastIndexOf(String str) {

	}
	
	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public int lastIndexOf(String str, int fromIndex) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public int length() {
	
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer replace(int start, int end, String str) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer reverse() {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public void setCharAt(int ind, char c) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public void setLength(int newLength) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public String subString(int start) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public String subString(int start, int end) {

	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public String toString() {

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
	}
}
