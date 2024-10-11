// ByLengthTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByLength}.
* It contains ten unit test cases for the {@link ByLength#byLength(List)} method.
*/
class ByLengthTest {
			/**
			* Test case for an empty list.
			*/
			@Test
			void testEmptyList() {
				List<Object> arr = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for a list with one element.
			*/
			@Test
			void testOneElement() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				List<Object> expected = new ArrayList<Object>();
				expected.add("One");
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for a list with two elements.
			*/
			@Test
			void testTwoElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				List<Object> expected = new ArrayList<Object>();
				expected.add("Two");
				expected.add("One");
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for a list with three elements.
			*/
			@Test
			void testThreeElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				List<Object> expected = new ArrayList<Object>();
				expected.add("Three");
				expected.add("Two");
				expected.add("One");
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for a list with four elements.
			*/
			@Test
			void testFourElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				List<Object> expected = new ArrayList<Object>();
				expected.add("Four");
				expected.add("Three");
				expected.add("Two");
				expected.add("One");
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for a list with five elements.
			*/
			@Test
			void testFiveElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				List<Object> expected = new ArrayList<Object>();
				expected.add("Five");
				expected.add("Four");
				expected.add("Three");
				expected.add("Two");
				expected.add("One");
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for a list with six elements.
			*/
			@Test
			void testSixElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(6);
				List<Object> expected = new ArrayList<Object>();
				expected.add("Six");
				expected.add("Five");
				expected.add("Four");
				expected.add("Three");
				expected.add("Two");
				expected.add("One");
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for a list with seven elements.
			*/
			@Test
			void testSevenElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(6);
				arr.add(7);
				List<Object> expected = new ArrayList<Object>();
				expected.add("Seven");
				expected.add("Six");
				expected.add("Five");
				expected.add("Four");
				expected.add("Three");
				expected.add("Two");
				expected.add("One");
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for a list with eight elements.
			*/
			@Test
			void testEightElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(6);
				arr.add(7);
				arr.add(8);
				List<Object> expected = new ArrayList<Object>();
				expected.add("Eight");
				expected.add("Seven");
				expected.add("Six");
				expected.add("Five");
				expected.add("Four");
				expected.add("Three");
				expected.add("Two");
				expected.add("One");
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for a list with nine elements.
			*/
			@Test
			void testNineElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(6);
				arr.add(7);
				arr.add(8);
				arr.add(9);
				List<Object> expected = new ArrayList<Object>();
				expected.add("Nine");
				expected.add("Eight");
				expected.add("Seven");
				expected.add("Six");
				expected.add("Five");
				expected.add("Four");
				expected.add("Three");
				expected.add("Two");
				expected.add("One");
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for a list with ten elements.
			*/
			@Test
			void testTenElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(6);
				arr.add(7);
				arr.add(8);
				arr.add(9);
				arr.add(10);
				List<Object> expected = new ArrayList<Object>();
				expected.add("Nine");
				expected.add("Eight");
				expected.add("Seven");
				expected.add("Six");
				expected.add("Five");
				expected.add("Four");
				expected.add("Three");
				expected.add("Two");
				expected.add("One");
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}
}