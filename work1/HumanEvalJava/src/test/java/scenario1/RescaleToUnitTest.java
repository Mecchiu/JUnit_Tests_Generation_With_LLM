// RescaleToUnitTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RescaleToUnit}.
* It contains ten unit test cases for the {@link RescaleToUnit#rescaleToUnit(List)} method.
*/
class RescaleToUnitTest {
			// Test case 1: Test the method with an empty list.
    @Test
    void testRescaleToUnitWithEmptyList() {
        List<Double> numbers = new ArrayList<Double>();
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertTrue(result.isEmpty());
    }

    // Test case 2: Test the method with a list containing only one element.
    @Test
    void testRescaleToUnitWithOneElement() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(1.0, result.get(0));
    }

    // Test case 3: Test the method with a list containing two elements.
    @Test
    void testRescaleToUnitWithTwoElements() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(0.0, result.get(0));
        assertEquals(1.0, result.get(1));
    }

    // Test case 4: Test the method with a list containing multiple elements.
    @Test
    void testRescaleToUnitWithMultipleElements() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(0.0, result.get(0));
        assertEquals(0.25, result.get(1));
        assertEquals(0.5, result.get(2));
        assertEquals(0.75, result.get(3));
        assertEquals(1.0, result.get(4));
    }

    // Test case 5: Test the method with a list containing negative elements.
    @Test
    void testRescaleToUnitWithNegativeElements() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(-5.0);
        numbers.add(-4.0);
        numbers.add(-3.0);
        numbers.add(-2.0);
        numbers.add(-1.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(0.0, result.get(0));
        assertEquals(0.25, result.get(1));
        assertEquals(0.5, result.get(2));
        assertEquals(0.75, result.get(3));
        assertEquals(1.0, result.get(4));
    }

    // Test case 6: Test the method with a list containing duplicate elements.
    @Test
    void testRescaleToUnitWithDuplicateElements() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(2.0);
        numbers.add(3.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(0.0, result.get(0));
        assertEquals(0.0, result.get(1));
        assertEquals(0.25, result.get(2));
        assertEquals(0.25, result.get(3));
        assertEquals(0.5, result.get(4));
    }

    // Test case 7: Test the method with a list containing large elements.
    @Test
    void testRescaleToUnitWithLargeElements() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1000000000.0);
        numbers.add(2000000000.0);
        numbers.add(3000000000.0);
        numbers.add(4000000000.0);
        numbers.add(5000000000.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(0.0, result.get(0));
        assertEquals(0.25, result.get(1));
        assertEquals(0.5, result.get(2));
        assertEquals(0.75, result.get(3));
        assertEquals(1.0, result.get(4));
    }

    // Test case 8: Test the method with a list containing small elements.
    @Test
    void testRescaleToUnitWithSmallElements() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(0.000000001);
        numbers.add(0.000000002);
        numbers.add(0.000000003);
        numbers.add(0.000000004);
        numbers.add(0.000000005);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(0.0, result.get(0));
        assertEquals(0.25, result.get(1));
        assertEquals(0.5, result.get(2));
        assertEquals(0.75, result.get(3));
        assertEquals(1.0, result.get(4));
    }

    // Test case 9: Test the method with a list containing null elements.
    @Test
    void testRescaleToUnitWithNullElements() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertNull(result.get(0));
        assertNull(result.get(1));
        assertNull(result.get(2));
        assertNull(result.get(3));
        assertNull(result.get(4));
    }

    // Test case 10: Test the method with a list containing a mix of elements.
    @Test
    void testRescaleToUnitWithMixedElements() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(null);
        numbers.add(2.0);
        numbers.add(-3.0);
        numbers.add(4.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(0.0, result.get(0));
        assertNull(result.get(1));
        assertEquals(0.25, result.get(2));
        assertEquals(0.0, result.get(3));
        assertEquals(0.75, result.get(4));
    }
}