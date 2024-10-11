// OrderByPointsTest.java
package scenario2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OrderByPoints}.
* It contains ten unit test cases for the {@link OrderByPoints#orderByPoints(List)} method.
*/
class OrderByPointsTest {

		/**
		* Test case 1.
		* The input list is empty.
		* The expected result is an empty list.
		*/
		@Test
		void testCase1() {
				List<Object> input = List.of();
				List<Object> expected = List.of();
				List<Object> actual = OrderByPoints.orderByPoints(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The input list contains only one element.
		* The expected result is the same list.
		*/
		@Test
		void testCase2() {
				List<Object> input = List.of(1);
				List<Object> expected = List.of(1);
				List<Object> actual = OrderByPoints.orderByPoints(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The input list contains only two elements.
		* The expected result is the same list.
		*/
		@Test
		void testCase3() {
				List<Object> input = List.of(1, 2);
				List<Object> expected = List.of(1, 2);
				List<Object> actual = OrderByPoints.orderByPoints(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The input list contains only three elements.
		* The expected result is the same list.
		*/
		@Test
		void testCase4() {
				List<Object> input = List.of(1, 2, 3);
				List<Object> expected = List.of(1, 2, 3);
				List<Object> actual = OrderByPoints.orderByPoints(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The input list contains only four elements.
		* The expected result is the same list.
		*/
		@Test
		void testCase5() {
				List<Object> input = List.of(1, 2, 3, 4);
				List<Object> expected = List.of(1, 2, 3, 4);
				List<Object> actual = OrderByPoints.orderByPoints(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The input list contains only five elements.
		* The expected result is the same list.
		*/
		@Test
		void testCase6() {
				List<Object> input = List.of(1, 2, 3, 4, 5);
				List<Object> expected = List.of(1, 2, 3, 4, 5);
				List<Object> actual = OrderByPoints.orderByPoints(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The input list contains only six elements.
		* The expected result is the same list.
		*/
		@Test
		void testCase7() {
				List<Object> input = List.of(1, 2, 3, 4, 5, 6);
				List<Object> expected = List.of(1, 2, 3, 4, 5, 6);
				List<Object> actual = OrderByPoints.orderByPoints(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The input list contains only seven elements.
		* The expected result is the same list.
		*/
		@Test
		void testCase8() {
				List<Object> input = List.of(1, 2, 3, 4, 5, 6, 7);
				List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7);
				List<Object> actual = OrderByPoints.orderByPoints(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The input list contains only eight elements.
		* The expected result is the same list.
		*/
		@Test
		void testCase9() {
				List<Object> input = List.of(1, 2, 3, 4, 5, 6, 7, 8);
				List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8);
				List<Object> actual = OrderByPoints.orderByPoints(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The input list contains only nine elements.
		* The expected result is the same list.
		*/
		@Test
		void testCase10() {
				List<Object> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				List<Object> actual = OrderByPoints.orderByPoints(input);
				assertEquals(expected, actual);
		}
}