Here's the source code for the test class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordsInSentenceTest {

    @Test
    void testEmptyString() {
        String sentence = "";
        String expected = "";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testOneWord() {
        String sentence = "hello";
        String expected = "";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testTwoWords() {
        String sentence = "hello world";
        String expected = "world";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testThreeWords() {
        String sentence = "the cat sat";
        String expected = "the sat";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testFourWords() {
        String sentence = "the quick brown fox";
        String expected = "the fox";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testFiveWords() {
        String sentence = "the quick brown fox jumps";
        String expected = "the fox";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testSixWords() {
        String sentence = "the quick brown fox jumps over";
        String expected = "the fox over";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testSevenWords() {
        String sentence = "the quick brown fox jumps over the";
        String expected = "the fox over";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testEightWords() {
        String sentence = "the quick brown fox jumps over the lazy";
        String expected = "the fox over";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testNineWords() {
        String sentence = "the quick brown fox jumps over the lazy dog";
        String expected = "the fox dog";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testTenWords() {
        String sentence = "the quick brown fox jumps over the lazy dog and";
        String expected = "the fox dog";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }
}
```

This test class contains ten test cases that cover different scenarios for the `wordsInSentence` method. The test cases include empty string, one word, two words, three words, four words, five words, six words, seven words, eight words, and ten words. The expected output for each test case is compared with the actual output returned by the `wordsInSentence` method using the `assertEquals` method from the JUnit library.