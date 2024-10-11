// OrderByPointsTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link OrderByPoints}.
 * It contains ten unit test cases for the {@link OrderByPoints#orderByPoints(List)} method.
 */
class OrderByPointsTest {

    @Test
    void testOrderByPoints() {
        List<Object> nums = new ArrayList<>(Arrays.asList(12, 34, 56, 78, 90));
        List<Object> expected = new ArrayList<>(Arrays.asList(90, 12, 34, 56, 78));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPointsWithNegativeNumbers() {
        List<Object> nums = new ArrayList<>(Arrays.asList(-12, 34, -56, 78, -90));
        List<Object> expected = new ArrayList<>(Arrays.asList(-90, -56, -12, 34, 78));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPointsWithZero() {
        List<Object> nums = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        List<Object> expected = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPointsWithSingleNumber() {
        List<Object> nums = new ArrayList<>(Arrays.asList(123));
        List<Object> expected = new ArrayList<>(Arrays.asList(123));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPointsWithRepeatedNumbers() {
        List<Object> nums = new ArrayList<>(Arrays.asList(12, 34, 56, 78, 90, 12, 34, 56, 78, 90));
        List<Object> expected = new ArrayList<>(Arrays.asList(90, 90, 12, 12, 34, 34, 56, 56, 78, 78));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPointsWithLargeNumbers() {
        List<Object> nums = new ArrayList<>(Arrays.asList(123456789, 987654321, 111111111, 999999999));
        List<Object> expected = new ArrayList<>(Arrays.asList(111111111, 123456789, 987654321, 999999999));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPointsWithMixedNumbers() {
        List<Object> nums = new ArrayList<>(Arrays.asList(-12, 34, 0, 56, -78, 90));
        List<Object> expected = new ArrayList<>(Arrays.asList(-78, -12, 0, 34, 56, 90));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPointsWithEmptyList() {
        List<Object> nums = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPointsWithNullList() {
        List<Object> nums = null;
        assertThrows(NullPointerException.class, () -> OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPointsWithNonIntegerList() {
        List<Object> nums = new ArrayList<>(Arrays.asList("a", "b", "c"));
        assertThrows(ClassCastException.class, () -> OrderByPoints.orderByPoints(nums));
    }
}