// WordsInSentence.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class WordsInSentence {

    /**
     * * You are given a string representing a sentence,
     * the sentence contains some words separated by a space,
     * and you have to return a string that contains the words from the original sentence,
     * whose lengths are prime numbers,
     * the order of the words in the new string should be the same as the original one.
     *
     * Example 1:
     * Input: sentence = "This is a test"
     * Output: "is"
     *
     * Example 2:
     * Input: sentence = "lets go for swimming"
     * Output: "go for"
     *
     * Constraints:
     * * 1 <= len(sentence) <= 100
     * * sentence contains only letters
     *
     * > wordsInSentence("This is a test")
     * "is"
     * > wordsInSentence("lets go for swimming")
     * "go for"
     * > wordsInSentence("there is no place available here")
     * "there is no place"
     * > wordsInSentence("Hi I am Hussein")
     * "Hi am Hussein"
     * > wordsInSentence("go for it")
     * "go for it"
     * > wordsInSentence("here")
     * ""
     * > wordsInSentence("here is")
     * "is"
     */
    public static String wordsInSentence(String sentence) {
        String[] words = sentence.split(" ");
        List<String> primeWords = new ArrayList<>();
        for (String word : words) {
            if (isPrime(word.length())) {
                primeWords.add(word);
            }
        }
        return String.join(" ", primeWords);
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// WordsInSentenceTest.java
package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsInSentence}.
* It contains ten unit test cases for the {@link WordsInSentence#wordsInSentence(String)} method.
*/
class WordsInSentenceTest {

    @Test
    void testWordsInSentence1() {
        String sentence = "This is a test";
        String expected = "is";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testWordsInSentence2() {
        String sentence = "lets go for swimming";
        String expected = "go for";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testWordsInSentence3() {
        String sentence = "there is no place available here";
        String expected = "there is no place";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testWordsInSentence4() {
        String sentence = "Hi I am Hussein";
        String expected = "Hi am Hussein";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testWordsInSentence5() {
        String sentence = "go for it";
        String expected = "go for it";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testWordsInSentence6() {
        String sentence = "here";
        String expected = "";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testWordsInSentence7() {
        String sentence = "here is";
        String expected = "is";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testWordsInSentence8() {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String expected = "The fox over dog";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testWordsInSentence9() {
        String sentence = "I love coding";
        String expected = "I";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }

    @Test
    void testWordsInSentence10() {
        String sentence = "Java is a programming language";
        String expected = "Java is a";
        String actual = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, actual);
    }
}