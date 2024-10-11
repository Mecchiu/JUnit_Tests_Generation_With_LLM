// Import necessary packages
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link MeanAbsoluteDeviation}.
 * It contains ten unit test cases for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
 */
class MeanAbsoluteDeviationTest {

    /**
     * Test case for an empty list of numbers.
     */
    @Test
    void testEmptyList() {
        List<Double> numbers = Arrays.asList();
        Double expectedMAD = 0.0;
        Double actualMAD = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expectedMAD, actualMAD);
    }

    /**
     * Test case for a list of one number.
     */
    @Test
    void testSingleNumber() {
        List<Double> numbers = Arrays.asList(5.0);
        Double expectedMAD = 0.0;
        Double actualMAD = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expectedMAD, actualMAD);
    }

    /**
     * Test case for a list of two numbers.
     */
    @Test
    void testTwoNumbers() {
        List<Double> numbers = Arrays.asList(5.0, 10.0);
        Double expectedMAD = 2.5;
        Double actualMAD = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expectedMAD, actualMAD);
    }

    /**
     * Test case for a list of three numbers.
     */
    @Test
    void testThreeNumbers() {
        List<Double> numbers = Arrays.asList(5.0, 10.0, 15.0);
        Double expectedMAD = 3.3333333333333335;
        Double actualMAD = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expectedMAD, actualMAD);
    }

    /**
     * Test case for a list of four numbers.
     */
    @Test
    void testFourNumbers() {
        List<Double> numbers = Arrays.asList(5.0, 10.0, 15.0, 20.0);
        Double expectedMAD = 5.0;
        Double actualMAD = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expectedMAD, actualMAD);
    }

    /**
     * Test case for a list of five numbers.
     */
    @Test
    void testFiveNumbers() {
        List<Double> numbers = Arrays.asList(5.0, 10.0, 15.0, 20.0, 25.0);
        Double expectedMAD = 6.0;
        Double actualMAD = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expectedMAD, actualMAD);
    }

    /**
     * Test case for a list of negative numbers.
     */
    @Test
    void testNegativeNumbers() {
        List<Double> numbers = Arrays.asList(-5.0, -10.0, -15.0, -20.0, -25.0);
        Double expectedMAD = 6.0;
        Double actualMAD = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expectedMAD, actualMAD);
    }

    /**
     * Test case for a list of mixed positive and negative numbers.
     */
    @Test
    void testMixedNumbers() {
        List<Double> numbers = Arrays.asList(-5.0, 10.0, -15.0, 20.0, -25.0);
        Double expectedMAD = 12.0;
        Double actualMAD = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expectedMAD, actualMAD);
    }

    /**
     * Test case for a list of decimal numbers.
     */
    @Test
    void testDecimalNumbers() {
        List<Double> numbers = Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5);
        Double expectedMAD = 1.0;
        Double actualMAD = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expectedMAD, actualMAD);
    }

    /**
     * Test case for a list of large numbers.
     */
    @Test
    void testLargeNumbers() {
        List<Double> numbers = Arrays.asList(1000000.0, 2000000.0, 3000000.0, 4000000.0, 5000000.0);
        Double expectedMAD = 1000000.0;
        Double actualMAD = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expectedMAD, actualMAD);
    }

    /**
     * Test case for a list of very small numbers.
     */
    @Test
    void testVerySmallNumbers() {
        List<Double> numbers = Arrays.asList(0.0000001, 0.0000002, 0.0000003, 0.0000004, 0.0000005);
        Double expectedMAD = 0.0000001;
        Double actualMAD = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expectedMAD, actualMAD);
    }
}