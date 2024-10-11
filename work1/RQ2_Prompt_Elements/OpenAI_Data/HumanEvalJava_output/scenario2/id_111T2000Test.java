// HistogramTest.java
package scenario2;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Histogram}.
* It contains ten unit test cases for the {@link Histogram#histogram(String)} method.
*/
class HistogramTest {
	// Test case 1: test with null input
    @Test
    void testHistogramWithNullInput() {
        Map<String, Integer> expected = new HashMap<>();
        assertEquals(expected, Histogram.histogram(null));
    }

    // Test case 2: test with empty input
    @Test
    void testHistogramWithEmptyInput() {
        Map<String, Integer> expected = new HashMap<>();
        assertEquals(expected, Histogram.histogram(""));
    }

    // Test case 3: test with one letter
    @Test
    void testHistogramWithOneLetter() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        assertEquals(expected, Histogram.histogram("a"));
    }

    // Test case 4: test with one letter and one space
    @Test
    void testHistogramWithOneLetterAndOneSpace() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        assertEquals(expected, Histogram.histogram("a "));
    }

    // Test case 5: test with one letter and two spaces
    @Test
    void testHistogramWithOneLetterAndTwoSpaces() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        assertEquals(expected, Histogram.histogram("a  "));
    }

    // Test case 6: test with two letters
    @Test
    void testHistogramWithTwoLetters() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        expected.put("b", 1);
        assertEquals(expected, Histogram.histogram("a b"));
    }

    // Test case 7: test with two letters and one space
    @Test
    void testHistogramWithTwoLettersAndOneSpace() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        expected.put("b", 1);
        assertEquals(expected, Histogram.histogram("a b "));
    }

    // Test case 8: test with two letters and two spaces
    @Test
    void testHistogramWithTwoLettersAndTwoSpaces() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        expected.put("b", 1);
        assertEquals(expected, Histogram.histogram("a b  "));
    }

    // Test case 9: test with two letters and three spaces
    @Test
    void testHistogramWithTwoLettersAndThreeSpaces() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        expected.put("b", 1);
        assertEquals(expected, Histogram.histogram("a b   "));
    }

    // Test case 10: test with two letters and three spaces
    @Test
    void testHistogramWithTwoLettersAndThreeSpaces2() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 1);
        assertEquals(expected, Histogram.histogram("a a b"));
    }
}
