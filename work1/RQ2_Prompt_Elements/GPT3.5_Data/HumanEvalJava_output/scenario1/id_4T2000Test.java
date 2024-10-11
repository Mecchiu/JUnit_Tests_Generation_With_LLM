Here's the code for the MeanAbsoluteDeviationTest class:

```
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MeanAbsoluteDeviationTest {

    @Test
    void testEmptyList() {
        List<Double> numbers = Arrays.asList();
        Double expected = null;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testSingleNumber() {
        List<Double> numbers = Arrays.asList(5.0);
        Double expected = 0.0;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testTwoNumbers() {
        List<Double> numbers = Arrays.asList(5.0, 10.0);
        Double expected = 2.5;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testThreeNumbers() {
        List<Double> numbers = Arrays.asList(5.0, 10.0, 15.0);
        Double expected = 3.3333333333333335;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testNegativeNumbers() {
        List<Double> numbers = Arrays.asList(-5.0, -10.0, -15.0);
        Double expected = 3.3333333333333335;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testMixedNumbers() {
        List<Double> numbers = Arrays.asList(-5.0, 10.0, -15.0);
        Double expected = 8.333333333333334;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testRepeatedNumbers() {
        List<Double> numbers = Arrays.asList(5.0, 5.0, 5.0);
        Double expected = 0.0;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testDecimalNumbers() {
        List<Double> numbers = Arrays.asList(1.5, 2.5, 3.5);
        Double expected = 0.6666666666666666;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testLargeNumbers() {
        List<Double> numbers = Arrays.asList(1000000000.0, 2000000000.0, 3000000000.0);
        Double expected = 666666666.6666666;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testNullList() {
        List<Double> numbers = null;
        assertThrows(NullPointerException.class, () -> {
            MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        });
    }

    @Test
    void testPerformance() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
        long startTime = System.nanoTime();
        MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        assertTrue(duration < 1000000);
    }
}
```

This class contains ten unit test cases for the `meanAbsoluteDeviation` method of the `MeanAbsoluteDeviation` class. The test cases cover different scenarios, such as empty lists, single numbers, negative numbers, decimal numbers, repeated numbers, and large numbers. The last test case checks the performance of the method by measuring the time it takes to execute with a list of ten numbers.