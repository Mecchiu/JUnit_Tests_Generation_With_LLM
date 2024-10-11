// StringSequenceTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringSequence}.
* It contains one unit test case for the {@link StringSequence#stringSequence(int)} method.
*/
class StringSequenceTest {

	/**
	* This unit test cases contains one unit test, for the case when "stringSequence(int)" is used.
	* 1. {@link StringSequence#stringSequence(int)} should return a string of size 0 (with a zero char value in its last position).
	* Example: {@link StringSequence#stringSequence(int)} should return the empty string "".
	* 2. {@link StringSequence#stringSequence(int)} should return the string [1] from argument 0.
	*/
	int testStringSequenceWithInt(int i) {
	    assertEquals("" + i, StringSequence.stringSequence(i));
	}
	
	@Test public void test() {
		StringSequence ss = new StringSequence();
		testStringSequenceWithInt(0);
		testStringSequenceWithInt(1);
	}
}
