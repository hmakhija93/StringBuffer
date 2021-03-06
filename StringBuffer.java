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
		for (int i = 0; i < str.length(); i++) buffer[i] = str.charAt(i);
		index = str.length();
	}

	/* Function: StringBuffer Constructor
	   Description: Take an instance of the StringBuffer as our setup for this new instance. Copy the contents and size of the previous StringBuffer object.
	   Parameters: StringBuffer sb - The instance we want to create a deep-copy of.
	   Return: StringBuffer object.
	*/
	public StringBuffer(StringBuffer sb) {
		// Make current buffer the size of sb's buffer
		buffer = new char[sb.getBuffer().length];
		
		// Copy sb's buffer contents into new buffer
		buffer = copy(sb.getBuffer(), buffer, 0, sb.getBuffer().length - 1, 0, buffer.length);

		// Set index
		index = sb.getIndex();
	}

	// **** GETTERS ****
	/* Function: getIndex
	   Description: To give access to outside classes without allowing mutation of the data.
  	   Parameters: None.
   	   Return: int index - The index of the next available space in the buffer.
	*/
	public int getIndex() {
		return index;
	}

	/* Function: getBuffer
	   Description: To give access to outside classes without allowing mutation of the data.
  	   Parameters: None.
   	   Return: char[] - The buffer stored in this StringBuffer object.
	*/
	public char[] getBuffer() {
		return buffer;
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
		buffer = copy(buffer, temp, 0, buffer.length - 1, 0, buffer.length - 1);
		return true;
	}

	/* Function: copy
	   Description: This is a private method that will copy from a source array into the destination array.
	   Parameters: char[] src - The source array we want to copy from.
		       char[] dest - The array we want to copy into.
		       int srcBeg - The inclusive beginning of the array we want to start copying from.
		       int srcEnd - The inclusive ending of the array we want to copy from.
		       int destBeg - The inclusive beginning of the array we want to copy into.
		       int destEnd - The inclusive ending of the array we want to copy into.
	   Return: dest[] - Must get pointer to destination array. 
	*/
	private char[] copy(char[] src, char[] dest, int srcBeg, int srcEnd, int destBeg, int destEnd) {
		// Copy over
		for (; srcBeg <= srcEnd; srcBeg++, destBeg++) dest[destBeg] = src[srcBeg];

		return dest;
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

	/* Function: Capacity 
	   Description: Returns total capacity of the buffer, as it is currently sized.
	   Parameters: None.
	   Return: int - The total capacity requested.
	*/
	public int capacity() {
		return buffer.length;
	}

	/* Function: charAt 
	   Description: Returns the char value located at index "ind".
	   Parameters: int ind - Index for character requested.
	   Return: char - The value in the buffer at the requested index.
	*/
	public char charAt(int ind) {
		// Check ind value
		if (ind < 0) {
			System.err.println("Index for char must be greater than or equal to 0.");
			return 0;
		}

		// Check if ind is greater than next index
		if (ind >= index) {
			System.err.println("Index for char must be less than current size of buffer.");
			return 0;
		}

		return buffer[ind];
	}

	/* Function: delete 
	   Description: This function will delete chars in buffer starting with index "start" and ending with exclusive "end".
	   Parameters: int start - The starting index for deletion.
		       int end - The ending index for deletion, exclusive.
	   Return: StringBuffer - The whole object with the edited buffer.
	*/
	public StringBuffer delete(int start, int end) {
		// Bounds check
		if (end < start) return this;
	
		// If starting is already out of bounds, return this object
		if (start > buffer.length) {
			// If end is out of bounds, reduce to actual size of buffer
			if (buffer.length < end) end = buffer.length;

			char[] temp = new char[buffer.length - (end - start)];

			temp = copy(buffer, temp, 0, start - 1, 0, start - 1);
			temp = copy(buffer, temp, end, buffer.length, end, temp.length);
			buffer = temp;
		}

		return this;
	}

	/* Function: deleteCharAt 
	   Description: Deletes character located at index provided.
	   Parameters: int ind - Index of character to delete.
	   Return: StringBuffer object - This object with modified buffer, if index was within bounds.
	*/
	public StringBuffer deleteCharAt(int ind) {
		// Check if given ind is out of bounds of buffer
		if (ind < 0 || ind >= index) return this;

		// Ind is within bounds
		char[] temp = new char[buffer.length];
		temp = copy(buffer, temp, 0, ind, 0, ind);
		temp = copy(buffer, temp, ind + 1, index, ind, temp.length);

		// Replace buffer with modified buffer
		buffer = temp;
		
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
		temp = copy(buffer, temp, 0, buffer.length, 0, index);
	
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
		
		// TEST STRINGBUFFER CONSTRUCTOR
		sb2 = new StringBuffer(sb1);
		if (sb1.buffer.length == sb2.buffer.length) System.out.println("StringBuffer constructor size PASS!");
		else System.out.println("StringBuffer constructor size FAIL.");
		if (sb1.index == sb2.index) System.out.println("StringBuffer constructor index PASS!");
		else System.out.println("StringBuffer constructor index FAIL.");		

		return;
	}
}
