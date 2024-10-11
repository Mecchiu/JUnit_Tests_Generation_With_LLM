// SmallestChangeTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SmallestChange}.
* It contains ten unit test cases for the {@link SmallestChange#smallestChange(List)} method.
*/
class SmallestChangeTest {
	/**
			* Test case for an empty list.
			*/
			@Test
			void testEmptyList() {
				List<Integer> arr = List.of();
				assertEquals(0, SmallestChange.smallestChange(arr));
			}

			/**
			* Test case for a list with one element.
			*/
			@Test
			void testOneElementList() {
				List<Integer> arr = List.of(1);
				assertEquals(0, SmallestChange.smallestChange(arr));
			}

			/**
			* Test case for a list with two elements.
			*/
			@Test
			void testTwoElementsList() {
				List<Integer> arr = List.of(1, 2);
				assertEquals(1, SmallestChange.smallestChange(arr));
			}

			/**
			* Test case for a list with three elements.
			*/
			@Test
			void testThreeElementsList() {
				List<Integer> arr = List.of(1, 2, 3);
				assertEquals(2, SmallestChange.smallestChange(arr));
			}

			/**
			* Test case for a list with four elements.
			*/
			@Test
			void testFourElementsList() {
				List<Integer> arr = List.of(1, 2, 3, 4);
				assertEquals(2, SmallestChange.smallestChange(arr));
			}

			/**
			* Test case for a list with five elements.
			*/
			@Test
			void testFiveElementsList() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5);
				assertEquals(3, SmallestChange.smallestChange(arr));
			}

			/**
			* Test case for a list with six elements.
			*/
			@Test
			void testSixElementsList() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5, 6);
				assertEquals(3, SmallestChange.smallestChange(arr));
			}

			/**
			* Test case for a list with seven elements.
			*/
			@Test
			void testSevenElementsList() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7);
				assertEquals(4, SmallestChange.smallestChange(arr));
			}

			/**
			* Test case for a list with eight elements.
			*/
			@Test
			void testEightElementsList() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8);
				assertEquals(4, SmallestChange.smallestChange(arr));
			}

			/**
			* Test case for a list with nine elements.
			*/
			@Test
			void testNineElementsList() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				assertEquals(5, SmallestChange.smallestChange(arr));
			}
}
