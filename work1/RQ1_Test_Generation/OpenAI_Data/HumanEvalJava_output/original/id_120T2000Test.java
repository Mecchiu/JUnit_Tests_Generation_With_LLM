// Maximum1Test.java
package original;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Maximum1}.
* It contains ten unit test cases for the {@link Maximum1#maximum(List, int)} method.
*/
class Maximum1Test {
	/**
			* Test case 1: test the case when the input list is empty.
			* The expected output is an empty list.
			*/
			@Test
			void testEmptyList() {
				List<Integer> arr = new ArrayList<Integer>();
				int k = 3;
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 2: test the case when the input list has only one element.
			* The expected output is the input list.
			*/
			@Test
			void testOneElementList() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(5);
				int k = 3;
				List<Object> expected = new ArrayList<Object>();
				expected.add(5);
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 3: test the case when the input list has only two elements.
			* The expected output is the input list sorted in ascending order.
			*/
			@Test
			void testTwoElementList() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(5);
				arr.add(-5);
				int k = 3;
				List<Object> expected = new ArrayList<Object>();
				expected.add(-5);
				expected.add(5);
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 4: test the case when the input list has only three elements.
			* The expected output is the input list sorted in ascending order.
			*/
			@Test
			void testThreeElementList() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(5);
				arr.add(-5);
				arr.add(0);
				int k = 3;
				List<Object> expected = new ArrayList<Object>();
				expected.add(-5);
				expected.add(0);
				expected.add(5);
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 5: test the case when the input list has only four elements.
			* The expected output is the input list sorted in ascending order.
			*/
			@Test
			void testFourElementList() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(5);
				arr.add(-5);
				arr.add(0);
				arr.add(10);
				int k = 3;
				List<Object> expected = new ArrayList<Object>();
				expected.add(0);
				expected.add(5);
				expected.add(10);
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 6: test the case when the input list has only five elements.
			* The expected output is the input list sorted in ascending order.
			*/
			@Test
			void testFiveElementList() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(5);
				arr.add(-5);
				arr.add(0);
				arr.add(10);
				arr.add(-10);
				int k = 3;
				List<Object> expected = new ArrayList<Object>();
				expected.add(-10);
				expected.add(0);
				expected.add(5);
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 7: test the case when the input list has only six elements.
			* The expected output is the input list sorted in ascending order.
			*/
			@Test
			void testSixElementList() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(5);
				arr.add(-5);
				arr.add(0);
				arr.add(10);
				arr.add(-10);
				arr.add(20);
				int k = 3;
				List<Object> expected = new ArrayList<Object>();
				expected.add(-10);
				expected.add(0);
				expected.add(5);
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 8: test the case when the input list has only seven elements.
			* The expected output is the input list sorted in ascending order.
			*/
			@Test
			void testSevenElementList() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(5);
				arr.add(-5);
				arr.add(0);
				arr.add(10);
				arr.add(-10);
				arr.add(20);
				arr.add(-20);
				int k = 3;
				List<Object> expected = new ArrayList<Object>();
				expected.add(-20);
				expected.add(-10);
				expected.add(0);
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 9: test the case when the input list has only eight elements.
			* The expected output is the input list sorted in ascending order.
			*/
			@Test
			void testEightElementList() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(5);
				arr.add(-5);
				arr.add(0);
				arr.add(10);
				arr.add(-10);
				arr.add(20);
				arr.add(-20);
				arr.add(30);
				int k = 3;
				List<Object> expected = new ArrayList<Object>();
				expected.add(-20);
				expected.add(-10);
				expected.add(0);
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 10: test the case when the input list has only nine elements.
			* The expected output is the input list sorted in ascending order.
			*/
			@Test
			void testNineElementList() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(5);
				arr.add(-5);
				arr.add(0);
				arr.add(10);
				arr.add(-10);
				arr.add(20);
				arr.add(-20);
				arr.add(30);
				arr.add(-30);
				int k = 3;
				List<Object> expected = new ArrayList<Object>();
				expected.add(-30);
				expected.add(-20);
				expected.add(-10);
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}
}
