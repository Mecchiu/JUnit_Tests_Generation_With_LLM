// RescaleToUnitTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RescaleToUnit}.
* It contains ten unit test cases for the {@link RescaleToUnit#rescaleToUnit(List)} method.
*/
class RescaleToUnitTest {
			// Test case 1: Empty list
    @Test
    void testRescaleToUnitEmptyList() {
        List<Double> numbers = new ArrayList<Double>();
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertTrue(result.isEmpty());
    }

    // Test case 2: List with one element
    @Test
    void testRescaleToUnitOneElement() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(1.0, result.get(0));
    }

    // Test case 3: List with two elements
    @Test
    void testRescaleToUnitTwoElements() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(0.0, result.get(0));
        assertEquals(1.0, result.get(1));
    }

    // Test case 4: List with two equal elements
    @Test
    void testRescaleToUnitTwoEqualElements() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(1.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(0.0, result.get(0));
        assertEquals(0.0, result.get(1));
    }

    // Test case 5: List with three elements
    @Test
    void testRescaleToUnitThreeElements() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(0.0, result.get(0));
        assertEquals(0.5, result.get(1));
        assertEquals(1.0, result.get(2));
    }

    // Test case 6: List with three equal elements
    @Test
    void testRescaleToUnitThreeEqualElements() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(1.0);
        numbers.add(1.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(0.0, result.get(0));
        assertEquals(0.0, result.get(1));
        assertEquals(0.0, result.get(2));
    }

    // Test case 7: List with four elements
    @Test
    void testRescaleToUnitFourElements() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(0.0, result.get(0));
        assertEquals(0.3333333333333333, result.get(1));
        assertEquals(0.6666666666666666, result.get(2));
        assertEquals(1.0, result.get(3));
    }

    // Test case 8: List with four equal elements
    @Test
    void testRescaleToUnitFourEqualElements() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(1.0);
        numbers.add(1.0);
        numbers.add(1.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(0.0, result.get(0));
        assertEquals(0.0, result.get(1));
        assertEquals(0.0, result.get(2));
        assertEquals(0.0, result.get(3));
    }

    // Test case 9: List with five elements
    @Test
    void testRescaleToUnitFiveElements() {
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

    // Test case 10: List with five equal elements
    @Test
    void testRescaleToUnitFiveEqualElements() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(1.0);
        numbers.add(1.0);
        numbers.add(1.0);
        numbers.add(1.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(0.0, result.get(0));
        assertEquals(0.0, result.get(1));
        assertEquals(0.0, result.get(2));
        assertEquals(0.0, result.get(3));
        assertEquals(0.0, result.get(4));
    }
}