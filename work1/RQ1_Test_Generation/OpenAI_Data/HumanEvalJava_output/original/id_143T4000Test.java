// WordsInSentenceTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsInSentence}.
* It contains ten unit test cases for the {@link WordsInSentence#wordsInSentence(String)} method.
*/
class WordsInSentenceTest {

	@Test
	void testWordsInSentence1() {
		assertEquals("is", WordsInSentence.wordsInSentence("This is a test"));
	}
	
	@Test
	void testWordsInSentence2() {
		assertEquals("go for", WordsInSentence.wordsInSentence("lets go for swimming"));
	}
	
	@Test
	void testWordsInSentence3() {
		assertEquals("there is no place", WordsInSentence.wordsInSentence("there is no place available here"));
	}
	
	@Test
	void testWordsInSentence4() {
		assertEquals("Hi am Hussein", WordsInSentence.wordsInSentence("Hi I am Hussein"));
	}
	
	@Test
	void testWordsInSentence5() {
		assertEquals("go for it", WordsInSentence.wordsInSentence("go for it"));
	}
	
	@Test
	void testWordsInSentence6() {
		assertEquals("", WordsInSentence.wordsInSentence("here"));
	}
	
	@Test
	void testWordsInSentence7() {
		assertEquals("is", WordsInSentence.wordsInSentence("here is"));
	}
	
	@Test
	void testWordsInSentence8() {
		assertEquals("", WordsInSentence.wordsInSentence(""));
	}
	
	@Test
	void testWordsInSentence9() {
		assertEquals("", WordsInSentence.wordsInSentence(" "));
	}
	
	@Test
	void testWordsInSentence10() {
		assertEquals("", WordsInSentence.wordsInSentence("  "));
	}
}