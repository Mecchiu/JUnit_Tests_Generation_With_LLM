// CommonTest.java
package original;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains ten unit test cases for the {@link Common#common(List, List)} method.
*/
class CommonTest {
			/**
			* Test case for two lists with no common elements.
			*/
			@Test
			void testNoCommonElements() {
				List<Integer> l1 = Arrays.asList(1, 2, 3);
				List<Object> l2 = Arrays.asList(4, 5, 6);
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
			}

			/**
			* Test case for two lists with one common element.
			*/
			@Test
			void testOneCommonElement() {
				List<Integer> l1 = Arrays.asList(1, 2, 3);
				List<Object> l2 = Arrays.asList(3, 4, 5);
				List<Object> expected = Arrays.asList(3);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
			}

			/**
			* Test case for two lists with two common elements.
			*/
			@Test
			void testTwoCommonElements() {
				List<Integer> l1 = Arrays.asList(1, 2, 3);
				List<Object> l2 = Arrays.asList(2, 3, 4);
				List<Object> expected = Arrays.asList(2, 3);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
			}

			/**
			* Test case for two lists with three common elements.
			*/
			@Test
			void testThreeCommonElements() {
				List<Integer> l1 = Arrays.asList(1, 2, 3);
				List<Object> l2 = Arrays.asList(1, 2, 3);
				List<Object> expected = Arrays.asList(1, 2, 3);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
			}

			/**
			* Test case for two lists with four common elements.
			*/
			@Test
			void testFourCommonElements() {
				List<Integer> l1 = Arrays.asList(1, 2, 3, 4);
				List<Object> l2 = Arrays.asList(1, 2, 3, 4);
				List<Object> expected = Arrays.asList(1, 2, 3, 4);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
			}

			/**
			* Test case for two lists with five common elements.
			*/
			@Test
			void testFiveCommonElements() {
				List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
				List<Object> l2 = Arrays.asList(1, 2, 3, 4, 5);
				List<Object> expected = Arrays.asList(1, 2, 3, 4, 5);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
			}

			/**
			* Test case for two lists with six common elements.
			*/
			@Test
			void testSixCommonElements() {
				List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6);
				List<Object> l2 = Arrays.asList(1, 2, 3, 4, 5, 6);
				List<Object> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
			}

			/**
			* Test case for two lists with seven common elements.
			*/
			@Test
			void testSevenCommonElements() {
				List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
				List<Object> l2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
				List<Object> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
			}

			/**
			* Test case for two lists with eight common elements.
			*/
			@Test
			void testEightCommonElements() {
				List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
				List<Object> l2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
				List<Object> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
			}

			/**
			* Test case for two lists with nine common elements.
			*/
			@Test
			void testNineCommonElements() {
				List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
				List<Object> l2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
				List<Object> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
			}

			/**
			* Test case for two lists with ten common elements.
			*/
			@Test
			void testTenCommonElements() {
				List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				List<Object> l2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				List<Object> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
			}
}