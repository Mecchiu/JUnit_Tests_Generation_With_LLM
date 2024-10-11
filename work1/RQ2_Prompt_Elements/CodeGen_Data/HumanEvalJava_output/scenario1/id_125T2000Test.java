// SplitWordsTest.java
package scenario1;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains one unit test case for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {

	@Test
	public void testSplitWords() {
		assertEquals(Arrays.asList("a", "b", "c"), new SplitWords().splitWords(
		                "a, b, c"));
	}
}