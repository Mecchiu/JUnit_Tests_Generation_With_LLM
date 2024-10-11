// SortArrayTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray}.
* It contains ten unit test cases for the {@link SortArray#sortArray(List)} method.
*/
class SortArrayTest {
			// Test case 1: Test the method with an empty list.
			@Test
			void testSortArrayEmptyList() {
				List<Object> arr = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = SortArray.sortArray(arr);
				assertEquals(expected, actual);
			}
			
			// Test case 2: Test the method with a list of one element.
			@Test
			void testSortArrayOneElement() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				List<Object> actual = SortArray.sortArray(arr);
				assertEquals(expected, actual);
			}
			
			// Test case 3: Test the method with a list of two elements.
			@Test
			void testSortArrayTwoElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				List<Object> actual = SortArray.sortArray(arr);
				assertEquals(expected, actual);
			}
			
			// Test case 4: Test the method with a list of three elements.
			@Test
			void testSortArrayThreeElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				List<Object> actual = SortArray.sortArray(arr);
				assertEquals(expected, actual);
			}
			
			// Test case 5: Test the method with a list of four elements.
			@Test
			void testSortArrayFourElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(4);
				expected.add(3);
				List<Object> actual = SortArray.sortArray(arr);
				assertEquals(expected, actual);
			}
			
			// Test case 6: Test the method with a list of five elements.
			@Test
			void testSortArrayFiveElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(4);
				expected.add(3);
				expected.add(5);
				List<Object> actual = SortArray.sortArray(arr);
				assertEquals(expected, actual);
			}
			
			// Test case 7: Test the method with a list of six elements.
			@Test
			void testSortArraySixElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(6);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(4);
				expected.add(3);
				expected.add(5);
				expected.add(6);
				List<Object> actual = SortArray.sortArray(arr);
				assertEquals(expected, actual);
			}
			
			// Test case 8: Test the method with a list of seven elements.
			@Test
			void testSortArraySevenElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(6);
				arr.add(7);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(4);
				expected.add(3);
				expected.add(5);
				expected.add(6);
				expected.add(7);
				List<Object> actual = SortArray.sortArray(arr);
				assertEquals(expected, actual);
			}
			
			// Test case 9: Test the method with a list of eight elements.
			@Test
			void testSortArrayEightElements() {
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
				expected.add(1);
				expected.add(2);
				expected.add(4);
				expected.add(3);
				expected.add(5);
				expected.add(6);
				expected.add(7);
				expected.add(8);
				List<Object> actual = SortArray.sortArray(arr);
				assertEquals(expected, actual);
			}
			
			// Test case 10: Test the method with a list of nine elements.
			@Test
			void testSortArrayNineElements() {
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
				expected.add(1);
				expected.add(2);
				expected.add(4);
				expected.add(3);
				expected.add(5);
				expected.add(6);
				expected.add(7);
				expected.add(8);
				expected.add(9);
				List<Object> actual = SortArray.sortArray(arr);
				assertEquals(expected, actual);
			}
}