// OrderByPoints.java
package scenario3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class OrderByPoints {

    /**
     * * Write a function which sorts the given list of integers
     * in ascending order according to the sum of their digits.
     * Note: if there are several items with similar sum of their digits,
     * order them based on their index in original list.
     *
     * For example:
     * >>> order_by_points([1, 11, -1, -11, -12]) == [-1, -11, 1, -12, 11]
     * >>> order_by_points([]) == []
     *
     * > orderByPoints([1, 11, -1, -11, -12])
     * [-1, -11, 1, -12, 11]
     * > orderByPoints([1234, 423, 463, 145, 2, 423, 423, 53, 6, 37, 3457, 3, 56, 0, 46])
     * [0, 2, 3, 6, 53, 423, 423, 423, 1234, 145, 37, 46, 56, 463, 3457]
     * > orderByPoints([])
     * []
     * > orderByPoints([1, -11, -32, 43, 54, -98, 2, -3])
     * [-3, -32, -98, -11, 1, 2, 43, 54]
     * > orderByPoints([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11])
     * [1, 10, 2, 11, 3, 4, 5, 6, 7, 8, 9]
     * > orderByPoints([0, 6, 6, -76, -21, 23, 4])
     * [-76, -21, 0, 4, 23, 6, 6]
     */
    public static List<Integer> orderByPoints(List<Integer> nums) {
        Collections.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int sum1 = 0, sum2 = 0;
                int num1 = Math.abs(o1), num2 = Math.abs(o2);
                while (num1 > 0) {
                    sum1 += num1 % 10;
                    num1 /= 10;
                }
                while (num2 > 0) {
                    sum2 += num2 % 10;
                    num2 /= 10;
                }
                if (sum1 == sum2) {
                    return nums.indexOf(o1) - nums.indexOf(o2);
                }
                return sum1 - sum2;
            }
        });
        return nums;
    }
}

// OrderByPointsTest.java
package scenario3;

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
    void testOrderByPoints1() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 11, -1, -11, -12));
        List<Integer> expected = new ArrayList<>(Arrays.asList(-1, -11, 1, -12, 11));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPoints2() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1234, 423, 463, 145, 2, 423, 423, 53, 6, 37, 3457, 3, 56, 0, 46));
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 2, 3, 6, 53, 423, 423, 423, 1234, 145, 37, 46, 56, 463, 3457));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPoints3() {
        List<Integer> nums = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPoints4() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, -11, -32, 43, 54, -98, 2, -3));
        List<Integer> expected = new ArrayList<>(Arrays.asList(-3, -32, -98, -11, 1, 2, 43, 54));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPoints5() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 10, 2, 11, 3, 4, 5, 6, 7, 8, 9));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPoints6() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(0, 6, 6, -76, -21, 23, 4));
        List<Integer> expected = new ArrayList<>(Arrays.asList(-76, -21, 0, 4, 23, 6, 6));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPoints7() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPoints8() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPoints9() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(-1, -2, -3, -4, -5, -6, -7, -8, -9));
        List<Integer> expected = new ArrayList<>(Arrays.asList(-1, -2, -3, -4, -5, -6, -7, -8, -9));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }

    @Test
    void testOrderByPoints10() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90));
        List<Integer> expected = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90));
        assertEquals(expected, OrderByPoints.orderByPoints(nums));
    }
}