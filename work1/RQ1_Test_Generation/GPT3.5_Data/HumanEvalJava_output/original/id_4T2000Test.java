```java
package original;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MeanAbsoluteDeviationTest {

    @Test
    void testMeanAbsoluteDeviation_ThreeElements() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0);
        assertEquals(0.6666666666666666, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }

    @Test
    void testMeanAbsoluteDeviation_FourElements() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        assertEquals(1.0, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }

    @Test
    void testMeanAbsoluteDeviation_FiveElements() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        assertEquals(1.2, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }

    // Add more test cases as needed
}
```
```java
package original;

import java.util.List;

class MeanAbsoluteDeviation {

    public static Double meanAbsoluteDeviation(List<Double> numbers) {
        Double mean = 0.0;
        for (Double number : numbers) {
            mean += number;
        }
        mean /= numbers.size();
        Double mad = 0.0;
        for (Double number : numbers) {
            mad += Math.abs(number - mean);
        }
        return mad / numbers.size();
    }
}
```