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
			// Test case 1: Test for a string with multiple words separated by space
    @Test
    public void testSplitWords1() {
        String txt = "Hello World";
        Object expResult = Arrays.asList("Hello", "World");
        Object result = SplitWords.splitWords(txt);
        assertEquals(expResult, result);
    }

    // Test case 2: Test for a string with multiple words separated by comma
    @Test
    public void testSplitWords2() {
        String txt = "Hello,World";
        Object expResult = Arrays.asList("Hello", "World");
        Object result = SplitWords.splitWords(txt);
        assertEquals(expResult, result);
    }

    // Test case 3: Test for a string with a single word
    @Test
    public void testSplitWords3() {
        String txt = "Hello";
        Object expResult = Arrays.asList("Hello");
        Object result = SplitWords.splitWords(txt);
        assertEquals(expResult, result);
    }

    // Test case 4: Test for a string with a single character
    @Test
    public void testSplitWords4() {
        String txt = "H";
        Object expResult = 0;
        Object result = SplitWords.splitWords(txt);
        assertEquals(expResult, result);
    }

    // Test case 5: Test for a string with a single number
    @Test
    public void testSplitWords5() {
        String txt = "1";
        Object expResult = 0;
        Object result = SplitWords.splitWords(txt);
        assertEquals(expResult, result);
    }

    // Test case 6: Test for a string with a single special character
    @Test
    public void testSplitWords6() {
        String txt = "@";
        Object expResult = 0;
        Object result = SplitWords.splitWords(txt);
        assertEquals(expResult, result);
    }

    // Test case 7: Test for a string with multiple words separated by space and comma
    @Test
    public void testSplitWords7() {
        String txt = "Hello, World";
        Object expResult = Arrays.asList("Hello", "World");
        Object result = SplitWords.splitWords(txt);
        assertEquals(expResult, result);
    }

    // Test case 8: Test for a string with multiple words separated by comma and space
    @Test
    public void testSplitWords8() {
        String txt = "Hello ,World";
        Object expResult = Arrays.asList("Hello", "World");
        Object result = SplitWords.splitWords(txt);
        assertEquals(expResult, result);
    }

    // Test case 9: Test for a string with multiple words separated by multiple spaces
    @Test
    public void testSplitWords9() {
        String txt = "Hello   World";
        Object expResult = Arrays.asList("Hello", "World");
        Object result = SplitWords.splitWords(txt);
        assertEquals(expResult, result);
    }

    // Test case 10: Test for a string with multiple words separated by multiple commas
    @Test
    public void testSplitWords10() {
        String txt = "Hello,,,World";
        Object expResult = Arrays.asList("Hello", "World");
        Object result = SplitWords.splitWords(txt);
        assertEquals(expResult, result);
    }
}