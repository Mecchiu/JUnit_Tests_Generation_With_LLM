// StringSequenceTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringSequence}.
* It contains one unit test case for the {@link StringSequence#stringSequence(int)} method.
*/
class StringSequenceTest {

	@Test
	public void testStringSequence() {
           
		assertEquals(StringSequence.stringSequence(0), "0 ");
		assertEquals(StringSequence.stringSequence(1), " ");
		assertEquals(StringSequence.stringSequence(2), "\n");
		assertEquals(StringSequence.stringSequence(3), "\t");
  }

}