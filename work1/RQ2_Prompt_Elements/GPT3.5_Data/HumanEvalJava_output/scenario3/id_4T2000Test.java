// MeanAbsoluteDeviation.java
package scenario3;

import java.util.List;

class MeanAbsoluteDeviation {

    /**
     * For a given list of input numbers, calculate Mean Absolute Deviation
     * around the mean of this dataset.
     * Mean Absolute Deviation is the average absolute difference between each
     * element and a centerpoint (mean in this case):
     * MAD = average | x - x_mean |
     *
     * > meanAbsoluteDeviation([1.0, 2.0, 3.0])
     * 0.6666666666666666
     * > meanAbsoluteDeviation([1.0, 2.0, 3.0, 4.0])
     * 1.0
     * > meanAbsoluteDeviation([1.0, 2.0, 3.0, 4.0, 5.0])
     * 1.2
     */
    public static Double meanAbsoluteDeviation(List<Double> numbers) {
        double sum = 0;
        double mean = 0;
        double mad = 0;
        int size = numbers.size();
        for (double num : numbers) {
            sum += num;
        }
        mean = sum / size;
        for (double num : numbers) {
            mad += Math.abs(num - mean);
        }
        return mad / size;
    }
}

// MeanAbsoluteDeviationTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MeanAbsoluteDeviation}.
* It contains ten unit test cases for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
*/
class MeanAbsoluteDeviationTest {
    
    @Test
    void testMeanAbsoluteDeviation() {
        List<Double> numbers1 = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> numbers2 = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        List<Double> numbers3 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        assertEquals(0.6666666666666666, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers1));
        assertEquals(1.0, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers2));
        assertEquals(1.2, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers3));
    }
}