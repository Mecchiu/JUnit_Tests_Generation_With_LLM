```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordsInSentenceTest {

    @Test
    void testWordsInSentence_Example1() {
        String sentence = "This is a test";
        String expected = "is";
        String result = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, result);
    }

    @Test
    void testWordsInSentence_Example2() {
        String sentence = "lets go for swimming";
        String expected = "go for";
        String result = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, result);
    }

    @Test
    void testWordsInSentence_Example3() {
        String sentence = "there is no place available here";
        String expected = "there is no place";
        String result = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, result);
    }

    @Test
    void testWordsInSentence_Example4() {
        String sentence = "Hi I am Hussein";
        String expected = "Hi am Hussein";
        String result = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, result);
    }

    @Test
    void testWordsInSentence_Example5() {
        String sentence = "go for it";
        String expected = "go for it";
        String result = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, result);
    }

    @Test
    void testWordsInSentence_Example6() {
        String sentence = "here";
        String expected = "";
        String result = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, result);
    }

    @Test
    void testWordsInSentence_Example7() {
        String sentence = "here is";
        String expected = "is";
        String result = WordsInSentence.wordsInSentence(sentence);
        assertEquals(expected, result);
    }
}
```
```java
package original;

class WordsInSentence {

    public static String wordsInSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (isPrime(word.length())) {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```
```java
// WordsInSentence.java
package original;

class WordsInSentence {

    public static String wordsInSentence(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (isPrime(words[i].length())) {
                result += words[i] + " ";
            }
        }
        return result.trim();
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```
```java
// WordsInSentenceTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordsInSentenceTest {

    // Test cases can be added here
}
```