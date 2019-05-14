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
	private boolean doubleCapacity() {
		// Check if length overflows
		if (buffer.length * 2 <= buffer.length) return false;
		
		char[] temp = new char[buffer.length * 2];
		buffer = temp;
	}

	// **** PUBLIC STRINGBUFFER METHODS ****
	public StringBuffer append(boolean b) {
	}

	public StringBuffer append(char c) {
	}

	public StringBuffer append(char[] cStr) {

	}

	public StringBuffer append(char[] cStr, int offset, int len) {

	}

	public StringBuffer append(double d) {

	}

	public StringBuffer append(float f) {

	}

	public StringBuffer append(int i) {

	}

	public StringBuffer append(long l) {

	}

	public StringBuffer append(Object obj) {

	}

	public StringBuffer append(String str) {

	}

	public StringBuffer append(StringBuffer sb) {

	}

	public int capacity() {

	}

	public char charAt(int ind) {

	}

	public StringBuffer delete(int start, int end) {

	}

	public StringBuffer deleteCharAt(int ind) {

	}

	public void ensureCapacity(int minCap) {

	}

	public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {

	}

	public int indexOf(String str) {

	}

	public int indexOf(String str, int fromIndex) {

	}

	public StringBuffer insert(int offset, boolean b) {

	}

	public StringBuffer insert(int offset, char c) {

	}

	public StringBuffer insert(int offset, char[] cStr) {

	}

	public StringBuffer insert(int ind, char[] cStr, int offset, int len) {

	}

	public StringBuffer insert(int offset, double d) {

	}

	public StringBuffer insert(int offset, float f) {
	
	}

	public StringBuffer insert(int offset, int i) {

	}

	public StringBuffer insert(int offset, long l) {

	}

	public StringBuffer insert(int offset, Object obj) {

	}

	public StringBuffer insert(int offset, String str) {
	
	}

	public int lastIndexOf(String str) {

	}
	
	public int lastIndexOf(String str, int fromIndex) {

	}

	public int length() {
	
	}

	public StringBuffer replace(int start, int end, String str) {

	}

	public StringBuffer reverse() {

	}

	public void setCharAt(int ind, char c) {

	}

	public void setLength(int newLength) {

	}

	public String subString(int start) {

	}

	public String subString(int start, int end) {

	}

	public String toString() {

	}

	public void trimToSize() {
	
	}
}
