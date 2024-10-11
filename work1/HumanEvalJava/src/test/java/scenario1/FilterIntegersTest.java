// FilterIntegersTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterIntegers}.
* It contains ten unit test cases for the {@link FilterIntegers#filterIntegers(List)} method.
*/
class FilterIntegersTest {
			// Test case 1: Test with an empty list
    @Test
    void testFilterIntegersWithEmptyList() {
        List<Object> values = new ArrayList<Object>();
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertTrue(result.isEmpty());
    }

    // Test case 2: Test with a list of integers
    @Test
    void testFilterIntegersWithIntegerList() {
        List<Object> values = new ArrayList<Object>();
        values.add(1);
        values.add(2);
        values.add(3);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(values, result);
    }

    // Test case 3: Test with a list of strings
    @Test
    void testFilterIntegersWithStringList() {
        List<Object> values = new ArrayList<Object>();
        values.add("1");
        values.add("2");
        values.add("3");
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertTrue(result.isEmpty());
    }

    // Test case 4: Test with a list of mixed types
    @Test
    void testFilterIntegersWithMixedList() {
        List<Object> values = new ArrayList<Object>();
        values.add(1);
        values.add("2");
        values.add(3);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(2, result.size());
        assertTrue(result.contains(1));
        assertTrue(result.contains(3));
    }

    // Test case 5: Test with a list of null values
    @Test
    void testFilterIntegersWithNullList() {
        List<Object> values = new ArrayList<Object>();
        values.add(null);
        values.add(null);
        values.add(null);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertTrue(result.isEmpty());
    }

    // Test case 6: Test with a list of negative integers
    @Test
    void testFilterIntegersWithNegativeIntegerList() {
        List<Object> values = new ArrayList<Object>();
        values.add(-1);
        values.add(-2);
        values.add(-3);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(values, result);
    }

    // Test case 7: Test with a list of positive integers
    @Test
    void testFilterIntegersWithPositiveIntegerList() {
        List<Object> values = new ArrayList<Object>();
        values.add(1);
        values.add(2);
        values.add(3);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(values, result);
    }

    // Test case 8: Test with a list of zero values
    @Test
    void testFilterIntegersWithZeroList() {
        List<Object> values = new ArrayList<Object>();
        values.add(0);
        values.add(0);
        values.add(0);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(values, result);
    }

    // Test case 9: Test with a list of floating-point numbers
    @Test
    void testFilterIntegersWithFloatingPointList() {
        List<Object> values = new ArrayList<Object>();
        values.add(1.0);
        values.add(2.0);
        values.add(3.0);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertTrue(result.isEmpty());
    }

    // Test case 10: Test with a list of boolean values
    @Test
    void testFilterIntegersWithBooleanList() {
        List<Object> values = new ArrayList<Object>();
        values.add(true);
        values.add(false);
        values.add(true);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertTrue(result.isEmpty());
    }
}