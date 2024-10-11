// MinsubarraysumTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minsubarraysum}.
* It contains ten unit test cases for the {@link Minsubarraysum#minsubarraysum(List)} method.
*/
class MinsubarraysumTest {

	@Test
	void testMinsubarraysum() {
		assertEquals(1, Minsubarraysum.minsubarraysum(List.of(2, 3, 4, 1, 2, 4)));
		assertEquals(-6, Minsubarraysum.minsubarraysum(List.of(-1, -2, -3)));
		assertEquals(-14, Minsubarraysum.minsubarraysum(List.of(-1, -2, -3, 2, -10)));
		assertEquals(-9999999999999999L, Minsubarraysum.minsubarraysum(List.of(-9999999999999999L)));
		assertEquals(0, Minsubarraysum.minsubarraysum(List.of(0, 10, 20, 1000000)));
		assertEquals(-6, Minsubarraysum.minsubarraysum(List.of(-1, -2, -3, 10, -5)));
		assertEquals(-6, Minsubarraysum.minsubarraysum(List.of(100, -1, -2, -3, 10, -5)));
		assertEquals(3, Minsubarraysum.minsubarraysum(List.of(10, 11, 13, 8, 3, 4)));
		assertEquals(-33, Minsubarraysum.minsubarraysum(List.of(100, -33, 32, -1, 0, -2)));
		assertEquals(-10, Minsubarraysum.minsubarraysum(List.of(-10)));
		assertEquals(7, Minsubarraysum.minsubarraysum(List.of(7)));
		assertEquals(-1, Minsubarraysum.minsubarraysum(List.of(1, -1)));
	}
}

// Minsubarraysum.java
package refactored;

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
    public static long minsubarraysum(List<Object> nums) {
        long s = 0;
        long max_sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            long num = ((Number) nums.get(i)).longValue();
            s -= num;
            if (s < 0) {
                s = 0;
            }
            max_sum = Math.max(s, max_sum);
        }
        if (max_sum == 0) {
            max_sum = -((Number) nums.get(0)).longValue();
            for (int i = 0; i < nums.size(); i++) {
                max_sum = Math.max(-((Number) nums.get(i)).longValue(), max_sum);
            }
        }
        long min_sum = -max_sum;
        return min_sum;
    }
}

// MinsubarraysumTest.java
package refactored;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minsubarraysum}.
* It contains ten unit test cases for the {@link Minsubarraysum#minsubarraysum(List)} method.
*/
class MinsubarraysumTest {
		
	@Test
	void testMinsubarraysum() {
		assertEquals(1, Minsubarraysum.minsubarraysum(List.of(2, 3, 4, 1, 2, 4)));
		assertEquals(-6, Minsubarraysum.minsubarraysum(List.of(-1, -2, -3)));
		assertEquals(-14, Minsubarraysum.minsubarraysum(List.of(-1, -2, -3, 2, -10)));
		assertEquals(-9999999999999999L, Minsubarraysum.minsubarraysum(List.of(-9999999999999999L)));
		assertEquals(0, Minsubarraysum.minsubarraysum(List.of(0, 10, 20, 1000000)));
		assertEquals(-6, Minsubarraysum.minsubarraysum(List.of(-1, -2, -3, 10, -5)));
		assertEquals(-6, Minsubarraysum.minsubarraysum(List.of(100, -1, -2, -3, 10, -5)));
		assertEquals(3, Minsubarraysum.minsubarraysum(List.of(10, 11, 13, 8, 3, 4)));
		assertEquals(-33, Minsubarraysum.minsubarraysum(List.of(100, -33, 32, -1, 0, -2)));
		assertEquals(-10, Minsubarraysum.minsubarraysum(List.of(-10)));
		assertEquals(7, Minsubarraysum.minsubarraysum(List.of(7)));
		assertEquals(-1, Minsubarraysum.minsubarraysum(List.of(1, -1)));
	}
}

// Minsubarraysum.java
package refactored;

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
    public static long minsubarraysum(List<Object> nums) {
        long s = 0;
        long max_sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            long num = ((Number) nums.get(i)).longValue();
            s -= num;
            if (s < 0) {
                s = 0;
            }
            max_sum = Math.max(s, max_sum);
        }
        if (max_sum == 0) {
            max_sum = -((Number) nums.get(0)).longValue();
            for (int i = 0; i < nums.size(); i++) {
                max_sum = Math.max(-((Number) nums.get(i)).longValue(), max_sum);
            }
        }
        long min_sum = -max_sum;
        return min_sum;
    }
}

