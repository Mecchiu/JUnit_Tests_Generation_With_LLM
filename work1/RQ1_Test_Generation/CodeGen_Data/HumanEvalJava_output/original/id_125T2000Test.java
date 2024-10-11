// SplitWordsTest.java
package original;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains one unit test case for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {

	/**
	 * Test method for {@link SplitWords#splitWords(String)}.
	 */
	@Test
	void testSplitWords() {
		assertThat(Arrays.asList(SplitWords.splitWords("Hello World!")).size(), is(1));
	}
}

// SplitWords_Test.java