// MeanAbsoluteDeviationTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MeanAbsoluteDeviation}.
* It contains one unit test case for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
*/
class MeanAbsoluteDeviationTest {
/**
		* Test case for {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List),
		* MeanAbsoluteDeviation#meanAbsoluteDeviation(List)}.
		* @throws InterruptedException
		*
		* @see MeanAbsoluteDeviation#meanAbsoluteDeviation(List)
		*/
    @Test
    void testMeanAbsoluteDeviation() throws InterruptedException {

        int count = 10; 				// number of digits
        List<Double> numbers = List.of(10.0, 25.0, 5.0, 12.0, 100.0, 2000.0, 6.0);

		assertAlmostEquals(10.0, Double.MIN_VALUE, 50f);
		assertEquals(Double.MAX_VALUE, meanAbsoluteDeviation(numbers), 0);

        List<Double> numbers2 = List.of(10.0, 27.0, 8.3);
		assertAlmostEquals(Double.MIN_VALUE, meanAbsoluteDeviation(numbers2), 0);

        List<Double> numbers1 = List.of(100, 9.5);
		assertAlmostEquals(Double.MIN_VALUE, meanAbsoluteDeviation(numbers1), 0);

        List<Double> numbers3 = List.of(10.0, 25.0, 5.0, 12.0, 100.0, 2000.0, 6.0);
		assertAlmostEquals(100.0, meanAbsoluteDeviation(numbers3), 0);
        
		assertAlmostEquals(500.0, meanAbsoluteDeviation(numbers3), 0);
    }
}


// MeanAbsoluteDeviationTest.java
