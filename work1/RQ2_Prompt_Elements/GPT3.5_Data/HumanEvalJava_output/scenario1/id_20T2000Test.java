Here's the code for the test class:

```
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindClosestElements}.
* It contains ten unit test cases for the {@link FindClosestElements#findClosestElements(List)} method.
*/
class FindClosestElementsTest {

    @Test
    void testEmptyList() {
        List<Double> numbers = new ArrayList<>();
        List<Double> expected = new ArrayList<>();
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testSingleElementList() {
        List<Double> numbers = Arrays.asList(1.0);
        List<Double> expected = new ArrayList<>();
        expected.add(1.0);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testTwoElementList() {
        List<Double> numbers = Arrays.asList(1.0, 2.0);
        List<Double> expected = new ArrayList<>();
        expected.add(1.0);
        expected.add(2.0);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testThreeElementList() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> expected = new ArrayList<>();
        expected.add(2.0);
        expected.add(3.0);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testFourElementList() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        List<Double> expected = new ArrayList<>();
        expected.add(3.0);
        expected.add(4.0);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testFiveElementList() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> expected = new ArrayList<>();
        expected.add(4.0);
        expected.add(5.0);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testNegativeNumbers() {
        List<Double> numbers = Arrays.asList(-5.0, -3.0, -1.0, 1.0, 3.0, 5.0);
        List<Double> expected = new ArrayList<>();
        expected.add(-1.0);
        expected.add(1.0);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testMixedNumbers() {
        List<Double> numbers = Arrays.asList(-5.0, -3.0, 1.0, 3.0, 5.0);
        List<Double> expected = new ArrayList<>();
        expected.add(1.0);
        expected.add(3.0);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testDuplicateNumbers() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 2.0, 3.0, 4.0, 4.0);
        List<Double> expected = new ArrayList<>();
        expected.add(2.0);
        expected.add(2.0);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testLargeList() {
        List<Double> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add((double) i);
        }
        List<Double> expected = new ArrayList<>();
        expected.add(999.0);
        expected.add(1000.0);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testLargeNegativeList() {
        List<Double> numbers = new ArrayList<>();
        for (int i = -1000; i < 0; i++) {
            numbers.add((double) i);
        }
        List<Double> expected = new ArrayList<>();
        expected.add(-2.0);
        expected.add(-1.0);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }
}
```