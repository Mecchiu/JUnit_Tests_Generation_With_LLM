// WordsInSentenceTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsInSentence}.
* It contains one unit test case for the {@link WordsInSentence#wordsInSentence(String)} method.
*/
class WordsInSentenceTest {

    @Test
    public void test() {
        assertEquals("1",
                WordsInSentence.wordsInSentence("001"));
        assertEquals("1",
                WordsInSentence.wordsInSentence("1"));
        assertEquals("1",
                WordsInSentence.wordsInSentence("01"));
        assertEquals("1",
                WordsInSentence.wordsInSentence("10"));
        assertEquals("10",
                WordsInSentence.wordsInSentence("10"));
        assertEquals("10",
                WordsInSentence.wordsInSentence("100"));
        assertEquals("10",
                WordsInSentence.wordsInSentence("1000000"));
        assertEquals("1000000",
                WordsInSentence.wordsInSentence("1000000"));
        assertEquals("1000000",
                WordsInSentence.wordsInSentence("1000001"));
        assertEquals("100001",
                WordsInSentence.wordsInSentence("10001"));

    }
	
}