// MinsubarraysumTest.java
package refactored;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minsubarraysum}.
* It contains ten unit test cases for the {@link Minsubarraysum#minsubarraysum(List)} method.
*/
class MinsubarraysumTest {
		
	@Test
	void testMinsubarraysum() {
		assertEquals(1, Minsubarraysum.minsubarraysum(List.of(2, 3, 4, 1, 2, 4)));
		assertEquals(-6, Minsubarraysum.minsubarraysum(List.of(-1, -2, -3)));
		assertEquals(-14, Minsubarraysum.minsubarraysum(List.of(-1, -2, -3, 2, -10)));
		assertEquals(-9999999999999999L, Minsubarraysum.minsubarraysum(List.of(-9999999999999999L)));
		assertEquals(0, Minsubarraysum.minsubarraysum(List.of(0, 10, 20, 1000000)));
		assertEquals(-6, Minsubarraysum.minsubarraysum(List.of(-1, -2, -3, 10, -5)));
		assertEquals(-6, Minsubarraysum.minsubarraysum(List.of(100, -1, -2, -3, 10, -5)));
		assertEquals(3, Minsubarraysum.minsubarraysum(List.of(10, 11, 13, 8, 3, 4)));
		assertEquals(-33, Minsubarraysum.minsubarraysum(List.of(100, -33, 32, -1, 0, -2)));
		assertEquals(-10, Minsubarraysum.minsubarraysum(List.of(-10)));
		assertEquals(7, Minsubarraysum.minsubarraysum(List.of(7)));
		assertEquals(-1, Minsubarraysum.minsubarraysum(List.of(1, -1)));
	}
}

// Minsubarraysum.java
package refactored;

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
    public static long minsubarraysum(List<Object> nums) {
        long s = 0;
        long max_sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            long num = ((Number) nums.get(i)).longValue();
            s -= num;
            if (s < 0) {
                s = 0;
            }
            max_sum = Math.max(s, max_sum);
        }
        if (max_sum == 0) {
            max_sum = -((Number) nums.get(0)).longValue();
            for (int i = 0; i < nums.size(); i++) {
                max_sum = Math.max(-((Number) nums.get(i)).longValue(), max_sum);
            }
        }
        long min_sum = -max_sum;
        return min_sum;
    }
}

// MinsubarraysumTest.java
package refactored;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minsubarraysum}.
* It contains ten unit test cases for the {@link Minsubarraysum#minsubarraysum(List)} method.
*/
class MinsubarraysumTest {
		
	@Test
	void testMinsubarraysum() {
		assertEquals(1, Minsubarraysum.minsubarraysum(List.of(2, 3, 4, 1, 2, 4)));
		assertEquals(-6, Minsubarraysum.minsubarraysum(List.of(-1, -2, -3)));
		assertEquals(-14, Minsubarraysum.minsubarraysum(List.of(-1, -2, -3, 2, -10)));
		assertEquals(-9999999999999999L, Minsubarraysum.minsubarraysum(List.of(-9999999999999999L)));
		assertEquals(0, Minsubarraysum.minsubarraysum(List.of(0, 10, 20, 1000000)));
		assertEquals(-6, Minsubarraysum.minsubarraysum(List.of(-1, -2, -3, 10, -5)));
		assertEquals(-6, Minsubarraysum.minsubarraysum(List.of(100, -1, -2, -3, 10, -5)));
		assertEquals(3, Minsubarraysum.minsubarraysum(List.of(10, 11, 13, 8, 3,