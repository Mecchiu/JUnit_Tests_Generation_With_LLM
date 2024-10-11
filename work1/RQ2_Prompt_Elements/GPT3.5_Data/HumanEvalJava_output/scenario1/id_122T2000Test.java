Here's the source code for the AddElementsTest class:

```
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link AddElements}.
 * It contains ten unit test cases for the {@link AddElements#addElements(List, int)} method.
 */
class AddElementsTest {

    @Test
    void testAddElementsWithEmptyList() {
        List<Integer> arr = new ArrayList<>();
        int k = 0;
        int expectedSum = 0;
        int actualSum = AddElements.addElements(arr, k);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void testAddElementsWithKGreaterThanListSize() {
        List<Integer> arr = Arrays.asList(1, 2, 3);
        int k = 4;
        int expectedSum = 6;
        int actualSum = AddElements.addElements(arr, k);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void testAddElementsWithAllElementsGreaterThan100() {
        List<Integer> arr = Arrays.asList(101, 102, 103);
        int k = 3;
        int expectedSum = 0;
        int actualSum = AddElements.addElements(arr, k);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void testAddElementsWithAllElementsLessThan100() {
        List<Integer> arr = Arrays.asList(1, 2, 3);
        int k = 3;
        int expectedSum = 6;
        int actualSum = AddElements.addElements(arr, k);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void testAddElementsWithSomeElementsGreaterThan100() {
        List<Integer> arr = Arrays.asList(1, 2, 101, 102);
        int k = 4;
        int expectedSum = 3;
        int actualSum = AddElements.addElements(arr, k);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void testAddElementsWithSomeElementsLessThan100() {
        List<Integer> arr = Arrays.asList(1, 2, 101, 102);
        int k = 2;
        int expectedSum = 3;
        int actualSum = AddElements.addElements(arr, k);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void testAddElementsWithOneElementLessThan100() {
        List<Integer> arr = Arrays.asList(99);
        int k = 1;
        int expectedSum = 99;
        int actualSum = AddElements.addElements(arr, k);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void testAddElementsWithOneElementGreaterThan100() {
        List<Integer> arr = Arrays.asList(101);
        int k = 1;
        int expectedSum = 0;
        int actualSum = AddElements.addElements(arr, k);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void testAddElementsWithNullList() {
        List<Integer> arr = null;
        int k = 0;
        assertThrows(NullPointerException.class, () -> AddElements.addElements(arr, k));
    }

    @Test
    void testAddElementsWithNegativeK() {
        List<Integer> arr = Arrays.asList(1, 2, 3);
        int k = -1;
        assertThrows(IllegalArgumentException.class, () -> AddElements.addElements(arr, k));
    }
}
```

This test class contains ten unit test cases for the `addElements` method of the `AddElements` class. The test cases cover different scenarios such as empty list, list with elements greater than 100, list with elements less than 100, null list, and negative k value. The `assertEquals` method is used to compare the expected and actual sum values. The `assertThrows` method is used to test for expected exceptions.