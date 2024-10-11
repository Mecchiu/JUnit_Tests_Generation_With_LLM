// Maximum1Test.java
package scenario2;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Maximum1}.
* It contains ten unit test cases for the {@link Maximum1#maximum(List, int)} method.
*/
class Maximum1Test {
			// Test case 1: k = 0
			@Test
			void testMaximum1() {
				List<Integer> arr = new ArrayList<Integer>();
				int k = 0;
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			// Test case 2: k = 1
			@Test
			void testMaximum2() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				int k = 1;
				List<Object> expected = new ArrayList<Object>();
				expected.add(3);
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			// Test case 3: k = 2
			@Test
			void testMaximum3() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				int k = 2;
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(3);
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			// Test case 4: k = 3
			@Test
			void testMaximum4() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				int k = 3;
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			// Test case 5: k = 4
			@Test
			void testMaximum5() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				int k = 4;
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			// Test case 6: k = 5
			@Test
			void testMaximum6() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				int k = 5;
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			// Test case 7: k = 6
			@Test
			void testMaximum7() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				int k = 6;
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			// Test case 8: k = 7
			@Test
			void testMaximum8() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				int k = 7;
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			// Test case 9: k = 8
			@Test
			void testMaximum9() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				int k = 8;
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}

			// Test case 10: k = 9
			@Test
			void testMaximum10() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				int k = 9;
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}
}