// HistogramTest.java
package scenario1;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Histogram}.
* It contains ten unit test cases for the {@link Histogram#histogram(String)} method.
*/
class HistogramTest {
	// Test case 1: Empty string
    @Test
    void testHistogramEmptyString() {
        String test = "";
        Map<String, Integer> expected = new HashMap<>();
        Map<String, Integer> actual = (Map<String, Integer>) Histogram.histogram(test);
        assertEquals(expected, actual);
    }
			// Test case 2: String with one word
    @Test
    void testHistogramOneWord() {
        String test = "hello";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 1);
        Map<String, Integer> actual = (Map<String, Integer>) Histogram.histogram(test);
        assertEquals(expected, actual);
    }
			// Test case 3: String with multiple words
    @Test
    void testHistogramMultipleWords() {
        String test = "hello world hello";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        Map<String, Integer> actual = (Map<String, Integer>) Histogram.histogram(test);
        assertEquals(expected, actual);
    }
			// Test case 4: String with special characters
    @Test
    void testHistogramSpecialCharacters() {
        String test = "hello world! hello";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world!", 1);
        Map<String, Integer> actual = (Map<String, Integer>) Histogram.histogram(test);
        assertEquals(expected, actual);
    }
			// Test case 5: String with numbers
    @Test
    void testHistogramNumbers() {
        String test = "hello 123 world hello";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("123", 1);
        expected.put("world", 1);
        Map<String, Integer> actual = (Map<String, Integer>) Histogram.histogram(test);
        assertEquals(expected, actual);
    }
			// Test case 6: String with uppercase and lowercase letters
    @Test
    void testHistogramUppercaseAndLowercase() {
        String test = "Hello world hello";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        Map<String, Integer> actual = (Map<String, Integer>) Histogram.histogram(test);
        assertEquals(expected, actual);
    }
			// Test case 7: String with multiple spaces
    @Test
    void testHistogramMultipleSpaces() {
        String test = "hello   world hello";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        Map<String, Integer> actual = (Map<String, Integer>) Histogram.histogram(test);
        assertEquals(expected, actual);
    }
			// Test case 8: String with leading and trailing spaces
    @Test
    void testHistogramLeadingAndTrailingSpaces() {
        String test = "  hello world hello  ";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        Map<String, Integer> actual = (Map<String, Integer>) Histogram.histogram(test);
        assertEquals(expected, actual);
    }
			// Test case 9: String with special characters and numbers
    @Test
    void testHistogramSpecialCharactersAndNumbers() {
        String test = "hello world! 123 hello";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world!", 1);
        expected.put("123", 1);
        Map<String, Integer> actual = (Map<String, Integer>) Histogram.histogram(test);
        assertEquals(expected, actual);
    }
			// Test case 10: String with all special characters
    @Test
    void testHistogramAllSpecialCharacters() {
        String test = "!@#$%^&*()_+";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("!@#$%^&*()_+", 1);
        Map<String, Integer> actual = (Map<String, Integer>) Histogram.histogram(test);
        assertEquals(expected, actual);
    }
}
