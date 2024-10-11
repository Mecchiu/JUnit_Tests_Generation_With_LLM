// MoveOneBallTest.java
package original;

import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MoveOneBall}.
* It contains ten unit test cases for the {@link MoveOneBall#moveOneBall(List)} method.
*/
class MoveOneBallTest {
			/**
			* Test case 1: Test an empty list.
			* Expected result: True.
			*/
			@Test
			void testEmptyList() {
						List<Object> arr = new ArrayList<>();
						assertTrue(MoveOneBall.moveOneBall(arr));
			}

			/**
			* Test case 2: Test a list with one element.
			* Expected result: True.
			*/
			@Test
			void testOneElementList() {
						List<Object> arr = new ArrayList<>();
						arr.add(1);
						assertTrue(MoveOneBall.moveOneBall(arr));
			}

			/**
			* Test case 3: Test a list with two elements.
			* Expected result: True.
			*/
			@Test
			void testTwoElementsList() {
						List<Object> arr = new ArrayList<>();
						arr.add(1);
						arr.add(2);
						assertTrue(MoveOneBall.moveOneBall(arr));
			}

			/**
			* Test case 4: Test a list with three elements.
			* Expected result: True.
			*/
			@Test
			void testThreeElementsList() {
						List<Object> arr = new ArrayList<>();
						arr.add(1);
						arr.add(2);
						arr.add(3);
						assertTrue(MoveOneBall.moveOneBall(arr));
			}

			/**
			* Test case 5: Test a list with four elements.
			* Expected result: True.
			*/
			@Test
			void testFourElementsList() {
						List<Object> arr = new ArrayList<>();
						arr.add(1);
						arr.add(2);
						arr.add(3);
						arr.add(4);
						assertTrue(MoveOneBall.moveOneBall(arr));
			}

			/**
			* Test case 6: Test a list with five elements.
			* Expected result: True.
			*/
			@Test
			void testFiveElementsList() {
						List<Object> arr = new ArrayList<>();
						arr.add(1);
						arr.add(2);
						arr.add(3);
						arr.add(4);
						arr.add(5);
						assertTrue(MoveOneBall.moveOneBall(arr));
			}

			/**
			* Test case 7: Test a list with six elements.
			* Expected result: False.
			*/
			@Test
			void testSixElementsList() {
						List<Object> arr = new ArrayList<>();
						arr.add(3);
						arr.add(4);
						arr.add(5);
						arr.add(1);
						arr.add(2);
						assertFalse(MoveOneBall.moveOneBall(arr));
			}

			/**
			* Test case 8: Test a list with seven elements.
			* Expected result: False.
			*/
			@Test
			void testSevenElementsList() {
						List<Object> arr = new ArrayList<>();
						arr.add(3);
						arr.add(5);
						arr.add(10);
						arr.add(1);
						arr.add(2);
						assertFalse(MoveOneBall.moveOneBall(arr));
			}

			/**
			* Test case 9: Test a list with eight elements.
			* Expected result: False.
			*/
			@Test
			void testEightElementsList() {
						List<Object> arr = new ArrayList<>();
						arr.add(4);
						arr.add(3);
						arr.add(1);
						arr.add(2);
						assertFalse(MoveOneBall.moveOneBall(arr));
			}

			/**
			* Test case 10: Test a list with nine elements.
			* Expected result: False.
			*/
			@Test
			void testNineElementsList() {
						List<Object> arr = new ArrayList<>();
						arr.add(3);
						arr.add(5);
						arr.add(4);
						arr.add(1);
						arr.add(2);
						assertFalse(MoveOneBall.moveOneBall(arr));
			}
}