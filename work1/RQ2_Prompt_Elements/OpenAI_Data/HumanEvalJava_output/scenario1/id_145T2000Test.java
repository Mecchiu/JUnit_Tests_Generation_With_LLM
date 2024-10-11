// OrderByPointsTest.java
package scenario1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OrderByPoints}.
* It contains ten unit test cases for the {@link OrderByPoints#orderByPoints(List)} method.
*/
class OrderByPointsTest {
	// Test case 1: Test the method with an empty list.
    @Test
    void testOrderByPointsEmptyList() {
        List<Object> nums = Collections.emptyList();
        List<Object> result = OrderByPoints.orderByPoints(nums);
        assertEquals(nums, result);
    }

    // Test case 2: Test the method with a list of one element.
    @Test
    void testOrderByPointsOneElementList() {
        List<Object> nums = Collections.singletonList(1);
        List<Object> result = OrderByPoints.orderByPoints(nums);
        assertEquals(nums, result);
    }

    // Test case 3: Test the method with a list of two elements.
    @Test
    void testOrderByPointsTwoElementsList() {
        List<Object> nums = List.of(1, 2);
        List<Object> result = OrderByPoints.orderByPoints(nums);
        assertEquals(nums, result);
    }

    // Test case 4: Test the method with a list of three elements.
    @Test
    void testOrderByPointsThreeElementsList() {
        List<Object> nums = List.of(1, 2, 3);
        List<Object> result = OrderByPoints.orderByPoints(nums);
        assertEquals(nums, result);
    }

    // Test case 5: Test the method with a list of four elements.
    @Test
    void testOrderByPointsFourElementsList() {
        List<Object> nums = List.of(1, 2, 3, 4);
        List<Object> result = OrderByPoints.orderByPoints(nums);
        assertEquals(nums, result);
    }

    // Test case 6: Test the method with a list of five elements.
    @Test
    void testOrderByPointsFiveElementsList() {
        List<Object> nums = List.of(1, 2, 3, 4, 5);
        List<Object> result = OrderByPoints.orderByPoints(nums);
        assertEquals(nums, result);
    }

    // Test case 7: Test the method with a list of six elements.
    @Test
    void testOrderByPointsSixElementsList() {
        List<Object> nums = List.of(1, 2, 3, 4, 5, 6);
        List<Object> result = OrderByPoints.orderByPoints(nums);
        assertEquals(nums, result);
    }

    // Test case 8: Test the method with a list of seven elements.
    @Test
    void testOrderByPointsSevenElementsList() {
        List<Object> nums = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Object> result = OrderByPoints.orderByPoints(nums);
        assertEquals(nums, result);
    }

    // Test case 9: Test the method with a list of eight elements.
    @Test
    void testOrderByPointsEightElementsList() {
        List<Object> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Object> result = OrderByPoints.orderByPoints(nums);
        assertEquals(nums, result);
    }

    // Test case 10: Test the method with a list of nine elements.
    @Test
    void testOrderByPointsNineElementsList() {
        List<Object> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Object> result = OrderByPoints.orderByPoints(nums);
        assertEquals(nums, result);
    }
}
