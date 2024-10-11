Here's the code for the `WordsStringTest` class with ten unit test cases for the `WordsString` class:

```
package scenario1;

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
    void testEmptyString() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = WordsString.wordsString("");
        assertEquals(expected, actual);
    }

    @Test
    void testSingleWord() {
        List<Object> expected = Arrays.asList("hello");
        List<Object> actual = WordsString.wordsString("hello");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWords() {
        List<Object> expected = Arrays.asList("hello", "world");
        List<Object> actual = WordsString.wordsString("hello world");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithCommas() {
        List<Object> expected = Arrays.asList("hello", "world");
        List<Object> actual = WordsString.wordsString("hello, world");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithExtraSpaces() {
        List<Object> expected = Arrays.asList("hello", "world");
        List<Object> actual = WordsString.wordsString("  hello   world  ");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithMixedDelimiters() {
        List<Object> expected = Arrays.asList("hello", "world", "java");
        List<Object> actual = WordsString.wordsString("hello, world java");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithMixedDelimitersAndExtraSpaces() {
        List<Object> expected = Arrays.asList("hello", "world", "java");
        List<Object> actual = WordsString.wordsString("  hello,  world   java  ");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithOnlyCommas() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = WordsString.wordsString(",,");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithOnlySpaces() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = WordsString.wordsString("   ");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithMixedDelimitersAndEmptyWords() {
        List<Object> expected = Arrays.asList("hello", "world", "java");
        List<Object> actual = WordsString.wordsString("hello, , world java, ");
        assertEquals(expected, actual);
    }
}
```