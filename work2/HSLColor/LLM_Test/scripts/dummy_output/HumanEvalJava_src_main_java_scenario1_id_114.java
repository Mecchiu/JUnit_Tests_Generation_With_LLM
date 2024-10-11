// MinsubarraysumTest.java
package scenario1;

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
			* It checks the method with a list of positive numbers.
			*/
			@Test
			void testPositiveNumbers() {
				List<Object> nums = List.of(1, 2, 3, 4, 5);
				long result = Minsubarraysum.minsubarraysum(nums);
				assertEquals(-15, result);
			}

			/**
			* Test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
			* It checks the method with a list of negative numbers.
			*/
			@Test
			void testNegativeNumbers() {
				List<Object> nums = List.of(-1, -2, -3, -4, -5);
				long result = Minsubarraysum.minsubarraysum(nums);
				assertEquals(15, result);
			}

			/**
			* Test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
			* It checks the method with a list of mixed numbers.
			*/
			@Test
			void testMixedNumbers() {
				List<Object> nums = List.of(-1, 2, -3, 4, -5);
				long result = Minsubarraysum.minsubarraysum(nums);
				assertEquals(1, result);
			}

			/**
			* Test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
			* It checks the method with a list of one number.
			*/
			@Test
			void testOneNumber() {
				List<Object> nums = List.of(1);
				long result = Minsubarraysum.minsubarraysum(nums);
				assertEquals(-1, result);
			}

			/**
			* Test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
			* It checks the method with an empty list.
			*/
			@Test
			void testEmptyList() {
				List<Object> nums = List.of();
				long result = Minsubarraysum.minsubarraysum(nums);
				assertEquals(0, result);
			}

			/**
			* Test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
			* It checks the method with a list of null values.
			*/
			@Test
			void testNullValues() {
				List<Object> nums = List.of(null, null, null, null, null);
				long result = Minsubarraysum.minsubarraysum(nums);
				assertEquals(0, result);
			}

			/**
			* Test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
			* It checks the method with a list of one null value.
			*/
			@Test
			void testOneNullValue() {
				List<Object> nums = List.of(null);
				long result = Minsubarraysum.minsubarraysum(nums);
				assertEquals(0, result);
			}

			/**
			* Test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
			* It checks the method with a list of one null value and one number.
			*/
			@Test
			void testOneNullValueAndOneNumber() {
				List<Object> nums = List.of(null, 1);
				long result = Minsubarraysum.minsubarraysum(nums);
				assertEquals(-1, result);
			}

			/**
			* Test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
			* It checks the method with a list of one null value and one negative number.
			*/
			@Test
			void testOneNullValueAndOneNegativeNumber() {
				List<Object> nums = List.of(null, -1);
				long result = Minsubarraysum.minsubarraysum(nums);
				assertEquals(1, result);
			}

			/**
			* Test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
			* It checks the method with a list of one null value and one positive number.
			*/
			@Test
			void testOneNullValueAndOnePositiveNumber() {
				List<Object> nums = List.of(null, 1);
				long result = Minsubarraysum.minsubarraysum(nums);
				assertEquals(-1, result);
			}
}