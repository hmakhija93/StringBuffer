/* Name: Himanshu Makhija
 * Filename: StringBuffer.java
 * Description: This is my version of StringBuffer. I used the javadocs for StringBuffer to create the skeleton for the class (https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html). 
 */
public final class StringBuffer extends Object {
	// **** DATA FIELDS ****
	char[] buffer;
	int index;

	// **** CONSTRUCTORS ****

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer() {
		buffer = new char[16];
		index = 0;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer(int capacity) {
		if (capacity < 0) capacity = 16;
		buffer = new char[capacity];
		index = 0;
	}

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public StringBuffer(String str) {
		buffer = new char[str.length()];

		// Declare i outside of the loop to track the next available index
		int i = 0;
		for (; i < str.length(); i++) buffer[i] = str.charAt(i);
		index = i;
	}

	// **** PRIVATE STRINGBUFFER METHODS ****

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	private boolean doubleCapacity() {
		// Check if length overflows
		if (buffer.length * 2 <= buffer.length) return false;
		
		char[] temp = new char[buffer.length * 2];
		buffer = temp;
		return true;
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

	/* Function: 
	   Description:
	   Parameters:
	   Return:
	*/
	public void trimToSize() {
		
	}
}
