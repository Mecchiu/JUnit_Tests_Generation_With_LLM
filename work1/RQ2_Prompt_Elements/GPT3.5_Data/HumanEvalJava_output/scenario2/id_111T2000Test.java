// Here's the source code for the HistogramTest class:

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

    @Test
    void testEmptyString() {
        Map<String, Integer> expected = new HashMap<>();
        assertEquals(expected, Histogram.histogram(""));
    }

    @Test
    void testNullString() {
        Map<String, Integer> expected = new HashMap<>();
        assertEquals(expected, Histogram.histogram(null));
    }

    @Test
    void testSingleLetter() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        assertEquals(expected, Histogram.histogram("a"));
    }

    @Test
    void testMultipleLetters() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        assertEquals(expected, Histogram.histogram("a b a b"));
    }

    @Test
    void testMultipleLettersWithDifferentCounts() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 3);
        expected.put("b", 2);
        assertEquals(expected, Histogram.histogram("a b a b a"));
    }

    @Test
    void testMultipleLettersWithSameCounts() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        assertEquals(expected, Histogram.histogram("a b a b"));
    }

    @Test
    void testLongString() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 5);
        expected.put("b", 4);
        expected.put("c", 3);
        expected.put("d", 2);
        expected.put("e", 1);
        assertEquals(expected, Histogram.histogram("a b c d e a b c d a b c a b a"));
    }

    @Test
    void testStringWithSpaces() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        assertEquals(expected, Histogram.histogram("a b  a b"));
    }

    @Test
    void testStringWithTabs() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        assertEquals(expected, Histogram.histogram("a\tb\ta\tb"));
    }

    @Test
    void testStringWithNewlines() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        assertEquals(expected, Histogram.histogram("a\nb\na\nb"));
    }

    @Test
    void testStringWithMixedWhitespace() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        assertEquals(expected, Histogram.histogram("a \t\nb \t\na \t\nb"));
    }
}