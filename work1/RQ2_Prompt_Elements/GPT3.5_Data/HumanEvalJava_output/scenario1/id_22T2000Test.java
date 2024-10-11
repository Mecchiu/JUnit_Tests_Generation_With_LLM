// FilterIntegersTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterIntegers}.
* It contains ten unit test cases for the {@link FilterIntegers#filterIntegers(List)} method.
*/
class FilterIntegersTest {
    
    @Test
    void testEmptyList() {
        List<Object> values = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(expected, result);
    }
    
    @Test
    void testListWithIntegersOnly() {
        List<Object> values = Arrays.asList(1, 2, 3, 4, 5);
        List<Object> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(expected, result);
    }
    
    @Test
    void testListWithNonIntegersOnly() {
        List<Object> values = Arrays.asList("a", "b", "c", "d", "e");
        List<Object> expected = new ArrayList<Object>();
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(expected, result);
    }
    
    @Test
    void testListWithMixedValues() {
        List<Object> values = Arrays.asList(1, "a", 2, "b", 3, "c");
        List<Object> expected = Arrays.asList(1, 2, 3);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(expected, result);
    }
    
    @Test
    void testListWithNullValues() {
        List<Object> values = Arrays.asList(1, null, 2, null, 3);
        List<Object> expected = Arrays.asList(1, 2, 3);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(expected, result);
    }
    
    @Test
    void testListWithNegativeIntegers() {
        List<Object> values = Arrays.asList(-3, -2, -1, 0, 1, 2, 3);
        List<Object> expected = Arrays.asList(-3, -2, -1, 0, 1, 2, 3);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(expected, result);
    }
    
    @Test
    void testListWithLargeIntegers() {
        List<Object> values = Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        List<Object> expected = Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(expected, result);
    }
    
    @Test
    void testListWithRepeatedIntegers() {
        List<Object> values = Arrays.asList(1, 2, 3, 2, 1);
        List<Object> expected = Arrays.asList(1, 2, 3, 2, 1);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(expected, result);
    }
    
    @Test
    void testListWithIntegersAndDoubles() {
        List<Object> values = Arrays.asList(1, 2.0, 3, 4.5, 5);
        List<Object> expected = Arrays.asList(1, 3, 5);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(expected, result);
    }
    
    @Test
    void testListWithIntegersAndStrings() {
        List<Object> values = Arrays.asList(1, "a", 2, "b", 3, "c");
        List<Object> expected = Arrays.asList(1, 2, 3);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(expected, result);
    }
}