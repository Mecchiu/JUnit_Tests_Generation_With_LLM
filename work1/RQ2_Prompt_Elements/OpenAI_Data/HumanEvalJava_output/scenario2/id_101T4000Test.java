// WordsStringTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains ten unit test cases for the {@link WordsString#wordsString(String)} method.
*/
class WordsStringTest {

	@Test
	void testWordsString() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Hello");
		expected.add("World");
		assertEquals(expected, WordsString.wordsString("Hello,World"));
		
		expected.clear();
		expected.add("Hello");
		expected.add("World");
		assertEquals(expected, WordsString.wordsString("Hello World"));
		
		expected.clear();
		expected.add("Hello");
		expected.add("World");
		assertEquals(expected, WordsString.wordsString("Hello, World"));
		
		expected.clear();
		expected.add("Hello");
		expected.add("World");
		assertEquals(expected, WordsString.wordsString("Hello , World"));
		
		expected.clear();
		expected.add("Hello");
		expected.add("World");
		assertEquals(expected, WordsString.wordsString("Hello ,World"));
		
		expected.clear();
		expected.add("Hello");
		expected.add("World");
		assertEquals(expected, WordsString.wordsString("Hello, World"));
		
		expected.clear();
		expected.add("Hello");
		expected.add("World");
		assertEquals(expected, WordsString.wordsString("Hello,World"));
		
		expected.clear();
		expected.add("Hello");
		expected.add("World");
		assertEquals(expected, WordsString.wordsString("Hello,World"));
		
		expected.clear();
		expected.add("Hello");
		expected.add("World");
		assertEquals(expected, WordsString.wordsString("Hello,World"));
		
		expected.clear();
		expected.add("Hello");
		expected.add("World");
		assertEquals(expected, WordsString.wordsString("Hello,World"));
	}
}