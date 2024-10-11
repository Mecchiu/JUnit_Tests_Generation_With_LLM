// PluckTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pluck}.
* It contains ten unit test cases for the {@link Pluck#pluck(List)} method.
*/
class PluckTest {
	/**
			 * Test case 1: Test with empty list.
			 * Expected result: []
			 */
			@Test
			void testEmptyList() {
				List<Object> arr = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Pluck.pluck(arr);
				assertEquals(expected, actual);
			}

			/**
			 * Test case 2: Test with list of one element.
			 * Expected result: []
			 */
			@Test
			void testOneElementList() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Pluck.pluck(arr);
				assertEquals(expected, actual);
			}

			/**
			 * Test case 3: Test with list of two elements.
			 * Expected result: []
			 */
			@Test
			void testTwoElementsList() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(3);
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Pluck.pluck(arr);
				assertEquals(expected, actual);
			}

			/**
			 * Test case 4: Test with list of three elements.
			 * Expected result: [2, 0]
			 */
			@Test
			void testThreeElementsList() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(2);
				arr.add(1);
				arr.add(3);
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(0);
				List<Object> actual = Pluck.pluck(arr);
				assertEquals(expected, actual);
			}

			/**
			 * Test case 5: Test with list of four elements.
			 * Expected result: [2, 0]
			 */
			@Test
			void testFourElementsList() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(2);
				arr.add(1);
				arr.add(3);
				arr.add(4);
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(0);
				List<Object> actual = Pluck.pluck(arr);
				assertEquals(expected, actual);
			}

			/**
			 * Test case 6: Test with list of five elements.
			 * Expected result: [2, 0]
			 */
			@Test
			void testFiveElementsList() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(2);
				arr.add(1);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(0);
				List<Object> actual = Pluck.pluck(arr);
				assertEquals(expected, actual);
			}

			/**
			 * Test case 7: Test with list of six elements.
			 * Expected result: [2, 0]
			 */
			@Test
			void testSixElementsList() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(2);
				arr.add(1);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(6);
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(0);
				List<Object> actual = Pluck.pluck(arr);
				assertEquals(expected, actual);
			}

			/**
			 * Test case 8: Test with list of seven elements.
			 * Expected result: [2, 0]
			 */
			@Test
			void testSevenElementsList() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(2);
				arr.add(1);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(6);
				arr.add(7);
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(0);
				List<Object> actual = Pluck.pluck(arr);
				assertEquals(expected, actual);
			}

			/**
			 * Test case 9: Test with list of eight elements.
			 * Expected result: [2, 0]
			 */
			@Test
			void testEightElementsList() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(2);
				arr.add(1);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(6);
				arr.add(7);
				arr.add(8);
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(0);
				List<Object> actual = Pluck.pluck(arr);
				assertEquals(expected, actual);
			}

			/**
			 * Test case 10: Test with list of nine elements.
			 * Expected result: [2, 0]
			 */
			@Test
			void testNineElementsList() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(2);
				arr.add(1);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(6);
				arr.add(7);
				arr.add(8);
				arr.add(9);
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(0);
				List<Object> actual = Pluck.pluck(arr);
				assertEquals(expected, actual);
			}
}
