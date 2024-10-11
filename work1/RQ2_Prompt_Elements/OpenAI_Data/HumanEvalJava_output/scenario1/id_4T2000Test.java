// MeanAbsoluteDeviationTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MeanAbsoluteDeviation}.
* It contains ten unit test cases for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
*/
class MeanAbsoluteDeviationTest {
	// Test case 1: Empty list
    @Test
    void testEmptyList() {
        List<Double> numbers = List.of();
        Double expected = 0.0;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual);
    }

    // Test case 2: List with one element
    @Test
    void testOneElementList() {
        List<Double> numbers = List.of(1.0);
        Double expected = 0.0;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual);
    }

    // Test case 3: List with two elements
    @Test
    void testTwoElementsList() {
        List<Double> numbers = List.of(1.0, 2.0);
        Double expected = 0.5;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual);
    }

    // Test case 4: List with positive numbers
    @Test
    void testPositiveNumbersList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        Double expected = 1.2;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual);
    }

    // Test case 5: List with negative numbers
    @Test
    void testNegativeNumbersList() {
        List<Double> numbers = List.of(-1.0, -2.0, -3.0, -4.0, -5.0);
        Double expected = 1.2;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual);
    }

    // Test case 6: List with positive and negative numbers
    @Test
    void testPositiveAndNegativeNumbersList() {
        List<Double> numbers = List.of(-1.0, 2.0, -3.0, 4.0, -5.0);
        Double expected = 2.0;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual);
    }

    // Test case 7: List with decimal numbers
    @Test
    void testDecimalNumbersList() {
        List<Double> numbers = List.of(1.5, 2.5, 3.5, 4.5, 5.5);
        Double expected = 1.0;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual);
    }

    // Test case 8: List with zero
    @Test
    void testZeroList() {
        List<Double> numbers = List.of(0.0, 0.0, 0.0, 0.0, 0.0);
        Double expected = 0.0;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual);
    }

    // Test case 9: List with positive infinity
    @Test
    void testPositiveInfinityList() {
        List<Double> numbers = List.of(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        Double expected = Double.NaN;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual);
    }

    // Test case 10: List with negative infinity
    @Test
    void testNegativeInfinityList() {
        List<Double> numbers = List.of(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
        Double expected = Double.NaN;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual);
    }
}
