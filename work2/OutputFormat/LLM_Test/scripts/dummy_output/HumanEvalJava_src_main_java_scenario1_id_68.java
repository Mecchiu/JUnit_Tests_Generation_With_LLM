// PluckTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pluck}.
* It contains ten unit test cases for the {@link Pluck#pluck(List)} method.
*/
class PluckTest {
			// Test case 1: Test with empty list
    @Test
    void testPluckWithEmptyList() {
        List<Object> arr = new ArrayList<Object>();
        List<Object> result = Pluck.pluck(arr);
        assertEquals(0, result.size());
    }

    // Test case 2: Test with list of strings
    @Test
    void testPluckWithListOfStrings() {
        List<Object> arr = new ArrayList<Object>();
        arr.add("Hello");
        arr.add("World");
        List<Object> result = Pluck.pluck(arr);
        assertEquals(0, result.size());
    }

    // Test case 3: Test with list of integers
    @Test
    void testPluckWithListOfIntegers() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(2, result.get(0));
        assertEquals(1, result.get(1));
    }

    // Test case 4: Test with list of integers with negative values
    @Test
    void testPluckWithListOfIntegersWithNegativeValues() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(-1);
        arr.add(-2);
        arr.add(-3);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(-2, result.get(0));
        assertEquals(1, result.get(1));
    }

    // Test case 5: Test with list of integers with even values
    @Test
    void testPluckWithListOfIntegersWithEvenValues() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(2, result.get(0));
        assertEquals(0, result.get(1));
    }

    // Test case 6: Test with list of integers with odd values
    @Test
    void testPluckWithListOfIntegersWithOddValues() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(1, result.get(0));
        assertEquals(0, result.get(1));
    }

    // Test case 7: Test with list of integers with even and odd values
    @Test
    void testPluckWithListOfIntegersWithEvenAndOddValues() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(2, result.get(0));
        assertEquals(1, result.get(1));
    }

    // Test case 8: Test with list of integers with even and odd values
    // and with negative values
    @Test
    void testPluckWithListOfIntegersWithEvenAndOddValuesAndNegativeValues() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(-1);
        arr.add(2);
        arr.add(-3);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(2, result.get(0));
        assertEquals(1, result.get(1));
    }

    // Test case 9: Test with list of integers with even and odd values
    // and with negative values
    @Test
    void testPluckWithListOfIntegersWithEvenAndOddValuesAndNegativeValues2() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(-1);
        arr.add(-2);
        arr.add(3);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(-2, result.get(0));
        assertEquals(1, result.get(1));
    }

    // Test case 10: Test with list of integers with even and odd values
    // and with negative values
    @Test
    void testPluckWithListOfIntegersWithEvenAndOddValuesAndNegativeValues3() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(-1);
        arr.add(-2);
        arr.add(-3);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(-2, result.get(0));
        assertEquals(1, result.get(1));
    }
}