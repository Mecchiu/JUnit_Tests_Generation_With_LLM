// Histogram.java
package scenario3;

import java.util.HashMap;
import java.util.Map;

class Histogram {

    /**
     * Given a string representing a space separated lowercase letters, return a dictionary
     * of the letter with the most repetition and containing the corresponding count.
     * If several letters have the same occurrence, return all of them.
     *
     * Example:
     * histogram('a b c') == {'a': 1, 'b': 1, 'c': 1}
     * histogram('a b b a') == {'a': 2, 'b': 2}
     * histogram('a b c a b') == {'a': 2, 'b': 2}
     * histogram('b b b b a') == {'b': 4}
     * histogram('') == {}
     *
     * > histogram("a b b a")
     * {"a": 2, "b": 2}
     * > histogram("a b c a b")
     * {"a": 2, "b": 2}
     * > histogram("a b c d g")
     * {"a": 1, "b": 1, "c": 1, "d": 1, "g": 1}
     * > histogram("r t g")
     * {"r": 1, "t": 1, "g": 1}
     * > histogram("b b b b a")
     * {"b": 4}
     * > histogram("r t g")
     * {"r": 1, "t": 1, "g": 1}
     * > histogram("")
     * {}
     * > histogram("a")
     * {"a": 1}
     */
    public static Map<Character, Integer> histogram(String test) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : test.toCharArray()) {
            if (c != ' ') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        int maxCount = 0;
        for (int count : map.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        Map<Character, Integer> result = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }
}

// HistogramTest.java
package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Histogram}.
* It contains ten unit test cases for the {@link Histogram#histogram(String)} method.
*/
class HistogramTest {

    @Test
    void testEmptyString() {
        Map<Character, Integer> expected = new HashMap<>();
        Map<Character, Integer> actual = Histogram.histogram("");
        assertEquals(expected, actual);
    }

    @Test
    void testSingleCharacter() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 1);
        Map<Character, Integer> actual = Histogram.histogram("a");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleCharactersWithEqualCounts() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('b', 2);
        Map<Character, Integer> actual = Histogram.histogram("a b b a");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleCharactersWithDifferentCounts() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('b', 2);
        Map<Character, Integer> actual = Histogram.histogram("a b c a b");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleCharactersWithOneMaxCount() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('b', 4);
        Map<Character, Integer> actual = Histogram.histogram("b b b b a");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleCharactersWithAllMaxCount() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 1);
        expected.put('b', 1);
        expected.put('c', 1);
        expected.put('d', 1);
        expected.put('g', 1);
        Map<Character, Integer> actual = Histogram.histogram("a b c d g");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleCharactersWithNoSpaces() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('r', 1);
        expected.put('t', 1);
        expected.put('g', 1);
        Map<Character, Integer> actual = Histogram.histogram("r t g");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleCharactersWithSpaces() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('r', 1);
        expected.put('t', 1);
        expected.put('g', 1);
        Map<Character, Integer> actual = Histogram.histogram("r t g ");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleCharactersWithLeadingSpaces() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('r', 1);
        expected.put('t', 1);
        expected.put('g', 1);
        Map<Character, Integer> actual = Histogram.histogram(" r t g");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleCharactersWithTrailingSpaces() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('r', 1);
        expected.put('t', 1);
        expected.put('g', 1);
        Map<Character, Integer> actual = Histogram.histogram("r t g ");
        assertEquals(expected, actual);
    }
}