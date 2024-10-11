// MeanAbsoluteDeviationTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MeanAbsoluteDeviation}.
* It contains one unit test case for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
*/
class MeanAbsoluteDeviationTest {

    /**
     * Test method for
     * {@link original.MeanAbsoluteDeviation#meanAbsoluteDeviation(List)}.
     * Tests the method with a negative number of elements and the expected mean
     * Deviation.
     * Number of elements: -1, Number of centrings: 0
     * Expected mean Deviation: 0.6666666666666666
     *
     * @throws Exception If the test data is not valid.
     */
    @Test
    public void testMeanAbsoluteDeviationWithNegativeNumbers() throws Exception {
        List<Double> numbers = original.MeanAbsoluteDeviation.meanAbsoluteDeviation(List.of(-1, 0));
        Double result = original.MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);

        Double resultExpected = 0.6666666666666666;
        assertEquals(result, resultExpected, 0.0000000001);
    }

    /**
     * Test method for
     * {@link original.MeanAbsoluteDeviation#meanAbsoluteDeviation(List)}.
     * Tests the method with an input list of number and the expected mean
     * Deviation.
     * Number of elements: 1, Number of centrings: 0
     * Expected mean Deviation: 1.6666666666666666
     *
     * @throws Exception If the test data is not valid.
     */
    @Test
    public void testMeanAbsoluteDeviationWithInputListOfNumbersAndZeroCenters() throws Exception {
        List<Double> numbers = original.MeanAbsoluteDeviation.meanAbsoluteDeviation(List.of(Double.valueOf(1.0), Double.valueOf(2.0), Double.valueOf(3.0)));

        Double resultExpected = 1.666666666666666;
        assertEquals(result, resultExpected, 0.0000000001);
    }

    /**
     * Test method for
     * {@link original.MeanAbsoluteDeviation#meanAbsoluteDeviation(List)}.
     * Tests the method with two numbers and the expected mean Deviation.
     * Number of elements: 2, Number of centrings: 0
     * Expected mean Deviation: 2.6666666666666666
     *
     * @throws Exception If the test data is not valid.
     */
    @Test
    public void testMeanAbsoluteDeviationWithTwoNumericsAndZeroCenters() throws Exception {
        List<Double> numbers = List.of(Double.valueOf(1.0), Double.valueOf(2.0), Double.valueOf(3.0));

        Double resultExpected = 2.6666666666696;
        assertEquals(result, resultExpected, 0.0000000001);
    }

    /**
     * Test method for
     * {@link original.MeanAbsoluteDeviation#meanAbsoluteDeviation(List)}.
     * Tests the method with a given List and the expected mean Deviation.
     * Number of elements: 1, Number of centrings: 1
     * Expected mean Deviation: 1.6666666666666666
     *
     * @throws Exception If the test data is not valid.
     */
    @Test
    public void testMeanAbsoluteDeviationWithGivenNumberOfElementsAndCentringOnly() throws Exception {
        List<Double> numbers = original.MeanAbsoluteDeviation.meanAbsoluteDeviation(List.of(Double.valueOf(1.0), Double.valueOf(2.0), Double.valueOf(3.0)));

        Double resultExpected = 1.666666666666668;
        assertEquals(result, resultExpected, 0.0000000001);
    }
}
