// FilterIntegers.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class FilterIntegers {

    /**
     * Filter given list of any Java values only for integers.
     *
     * > filterIntegers(["a", 3.14, 5])
     * [5]
     * > filterIntegers([1, 2, 3, "abc", {}, []])
     * [1, 2, 3]
     * > filterIntegers([])
     * []
     * > filterIntegers([4, {}, [], 23.2, 9, "adasd"])
     * [4, 9]
     * > filterIntegers([3, "c", 3, 3, "a", "b"])
     * [3, 3, 3]
     */
    public static List<Object> filterIntegers(List<Object> values) {
        List<Object> integers = new ArrayList<>();
        for (Object value : values) {
            if (value instanceof Integer) {
                integers.add(value);
            }
        }
        return integers;
    }
}

// FilterIntegersTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterIntegers}.
* It contains ten unit test cases for the {@link FilterIntegers#filterIntegers(List)} method.
*/
class FilterIntegersTest {

    @Test
    void testFilterIntegersWithMixedValues() {
        List<Object> values = new ArrayList<>();
        values.add("a");
        values.add(3.14);
        values.add(5);
        List<Object> expected = new ArrayList<>();
        expected.add(5);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegersWithNonIntegerValues() {
        List<Object> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add("abc");
        values.add(new Object());
        values.add(new ArrayList<>());
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegersWithEmptyList() {
        List<Object> values = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegersWithMixedValuesAndNonIntegerValues() {
        List<Object> values = new ArrayList<>();
        values.add(4);
        values.add(new Object());
        values.add(new ArrayList<>());
        values.add(23.2);
        values.add(9);
        values.add("adasd");
        List<Object> expected = new ArrayList<>();
        expected.add(4);
        expected.add(9);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegersWithRepeatedValues() {
        List<Object> values = new ArrayList<>();
        values.add(3);
        values.add("c");
        values.add(3);
        values.add(3);
        values.add("a");
        values.add("b");
        List<Object> expected = new ArrayList<>();
        expected.add(3);
        expected.add(3);
        expected.add(3);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegersWithAllNonIntegerValues() {
        List<Object> values = new ArrayList<>();
        values.add("abc");
        values.add(new Object());
        values.add(new ArrayList<>());
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegersWithAllIntegerValues() {
        List<Object> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegersWithNegativeIntegerValues() {
        List<Object> values = new ArrayList<>();
        values.add(-1);
        values.add(-2);
        values.add(-3);
        List<Object> expected = new ArrayList<>();
        expected.add(-1);
        expected.add(-2);
        expected.add(-3);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegersWithZeroValue() {
        List<Object> values = new ArrayList<>();
        values.add(0);
        List<Object> expected = new ArrayList<>();
        expected.add(0);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegersWithLargeIntegerValues() {
        List<Object> values = new ArrayList<>();
        values.add(Integer.MAX_VALUE);
        values.add(Integer.MIN_VALUE);
        List<Object> expected = new ArrayList<>();
        expected.add(Integer.MAX_VALUE);
        expected.add(Integer.MIN_VALUE);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }
}