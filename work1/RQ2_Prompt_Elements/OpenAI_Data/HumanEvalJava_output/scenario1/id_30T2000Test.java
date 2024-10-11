// GetPositiveTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains ten unit test cases for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {
	// Test case 1: Test with an empty list
    @Test
    void testGetPositiveWithEmptyList() {
        List<Object> l = new ArrayList<Object>();
        List<Object> result = GetPositive.getPositive(l);
        assertTrue(result.isEmpty());
    }

    // Test case 2: Test with a list containing only negative integers
    @Test
    void testGetPositiveWithOnlyNegativeIntegers() {
        List<Object> l = new ArrayList<Object>();
        l.add(-1);
        l.add(-2);
        l.add(-3);
        List<Object> result = GetPositive.getPositive(l);
        assertTrue(result.isEmpty());
    }

    // Test case 3: Test with a list containing only positive integers
    @Test
    void testGetPositiveWithOnlyPositiveIntegers() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(2);
        l.add(3);
        List<Object> result = GetPositive.getPositive(l);
        assertEquals(l, result);
    }

    // Test case 4: Test with a list containing both positive and negative integers
    @Test
    void testGetPositiveWithBothPositiveAndNegativeIntegers() {
        List<Object> l = new ArrayList<Object>();
        l.add(-1);
        l.add(2);
        l.add(-3);
        l.add(4);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(4);
        List<Object> result = GetPositive.getPositive(l);
        assertEquals(expected, result);
    }

    // Test case 5: Test with a list containing only zero
    @Test
    void testGetPositiveWithOnlyZero() {
        List<Object> l = new ArrayList<Object>();
        l.add(0);
        List<Object> result = GetPositive.getPositive(l);
        assertTrue(result.isEmpty());
    }

    // Test case 6: Test with a list containing both positive and zero
    @Test
    void testGetPositiveWithBothPositiveAndZero() {
        List<Object> l = new ArrayList<Object>();
        l.add(0);
        l.add(1);
        l.add(2);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        List<Object> result = GetPositive.getPositive(l);
        assertEquals(expected, result);
    }

    // Test case 7: Test with a list containing both negative and zero
    @Test
    void testGetPositiveWithBothNegativeAndZero() {
        List<Object> l = new ArrayList<Object>();
        l.add(0);
        l.add(-1);
        l.add(-2);
        List<Object> result = GetPositive.getPositive(l);
        assertTrue(result.isEmpty());
    }

    // Test case 8: Test with a list containing both positive, negative and zero
    @Test
    void testGetPositiveWithPositiveNegativeAndZero() {
        List<Object> l = new ArrayList<Object>();
        l.add(0);
        l.add(-1);
        l.add(2);
        l.add(-3);
        l.add(4);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(4);
        List<Object> result = GetPositive.getPositive(l);
        assertEquals(expected, result);
    }

    // Test case 9: Test with a list containing both positive and non-integer values
    @Test
    void testGetPositiveWithPositiveAndNonIntegerValues() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add("2");
        l.add(3);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(3);
        List<Object> result = GetPositive.getPositive(l);
        assertEquals(expected, result);
    }

    // Test case 10: Test with a list containing both negative and non-integer values
    @Test
    void testGetPositiveWithNegativeAndNonIntegerValues() {
        List<Object> l = new ArrayList<Object>();
        l.add(-1);
        l.add("2");
        l.add(-3);
        List<Object> expected = new ArrayList<Object>();
        expected.add("2");
        List<Object> result = GetPositive.getPositive(l);
        assertEquals(expected, result);
    }
}
