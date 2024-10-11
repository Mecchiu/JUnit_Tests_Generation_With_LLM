// MoveOneBallTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MoveOneBall}.
* It contains ten unit test cases for the {@link MoveOneBall#moveOneBall(List)} method.
*/
class MoveOneBallTest {
	/**
			* Test case for an empty list.
			*/
			@Test
			void testEmptyList() {
						List<Object> arr = List.of();
						assertTrue(MoveOneBall.moveOneBall(arr));
			}

			/**
			* Test case for a list with one element.
			*/
			@Test
			void testOneElementList() {
						List<Object> arr = List.of(1);
						assertTrue(MoveOneBall.moveOneBall(arr));
			}

			/**
			* Test case for a list with two elements.
			*/
			@Test
			void testTwoElementsList() {
						List<Object> arr = List.of(1, 2);
						assertTrue(MoveOneBall.moveOneBall(arr));
			}

			/**
			* Test case for a list with three elements.
			*/
			@Test
			void testThreeElementsList() {
						List<Object> arr = List.of(1, 2, 3);
						assertTrue(MoveOneBall.moveOneBall(arr));
			}

			/**
			* Test case for a list with four elements.
			*/
			@Test
			void testFourElementsList() {
						List<Object> arr = List.of(1, 2, 3, 4);
						assertTrue(MoveOneBall.moveOneBall(arr));
			}

			/**
			* Test case for a list with five elements.
			*/
			@Test
			void testFiveElementsList() {
						List<Object> arr = List.of(1, 2, 3, 4, 5);
						assertTrue(MoveOneBall.moveOneBall(arr));
			}

			/**
			* Test case for a list with six elements.
			*/
			@Test
			void testSixElementsList() {
						List<Object> arr = List.of(1, 2, 3, 4, 5, 6);
						assertTrue(MoveOneBall.moveOneBall(arr));
			}

			/**
			* Test case for a list with seven elements.
			*/
			@Test
			void testSevenElementsList() {
						List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7);
						assertTrue(MoveOneBall.moveOneBall(arr));
			}

			/**
			* Test case for a list with eight elements.
			*/
			@Test
			void testEightElementsList() {
						List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8);
						assertTrue(MoveOneBall.moveOneBall(arr));
			}

			/**
			* Test case for a list with nine elements.
			*/
			@Test
			void testNineElementsList() {
						List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
						assertTrue(MoveOneBall.moveOneBall(arr));
			}

			/**
			* Test case for a list with ten elements.
			*/
			@Test
			void testTenElementsList() {
						List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
						assertTrue(MoveOneBall.moveOneBall(arr));
			}
}
