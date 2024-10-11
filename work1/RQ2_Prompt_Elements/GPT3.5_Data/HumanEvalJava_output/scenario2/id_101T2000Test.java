Here's the code for the `WordsStringTest` class with ten unit test cases for the `WordsString` class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    void testCommaSeparatedWords() {
        List<Object> expected = Arrays.asList("hello", "world");
        List<Object> actual = WordsString.wordsString("hello,world");
        assertEquals(expected, actual);
    }

    @Test
    void testMixedSeparatorWords() {
        List<Object> expected = Arrays.asList("hello", "world", "java");
        List<Object> actual = WordsString.wordsString("hello, world java");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleSpaces() {
        List<Object> expected = Arrays.asList("hello", "world");
        List<Object> actual = WordsString.wordsString("hello     world");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleCommas() {
        List<Object> expected = Arrays.asList("hello", "world");
        List<Object> actual = WordsString.wordsString("hello,,,world");
        assertEquals(expected, actual);
    }

    @Test
    void testLeadingSpaces() {
        List<Object> expected = Arrays.asList("hello", "world");
        List<Object> actual = WordsString.wordsString("   hello world");
        assertEquals(expected, actual);
    }

    @Test
    void testTrailingSpaces() {
        List<Object> expected = Arrays.asList("hello", "world");
        List<Object> actual = WordsString.wordsString("hello world   ");
        assertEquals(expected, actual);
    }

    @Test
    void testMixedSpacesAndCommas() {
        List<Object> expected = Arrays.asList("hello", "world", "java");
        List<Object> actual = WordsString.wordsString("hello,   world  ,java");
        assertEquals(expected, actual);
    }
}
```