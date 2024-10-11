// SplitWordsTest.java
package scenario2;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains ten unit test cases for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {
    
    @Test
    void testSplitWordsWithSpaces() {
        String txt = "This is a test";
        Object expected = Arrays.asList("This", "is", "a", "test");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithCommas() {
        String txt = "This,is,a,test";
        Object expected = Arrays.asList("This", "is", "a", "test");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithMixedSeparators() {
        String txt = "This is,a,test";
        Object expected = Arrays.asList("This", "is", "a", "test");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithNoSeparators() {
        String txt = "Thisisatest";
        Object expected = 4;
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithOnlySpaces() {
        String txt = "   ";
        Object expected = Arrays.asList("");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithOnlyCommas() {
        String txt = ",,,";
        Object expected = Arrays.asList("", "", "", "");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithMixedCase() {
        String txt = "ThIs Is A TeSt";
        Object expected = Arrays.asList("ThIs", "Is", "A", "TeSt");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithNumbers() {
        String txt = "This is a 123 test";
        Object expected = Arrays.asList("This", "is", "a", "123", "test");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithSpecialCharacters() {
        String txt = "This is a $%& test";
        Object expected = Arrays.asList("This", "is", "a", "$%&", "test");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSplitWordsWithEmptyString() {
        String txt = "";
        Object expected = Arrays.asList("");
        Object actual = SplitWords.splitWords(txt);
        assertEquals(expected, actual);
    }
}