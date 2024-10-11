// MinsubarraysumTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minsubarraysum}.
* It contains ten unit test cases for the {@link Minsubarraysum#minsubarraysum(List)} method.
*/
class MinsubarraysumTest {
	/**
			* Test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
			* It checks the minimum sum of any non-empty sub-array of nums.
			*/
			@Test
			void testMinSubArraySum() {
				List<Object> nums = List.of(1, 2, 3, 4, 5);
				long result = Minsubarraysum.minsubarraysum(nums);
				assertEquals(1, result);
			}

			/**
			* Test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
			* It checks the minimum sum of any non-empty sub-array of nums.
			*/
			@Test
			void testMinSubArraySum1() {
				List<Object> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				long result = Minsubarraysum.minsubarraysum(nums);
				assertEquals(1, result);
			}

			/**
			* Test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
			* It checks the minimum sum of any non-empty sub-array of nums.
			*/
			@Test
			void testMinSubArraySum2() {
				List<Object> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
				long result = Minsubarraysum.minsubarraysum(nums);
				assertEquals(1, result);
			}

			/**
			* Test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
			* It checks the minimum sum of any non-empty sub-array of nums.
			*/
			@Test
			void testMinSubArraySum3() {
				List<Object> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
				long result = Minsubarraysum.minsubarraysum(nums);
				assertEquals(1, result);
			}

			/**
			* Test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
			* It checks the minimum sum of any non-empty sub-array of nums.
			*/
			@Test
			void testMinSubArraySum4() {
				List<Object> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
				long result = Minsubarraysum.minsubarraysum(nums);
				assertEquals(1, result);
			}

			/**
			* Test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
			* It checks the minimum sum of any non-empty sub-array of nums.
			*/
			@Test
			void testMinSubArraySum5() {
				List<Object> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
				long result = Minsubarraysum.minsubarraysum(nums);
				assertEquals(1, result);
			}

			/**
			* Test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
			* It checks the minimum sum of any non-empty sub-array of nums.
			*/
			@Test
			void testMinSubArraySum6() {
				List<Object> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
				long result = Minsubarraysum.minsubarraysum(nums);
				assertEquals(1, result);
			}

			/**
			* Test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
			* It checks the minimum sum of any non-empty sub-array of nums.
			*/
			@Test
			void testMinSubArraySum7() {
				List<Object> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
				long result = Minsubarraysum.minsubarraysum(nums);
				assertEquals(1, result);
			}

			/**
			* Test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
			* It checks the minimum sum of any non-empty sub-array of nums.
			*/
			@Test
			void testMinSubArraySum8() {
				List<Object> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
				long result = Minsubarraysum.minsubarraysum(nums);
				assertEquals(1, result);
			}

			/**
			* Test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
			* It checks the minimum sum of any non-empty sub-array of nums.
			*/
			@Test
			void testMinSubArraySum9() {
				List<Object> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
				long result = Minsubarraysum.minsubarraysum(nums);
				assertEquals(1, result);
			}

			/**
			* Test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
			* It checks the minimum sum of any non-empty sub-array of nums.
			*/
			@Test
			void testMinSubArraySum10() {
				List<Object> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
				long result = Minsubarraysum.minsubarraysum(nums);
				assertEquals(1, result);
			}
}
