// WordsInSentenceTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsInSentence}.
* It contains ten unit test cases for the {@link WordsInSentence#wordsInSentence(String)} method.
*/
class WordsInSentenceTest {

    @Test
    void testWordsInSentenceWithEmptyString() {
        String sentence = "";
        String expected = "";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testWordsInSentenceWithOneWord() {
        String sentence = "Hello";
        String expected = "";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testWordsInSentenceWithTwoWords() {
        String sentence = "Hello world";
        String expected = "world";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testWordsInSentenceWithThreeWords() {
        String sentence = "The cat sat";
        String expected = "cat sat";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testWordsInSentenceWithFourWords() {
        String sentence = "The dog chased the cat";
        String expected = "dog chased cat";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testWordsInSentenceWithFiveWords() {
        String sentence = "The quick brown fox jumps";
        String expected = "quick brown jumps";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testWordsInSentenceWithSixWords() {
        String sentence = "The lazy dog slept in the sun";
        String expected = "lazy dog slept sun";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testWordsInSentenceWithSevenWords() {
        String sentence = "The big black bear climbed up the tree";
        String expected = "big black climbed tree";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testWordsInSentenceWithEightWords() {
        String sentence = "The red apple fell from the tree and rolled away";
        String expected = "red apple tree rolled";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testWordsInSentenceWithNineWords() {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String expected = "quick brown jumps lazy dog";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testWordsInSentenceWithTenWords() {
        String sentence = "The cat in the hat sat on the mat in the sun";
        String expected = "cat sat mat sun";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }
}