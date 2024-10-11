// WordsInSentenceTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsInSentence}.
* It contains one unit test case for the {@link WordsInSentence#wordsInSentence(String)} method.
*/
class WordsInSentenceTest {

    //Tests the following test cases:
    @Test
    public void test1() {
        String sentence = "Hello  there";
        String expected = "Hello there";
        assertEquals(expected, wordsInSentence(sentence));
    }

    @Test
    public void test2() {
        String sentence = "Hello  there, I";
        String expected = "Hello there, I";
        assertEquals(expected, wordsInSentence(sentence));
    }

	@Test
	public void test3() {
		String sentence = "Hello  there, I, I'm not";
		String expected = "Hello there, I, I'm not";
		assertEquals(expected, wordsInSentence(sentence));
	}
	
}