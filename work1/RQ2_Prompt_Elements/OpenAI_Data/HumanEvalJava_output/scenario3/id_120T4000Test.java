// Maximum1Test.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Maximum1}.
* It contains ten unit test cases for the {@link Maximum1#maximum(List, int)} method.
*/
class Maximum1Test {

	@Test
	void testMaximum1() {
		List<Integer> arr = List.of(-3, -4, 5);
		List<Integer> expected = List.of(-4, -3, 5);
		List<Integer> actual = Maximum1.maximum(arr, 3);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum2() {
		List<Integer> arr = List.of(4, -4, 4);
		List<Integer> expected = List.of(4, 4);
		List<Integer> actual = Maximum1.maximum(arr, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum3() {
		List<Integer> arr = List.of(-3, 2, 1, 2, -1, -2, 1);
		List<Integer> expected = List.of(2);
		List<Integer> actual = Maximum1.maximum(arr, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum4() {
		List<Integer> arr = List.of(123, -123, 20, 0, 1, 2, -3);
		List<Integer> expected = List.of(2, 20, 123);
		List<Integer> actual = Maximum1.maximum(arr, 3);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum5() {
		List<Integer> arr = List.of(-123, 20, 0, 1, 2, -3);
		List<Integer> expected = List.of(0, 1, 2, 20);
		List<Integer> actual = Maximum1.maximum(arr, 4);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum6() {
		List<Integer> arr = List.of(5, 15, 0, 3, -13, -8, 0);
		List<Integer> expected = List.of(-13, -8, 0, 0, 3, 5, 15);
		List<Integer> actual = Maximum1.maximum(arr, 7);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum7() {
		List<Integer> arr = List.of(-1, 0, 2, 5, 3, -10);
		List<Integer> expected = List.of(3, 5);
		List<Integer> actual = Maximum1.maximum(arr, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum8() {
		List<Integer> arr = List.of(1, 0, 5, -7);
		List<Integer> expected = List.of(5);
		List<Integer> actual = Maximum1.maximum(arr, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum9() {
		List<Integer> arr = List.of(4, -4);
		List<Integer> expected = List.of(-4, 4);
		List<Integer> actual = Maximum1.maximum(arr, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum10() {
		List<Integer> arr = List.of(-10, 10);
		List<Integer> expected = List.of(-10, 10);
		List<Integer> actual = Maximum1.maximum(arr, 2);
		assertEquals(expected, actual);
	}
}

// Maximum2.java
package scenario3;

import java.util.List;

class Maximum2 {

    /**
     * * Given an array arr of integers and a positive integer k, return a sorted list
     * of length k with the maximum k numbers in arr.
     *
     * Example 1:
     *
     * Input: arr = [-3, -4, 5], k = 3
     * Output: [-4, -3, 5]
     *
     * Example 2:
     *
     * Input: arr = [4, -4, 4], k = 2
     * Output: [4, 4]
     *
     * Example 3:
     *
     * Input: arr = [-3, 2, 1, 2, -1, -2, 1], k = 1
     * Output: [2]
     *
     * Note:
     * 1. The length of the array will be in the range of [1, 1000].
     * 2. The elements in the array will be in the range of [-1000, 1000].
     * 3. 0 <= k <= len(arr)
     *
     * > maximum([-3, -4, 5], 3)
     * [-4, -3, 5]
     * > maximum([4, -4, 4], 2)
     * [4, 4]
     * > maximum([-3, 2, 1, 2, -1, -2, 1], 1)
     * [2]
     * > maximum([123, -123, 20, 0, 1, 2, -3], 3)
     * [2, 20, 123]
     * > maximum([-123, 20, 0, 1, 2, -3], 4)
     * [0, 1, 2, 20]
     * > maximum([5, 15, 0, 3, -13, -8, 0], 7)
     * [-13, -8, 0, 0, 3, 5, 15]
     * > maximum([-1, 0, 2, 5, 3, -10], 2)
     * [3, 5]
     * > maximum([1, 0, 5, -7], 1)
     * [5]
     * > maximum([4, -4], 2)
     * [-4, 4]
     * > maximum([-10, 10], 2)
     * [-10, 10]
     * > maximum([1, 2, 3, -23, 243, -400, 0], 0)
     * []
     */
    public static List<Object> maximum(List<Integer> arr, int k) {
    }
}

// Maximum2Test.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Maximum2}.
* It contains ten unit test cases for the {@link Maximum2#maximum(List, int)} method.
*/
class Maximum2Test {
		
	@Test
	void testMaximum1() {
		List<Integer> arr = List.of(-3, -4, 5);
		List<Integer> expected = List.of(-4, -3, 5);
		List<Integer> actual = Maximum2.maximum(arr, 3);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum2() {
		List<Integer> arr = List.of(4, -4, 4);
		List<Integer> expected = List.of(4, 4);
		List<Integer> actual = Maximum2.maximum(arr, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum3() {
		List<Integer> arr = List.of(-3, 2, 1, 2, -1, -2, 1);
		List<Integer> expected = List.of(2);
		List<Integer> actual = Maximum2.maximum(arr, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum4() {
		List<Integer> arr = List.of(123, -123, 20, 0, 1, 2, -3);
		List<Integer> expected = List.of(2, 20, 123);
		List<Integer> actual = Maximum2.maximum(arr, 3);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum5() {
		List<Integer> arr = List.of(-123, 20, 0, 1, 2, -3);
		List<Integer> expected = List.of(0, 1, 2, 20);
		List<Integer> actual = Maximum2.maximum(arr, 4);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum6() {
		List<Integer> arr = List.of(5, 15, 0, 3, -13, -8, 0);
		List<Integer> expected = List.of(-13, -8, 0, 0, 3, 5, 15);
		List<Integer> actual = Maximum2.maximum(arr, 7);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum7() {
		List<Integer> arr = List.of(-1, 0, 2, 5, 3, -10);
		List<Integer> expected = List.of(3, 5);
		List<Integer> actual = Maximum2.maximum(arr, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum8() {
		List<Integer> arr = List.of(1, 0, 5, -7);
		List<Integer> expected = List.of(5);
		List<Integer> actual = Maximum2.maximum(arr, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum9() {
		List<Integer> arr = List.of(4, -4);
		List<Integer> expected = List.of(-4, 4);
		List<Integer> actual = Maximum2.maximum(arr, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum10() {
		List<Integer> arr = List.of(-10, 10);
		List<Integer> expected = List.of(-10, 10);
		List<Integer> actual = Maximum2.maximum(arr, 2);
		assertEquals(expected, actual);
	}
}

// Maximum3.java
package scenario3;

import java.util.List;

class Maximum3 {

    /**
     * * Given an array arr of integers and a positive integer k, return a sorted list
     * of length k with the maximum k numbers in arr.
     *
     * Example 1:
     *
     * Input: arr = [-3, -4, 5], k = 3
     * Output: [-4, -3, 5]
     *
     * Example 2:
     *
     * Input: arr = [4, -4, 4], k = 2
     * Output: [4, 4]
     *
     * Example 3:
     *
     * Input: arr = [-3, 2, 1, 2, -1, -2, 1], k = 1
     * Output: [2]
     *
     * Note:
     * 1. The length of the array will be in the range of [1, 1000].
     * 2. The elements in the array will be in the range of [-1000, 1000].
     * 3. 0 <= k <= len(arr)
     *
     * > maximum([-3, -4, 5], 3)
     * [-4, -3, 5]
     * > maximum([4, -4, 4], 2)
     * [4, 4]
     * > maximum([-3, 2, 1, 2, -1, -2, 1], 1)
     * [2]
     * > maximum([123, -123, 20, 0, 1, 2, -3], 3)
     * [2, 20, 123]
     * > maximum([-123, 20, 0, 1, 2, -3], 4)
     * [0, 1, 2, 20]
     * > maximum([5, 15, 0, 3, -13, -8, 0], 7)
     * [-13, -8, 0, 0, 3, 5, 15]
     * > maximum([-1, 0, 2, 5, 3, -10], 2)
     * [3, 5]
     * > maximum([1, 0, 5, -7], 1)
     * [5]
     * > maximum([4, -4], 2)
     * [-4, 4]
     * > maximum([-10, 10], 2)
     * [-10, 10]
     * > maximum([1, 2, 3, -23, 243, -400, 0], 0)
     * []
     */
    public static List<Object> maximum(List<Integer> arr, int k) {
    }
}

// Maximum3Test.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Maximum3}.
* It contains ten unit test cases for the {@link Maximum3#maximum(List, int)} method.
*/
class Maximum3Test {
		
	@Test
	void testMaximum1() {
		List<Integer> arr = List.of(-3, -4, 5);
		List<Integer> expected = List.of(-4, -3, 5);
		List<Integer> actual = Maximum3.maximum(arr, 3);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum2() {
		List<Integer> arr = List.of(4, -4, 4);
		List<Integer> expected = List.of(4, 4);
		List<Integer> actual = Maximum3.maximum(arr, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum3() {
		List<Integer> arr = List.of(-3, 2, 1, 2, -1, -2, 1);
		List<Integer> expected = List.of(2);
		List<Integer> actual = Maximum3.maximum(arr, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum4() {
		List<Integer> arr = List.of(123, -123, 20, 0, 1, 2, -3);
		List<Integer> expected = List.of(2, 20, 123);
		List<Integer> actual = Maximum3.maximum(arr, 3);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum5() {
		List<Integer> arr = List.of(-123, 20, 0, 1, 2, -3);
		List<Integer> expected = List.of(0, 1, 2, 20);
		List<Integer> actual = Maximum3.maximum(arr, 4);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum6() {
		List<Integer> arr = List.of(5, 15, 0, 3, -13, -8, 0);
		List<Integer> expected = List.of(-13, -8, 0, 0, 3, 5, 15);
		List<Integer> actual = Maximum3.maximum(arr, 7);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum7() {
		List<Integer> arr = List.of(-1, 0, 2, 5, 3, -10);
		List<Integer> expected = List.of(3, 5);
		List<Integer> actual = Maximum3.maximum(arr, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum8() {
		List<Integer> arr = List.of(1, 0, 5, -7);
		List<Integer> expected = List.of(5);
		List<Integer> actual = Maximum3.maximum(arr, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum9() {
		List<Integer> arr = List.of(4, -4);
		List<Integer> expected = List.of(-4, 4);
		List<Integer> actual = Maximum3.maximum(arr, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum10() {
		List<Integer> arr = List