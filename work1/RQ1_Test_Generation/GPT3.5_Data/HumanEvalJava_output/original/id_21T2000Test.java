```java
// RescaleToUnit.java
package original;

import java.util.ArrayList;
import java.util.List;

class RescaleToUnit {

    /**
     * Given list of numbers (of at least two elements), apply a linear transform to that list,
     * such that the smallest number will become 0 and the largest will become 1
     *
     * > rescaleToUnit([1.0, 2.0, 3.0, 4.0, 5.0])
     * [0.0, 0.25, 0.5, 0.75, 1.0]
     * > rescaleToUnit([2.0, 49.9])
     * [0.0, 1.0]
     * > rescaleToUnit([100.0, 49.9])
     * [1.0, 0.0]
     * > rescaleToUnit([1.0, 2.0, 3.0, 4.0, 5.0])
     * [0.0, 0.25, 0.5, 0.75, 1.0]
     * > rescaleToUnit([2.0, 1.0, 5.0, 3.0, 4.0])
     * [0.25, 0.0, 1.0, 0.5, 0.75]
     * > rescaleToUnit([12.0, 11.0, 15.0, 13.0, 14.0])
     * [0.25, 0.0, 1.0, 0.5, 0.75]
     */
    public static List<Double> rescaleToUnit(List<Double> numbers) {
        List<Double> result = new ArrayList<Double>();
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            result.add((numbers.get(i) - min) / (max - min));
        }
        return result;
    }
}

// RescaleToUnitTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RescaleToUnit}.
* It contains ten unit test cases for the {@link RescaleToUnit#rescaleToUnit(List)} method.
*/
class RescaleToUnitTest {

    @Test
    void testRescaleToUnit() {
        List<Double> input1 = new ArrayList<>(List.of(1.0, 2.0, 3.0, 4.0, 5.0));
        List<Double> expected1 = new ArrayList<>(List.of(0.0, 0.25, 0.5, 0.75, 1.0));
        assertEquals(expected1, RescaleToUnit.rescaleToUnit(input1));

        List<Double> input2 = new ArrayList<>(List.of(2.0, 49.9));
        List<Double> expected2 = new ArrayList<>(List.of(0.0, 1.0));
        assertEquals(expected2, RescaleToUnit.rescaleToUnit(input2));

        List<Double> input3 = new ArrayList<>(List.of(100.0, 49.9));
        List<Double> expected3 = new ArrayList<>(List.of(1.0, 0.0));
        assertEquals(expected3, RescaleToUnit.rescaleToUnit(input3));

        List<Double> input4 = new ArrayList<>(List.of(1.0, 2.0, 3.0, 4.0, 5.0));
        List<Double> expected4 = new ArrayList<>(List.of(0.0, 0.25, 0.5, 0.75, 1.0));
        assertEquals(expected4, RescaleToUnit.rescaleToUnit(input4));

        List<Double> input5 = new ArrayList<>(List.of(2.0, 1.0, 5.0, 3.0, 4.0));
        List<Double> expected5 = new ArrayList<>(List.of(0.25, 0.0, 1.0, 0.5, 0.75));
        assertEquals(expected5, RescaleToUnit.rescaleToUnit(input5));

        List<Double> input6 = new ArrayList<>(List.of(12.0, 11.0, 15.0, 13.0, 14.0));
        List<Double> expected6 = new ArrayList<>(List.of(0.25, 0.0, 1.0, 0.5, 0.75));
        assertEquals(expected6, RescaleToUnit.rescaleToUnit(input6));
    }
}
```
