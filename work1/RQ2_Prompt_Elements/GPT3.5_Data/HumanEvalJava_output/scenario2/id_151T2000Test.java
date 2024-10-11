// DoubleTheDifferenceTest.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DoubleTheDifference}.
* It contains ten unit test cases for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
*/
class DoubleTheDifferenceTest {

    @Test
    void testEmptyList() {
        List<Object> lst = Arrays.asList();
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }

    @Test
    void testOnlyNegativeNumbers() {
        List<Object> lst = Arrays.asList(-1, -3, -5);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }

    @Test
    void testOnlyEvenNumbers() {
        List<Object> lst = Arrays.asList(2, 4, 6);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }

    @Test
    void testOnlyOddNumbers() {
        List<Object> lst = Arrays.asList(1, 3, 5);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(35, result);
    }

    @Test
    void testMixedNumbers() {
        List<Object> lst = Arrays.asList(1, -2, 3.5, 4, 5, -6, 7);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(75, result);
    }

    @Test
    void testZero() {
        List<Object> lst = Arrays.asList(0);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }

    @Test
    void testLargeNumbers() {
        List<Object> lst = Arrays.asList(1000000000, 2000000000, 3000000000);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }

    @Test
    void testMaxIntegerValue() {
        List<Object> lst = Arrays.asList(Integer.MAX_VALUE);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }

    @Test
    void testMinIntegerValue() {
        List<Object> lst = Arrays.asList(Integer.MIN_VALUE);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }

    @Test
    void testMixedTypes() {
        List<Object> lst = Arrays.asList(1, "two", 3.5, true, 5);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(26, result);
    }
}