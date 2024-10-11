// WordsInSentenceTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsInSentence}.
* It contains ten unit test cases for the {@link WordsInSentence#wordsInSentence(String)} method.
*/
class WordsInSentenceTest {

	@Test
	void testWordsInSentence() {
		assertEquals("", WordsInSentence.wordsInSentence(""));
		assertEquals("", WordsInSentence.wordsInSentence(" "));
		assertEquals("", WordsInSentence.wordsInSentence("  "));
		assertEquals("", WordsInSentence.wordsInSentence("a"));
		assertEquals("", WordsInSentence.wordsInSentence("a b"));
		assertEquals("", WordsInSentence.wordsInSentence("a b c"));
		assertEquals("a", WordsInSentence.wordsInSentence("a a"));
		assertEquals("a", WordsInSentence.wordsInSentence("a a a"));
		assertEquals("a b", WordsInSentence.wordsInSentence("a a b"));
		assertEquals("a b", WordsInSentence.wordsInSentence("a a b b"));
	}
}