// Minsubarraysum.java
package scenario3;

import java.util.List;

class Minsubarraysum {

    /**
     * * Given an array of integers nums, find the minimum sum of any non-empty sub-array
     * of nums.
     * Example
     * minSubArraySum([2, 3, 4, 1, 2, 4]) == 1
     * minSubArraySum([-1, -2, -3]) == -6
     *
     * > minsubarraysum([2, 3, 4, 1, 2, 4])
     * 1
     * > minsubarraysum([-1, -2, -3])
     * -6
     * > minsubarraysum([-1, -2, -3, 2, -10])
     * -14
     * > minsubarraysum([-9999999999999999L])
     * -9999999999999999L
     * > minsubarraysum([0, 10, 20, 1000000])
     * 0
     * > minsubarraysum([-1, -2, -3, 10, -5])
     * -6
     * > minsubarraysum([100, -1, -2, -3, 10, -5])
     * -6
     * > minsubarraysum([10, 11, 13, 8, 3, 4])
     * 3
     * > minsubarraysum([100, -33, 32, -1, 0, -2])
     * -33
     * > minsubarraysum([-10])
     * -10
     * > minsubarraysum([7])
     * 7
     * > minsubarraysum([1, -1])
     * -1
     */
    public static long minsubarraysum(List<Integer> nums) {
        long minSum = nums.get(0);
        long currentSum = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            currentSum = Math.min(nums.get(i), currentSum + nums.get(i));
            minSum = Math.min(minSum, currentSum);
        }
        return minSum;
    }
}

// MinsubarraysumTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minsubarraysum}.
* It contains ten unit test cases for the {@link Minsubarraysum#minsubarraysum(List)} method.
*/
class MinsubarraysumTest {

    @Test
    void testMinSubArraySum1() {
        List<Integer> nums = Arrays.asList(2, 3, 4, 1, 2, 4);
        long expected = 1;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testMinSubArraySum2() {
        List<Integer> nums = Arrays.asList(-1, -2, -3);
        long expected = -6;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testMinSubArraySum3() {
        List<Integer> nums = Arrays.asList(-1, -2, -3, 2, -10);
        long expected = -14;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testMinSubArraySum4() {
        List<Integer> nums = Arrays.asList(-999999999);
        long expected = -999999999;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testMinSubArraySum5() {
        List<Integer> nums = Arrays.asList(0, 10, 20, 1000000);
        long expected = 0;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testMinSubArraySum6() {
        List<Integer> nums = Arrays.asList(-1, -2, -3, 10, -5);
        long expected = -6;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testMinSubArraySum7() {
        List<Integer> nums = Arrays.asList(100, -1, -2, -3, 10, -5);
        long expected = -6;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testMinSubArraySum8() {
        List<Integer> nums = Arrays.asList(10, 11, 13, 8, 3, 4);
        long expected = 3;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testMinSubArraySum9() {
        List<Integer> nums = Arrays.asList(100, -33, 32, -1, 0, -2);
        long expected = -33;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testMinSubArraySum10() {
        List<Integer> nums = Arrays.asList(-10);
        long expected = -10;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testMinSubArraySum11() {
        List<Integer> nums = Arrays.asList(7);
        long expected = 7;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testMinSubArraySum12() {
        List<Integer> nums = Arrays.asList(1, -1);
        long expected = -1;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }
}