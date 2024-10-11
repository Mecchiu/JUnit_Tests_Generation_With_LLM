// LargestSmallestIntegersTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestSmallestIntegers}.
* It contains ten unit test cases for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
*/
class LargestSmallestIntegersTest {
	/**
			* Test case for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
			* It checks the case when the list is empty.
			*/
			@Test
			void testLargestSmallestIntegersEmptyList() {
				List<Object> lst = new ArrayList<Object>();
				List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
				assertEquals(null, result.get(0));
				assertEquals(null, result.get(1));
			}
			
			/**
			* Test case for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
			* It checks the case when the list contains only positive integers.
			*/
			@Test
			void testLargestSmallestIntegersOnlyPositiveIntegers() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(1);
				lst.add(2);
				lst.add(3);
				lst.add(4);
				lst.add(5);
				List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
				assertEquals(null, result.get(0));
				assertEquals(1, result.get(1));
			}
			
			/**
			* Test case for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
			* It checks the case when the list contains only negative integers.
			*/
			@Test
			void testLargestSmallestIntegersOnlyNegativeIntegers() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(-1);
				lst.add(-2);
				lst.add(-3);
				lst.add(-4);
				lst.add(-5);
				List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
				assertEquals(-1, result.get(0));
				assertEquals(null, result.get(1));
			}
			
			/**
			* Test case for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
			* It checks the case when the list contains both positive and negative integers.
			*/
			@Test
			void testLargestSmallestIntegersPositiveAndNegativeIntegers() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(-1);
				lst.add(2);
				lst.add(-3);
				lst.add(4);
				lst.add(-5);
				List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
				assertEquals(-1, result.get(0));
				assertEquals(2, result.get(1));
			}
			
			/**
			* Test case for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
			* It checks the case when the list contains both positive and negative integers.
			* The list contains only one positive integer.
			*/
			@Test
			void testLargestSmallestIntegersPositiveAndNegativeIntegersOnePositive() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(-1);
				lst.add(-2);
				lst.add(-3);
				lst.add(-4);
				lst.add(5);
				List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
				assertEquals(-1, result.get(0));
				assertEquals(5, result.get(1));
			}
			
			/**
			* Test case for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
			* It checks the case when the list contains both positive and negative integers.
			* The list contains only one negative integer.
			*/
			@Test
			void testLargestSmallestIntegersPositiveAndNegativeIntegersOneNegative() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(-1);
				lst.add(2);
				lst.add(3);
				lst.add(4);
				lst.add(5);
				List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
				assertEquals(-1, result.get(0));
				assertEquals(2, result.get(1));
			}
			
			/**
			* Test case for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
			* It checks the case when the list contains both positive and negative integers.
			* The list contains only one positive and one negative integer.
			*/
			@Test
			void testLargestSmallestIntegersPositiveAndNegativeIntegersOnePositiveOneNegative() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(-1);
				lst.add(2);
				lst.add(3);
				lst.add(4);
				lst.add(-5);
				List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
				assertEquals(-1, result.get(0));
				assertEquals(2, result.get(1));
			}
			
			/**
			* Test case for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
			* It checks the case when the list contains both positive and negative integers.
			* The list contains only one positive and one negative integer.
			*/
			@Test
			void testLargestSmallestIntegersPositiveAndNegativeIntegersOnePositiveOneNegative2() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(-1);
				lst.add(-2);
				lst.add(3);
				lst.add(4);
				lst.add(5);
				List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
				assertEquals(-1, result.get(0));
				assertEquals(3, result.get(1));
			}
			
			/**
			* Test case for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
			* It checks the case when the list contains both positive and negative integers.
			* The list contains only one positive and one negative integer.
			*/
			@Test
			void testLargestSmallestIntegersPositiveAndNegativeIntegersOnePositiveOneNegative3() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(-1);
				lst.add(-2);
				lst.add(-3);
				lst.add(4);
				lst.add(5);
				List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
				assertEquals(-1, result.get(0));
				assertEquals(4, result.get(1));
			}
}
