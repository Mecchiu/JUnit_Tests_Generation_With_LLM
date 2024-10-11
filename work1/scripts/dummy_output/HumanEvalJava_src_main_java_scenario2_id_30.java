// GetPositiveTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains ten unit test cases for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {
			// Test case 1: Test with empty list
    @Test
    void testGetPositiveWithEmptyList() {
        List<Object> l = new ArrayList<Object>();
        List<Object> result = GetPositive.getPositive(l);
        assertTrue(result.isEmpty());
    }

    // Test case 2: Test with list of positive numbers
    @Test
    void testGetPositiveWithPositiveNumbers() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(2);
        l.add(3);
        List<Object> result = GetPositive.getPositive(l);
        assertEquals(l, result);
    }

    // Test case 3: Test with list of negative numbers
    @Test
    void testGetPositiveWithNegativeNumbers() {
        List<Object> l = new ArrayList<Object>();
        l.add(-1);
        l.add(-2);
        l.add(-3);
        List<Object> result = GetPositive.getPositive(l);
        assertTrue(result.isEmpty());
    }

    // Test case 4: Test with list of zero
    @Test
    void testGetPositiveWithZero() {
        List<Object> l = new ArrayList<Object>();
        l.add(0);
        List<Object> result = GetPositive.getPositive(l);
        assertTrue(result.isEmpty());
    }

    // Test case 5: Test with list of positive and negative numbers
    @Test
    void testGetPositiveWithPositiveAndNegativeNumbers() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(-2);
        l.add(3);
        List<Object> result = GetPositive.getPositive(l);
        assertEquals(2, result.size());
        assertEquals(1, result.get(0));
        assertEquals(3, result.get(1));
    }

    // Test case 6: Test with list of positive and zero
    @Test
    void testGetPositiveWithPositiveAndZero() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(0);
        List<Object> result = GetPositive.getPositive(l);
        assertEquals(1, result.size());
        assertEquals(1, result.get(0));
    }

    // Test case 7: Test with list of negative and zero
    @Test
    void testGetPositiveWithNegativeAndZero() {
        List<Object> l = new ArrayList<Object>();
        l.add(-1);
        l.add(0);
        List<Object> result = GetPositive.getPositive(l);
        assertTrue(result.isEmpty());
    }

    // Test case 8: Test with list of positive, negative and zero
    @Test
    void testGetPositiveWithPositiveNegativeAndZero() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(-2);
        l.add(0);
        List<Object> result = GetPositive.getPositive(l);
        assertEquals(1, result.size());
        assertEquals(1, result.get(0));
    }

    // Test case 9: Test with list of positive and string
    @Test
    void testGetPositiveWithPositiveAndString() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add("2");
        List<Object> result = GetPositive.getPositive(l);
        assertEquals(1, result.size());
        assertEquals(1, result.get(0));
    }

    // Test case 10: Test with list of negative and string
    @Test
    void testGetPositiveWithNegativeAndString() {
        List<Object> l = new ArrayList<Object>();
        l.add(-1);
        l.add("2");
        List<Object> result = GetPositive.getPositive(l);
        assertTrue(result.isEmpty());
    }
}