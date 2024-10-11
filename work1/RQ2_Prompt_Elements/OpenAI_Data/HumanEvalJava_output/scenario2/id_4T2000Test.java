// MeanAbsoluteDeviationTest.java
package scenario2;

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
        Double mad = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(0.0, mad);
    }

    // Test case 2: List with one element
    @Test
    void testOneElementList() {
        List<Double> numbers = List.of(1.0);
        Double mad = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(0.0, mad);
    }

    // Test case 3: List with two elements
    @Test
    void testTwoElementsList() {
        List<Double> numbers = List.of(1.0, 2.0);
        Double mad = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(0.5, mad);
    }

    // Test case 4: List with three elements
    @Test
    void testThreeElementsList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0);
        Double mad = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(0.6666666666666666, mad);
    }

    // Test case 5: List with four elements
    @Test
    void testFourElementsList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0);
        Double mad = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(1.0, mad);
    }

    // Test case 6: List with five elements
    @Test
    void testFiveElementsList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        Double mad = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(1.2, mad);
    }

    // Test case 7: List with six elements
    @Test
    void testSixElementsList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
        Double mad = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(1.5, mad);
    }

    // Test case 8: List with seven elements
    @Test
    void testSevenElementsList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0);
        Double mad = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(1.7142857142857142, mad);
    }

    // Test case 9: List with eight elements
    @Test
    void testEightElementsList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0);
        Double mad = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(2.0, mad);
    }

    // Test case 10: List with nine elements
    @Test
    void testNineElementsList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
        Double mad = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(2.2222222222222223, mad);
    }
}
