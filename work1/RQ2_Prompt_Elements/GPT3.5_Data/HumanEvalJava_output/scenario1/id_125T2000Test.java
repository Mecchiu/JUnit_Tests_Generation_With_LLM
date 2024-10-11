// SplitWordsTest.java
package scenario1;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains ten unit test cases for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {
    
    @Test
    void testSplitWordsWithSpace() {
        String txt = "Hello World";
        Object expected = Arrays.asList("Hello", "World");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithComma() {
        String txt = "Hello,World";
        Object expected = Arrays.asList("Hello", "World");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithNoDelimiter() {
        String txt = "HelloWorld";
        Object expected = 3;
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithEmptyString() {
        String txt = "";
        Object expected = 0;
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithNull() {
        String txt = null;
        Object expected = null;
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithMultipleSpaces() {
        String txt = "Hello    World";
        Object expected = Arrays.asList("Hello", "World");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithMultipleCommas() {
        String txt = "Hello,,,World";
        Object expected = Arrays.asList("Hello", "", "", "World");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithLeadingSpace() {
        String txt = " Hello World";
        Object expected = Arrays.asList("", "Hello", "World");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithTrailingSpace() {
        String txt = "Hello World ";
        Object expected = Arrays.asList("Hello", "World", "");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithMixedDelimiter() {
        String txt = "Hello, World";
        Object expected = Arrays.asList("Hello", "", "World");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
}