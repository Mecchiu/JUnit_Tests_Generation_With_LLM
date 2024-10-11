// LargestSmallestIntegersTest.java
package original;

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
			* Test case for the method {@link LargestSmallestIntegers#largestSmallestIntegers(List)}.
			* It tests the method with an empty list.
			*/
			@Test
			void testLargestSmallestIntegersEmptyList() {
				List<Object> lst = new ArrayList<Object>();
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(null);
				expected.add(null);
				assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
			}

			/**
			* Test case for the method {@link LargestSmallestIntegers#largestSmallestIntegers(List)}.
			* It tests the method with a list containing only one element.
			*/
			@Test
			void testLargestSmallestIntegersOneElement() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(0);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(null);
				expected.add(null);
				assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
			}

			/**
			* Test case for the method {@link LargestSmallestIntegers#largestSmallestIntegers(List)}.
			* It tests the method with a list containing only positive elements.
			*/
			@Test
			void testLargestSmallestIntegersOnlyPositive() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(2);
				lst.add(4);
				lst.add(1);
				lst.add(3);
				lst.add(5);
				lst.add(7);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(null);
				expected.add(1);
				assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
			}

			/**
			* Test case for the method {@link LargestSmallestIntegers#largestSmallestIntegers(List)}.
			* It tests the method with a list containing only negative elements.
			*/
			@Test
			void testLargestSmallestIntegersOnlyNegative() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(-1);
				lst.add(-3);
				lst.add(-5);
				lst.add(-6);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(-1);
				expected.add(null);
				assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
			}

			/**
			* Test case for the method {@link LargestSmallestIntegers#largestSmallestIntegers(List)}.
			* It tests the method with a list containing both positive and negative elements.
			*/
			@Test
			void testLargestSmallestIntegersPositiveAndNegative() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(1);
				lst.add(3);
				lst.add(2);
				lst.add(4);
				lst.add(5);
				lst.add(6);
				lst.add(-2);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(-2);
				expected.add(1);
				assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
			}

			/**
			* Test case for the method {@link LargestSmallestIntegers#largestSmallestIntegers(List)}.
			* It tests the method with a list containing both positive and negative elements.
			*/
			@Test
			void testLargestSmallestIntegersPositiveAndNegative2() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(4);
				lst.add(5);
				lst.add(3);
				lst.add(6);
				lst.add(2);
				lst.add(7);
				lst.add(-7);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(-7);
				expected.add(2);
				assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
			}

			/**
			* Test case for the method {@link LargestSmallestIntegers#largestSmallestIntegers(List)}.
			* It tests the method with a list containing both positive and negative elements.
			*/
			@Test
			void testLargestSmallestIntegersPositiveAndNegative3() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(7);
				lst.add(3);
				lst.add(8);
				lst.add(4);
				lst.add(9);
				lst.add(2);
				lst.add(5);
				lst.add(-9);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(-9);
				expected.add(2);
				assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
			}

			/**
			* Test case for the method {@link LargestSmallestIntegers#largestSmallestIntegers(List)}.
			* It tests the method with a list containing both positive and negative elements.
			*/
			@Test
			void testLargestSmallestIntegersPositiveAndNegative4() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(-1);
				lst.add(-3);
				lst.add(-5);
				lst.add(-6);
				lst.add(0);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(-1);
				expected.add(null);
				assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
			}

			/**
			* Test case for the method {@link LargestSmallestIntegers#largestSmallestIntegers(List)}.
			* It tests the method with a list containing both positive and negative elements.
			*/
			@Test
			void testLargestSmallestIntegersPositiveAndNegative5() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(-6);
				lst.add(-4);
				lst.add(-4);
				lst.add(-3);
				lst.add(1);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(-3);
				expected.add(1);
				assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
			}
}