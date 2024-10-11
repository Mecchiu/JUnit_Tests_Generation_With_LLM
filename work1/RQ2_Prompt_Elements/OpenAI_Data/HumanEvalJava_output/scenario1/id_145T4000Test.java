// OrderByPointsTest.java
package scenario1;

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
		void testOrderByPoints_1() {
				List<Object> nums = List.of();
				List<Object> expected = List.of();
				List<Object> actual = OrderByPoints.orderByPoints(nums);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The input list contains one element.
		* The expected result is the same list.
		*/
		@Test
		void testOrderByPoints_2() {
				List<Object> nums = List.of(1);
				List<Object> expected = List.of(1);
				List<Object> actual = OrderByPoints.orderByPoints(nums);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The input list contains two elements.
		* The expected result is the same list.
		*/
		@Test
		void testOrderByPoints_3() {
				List<Object> nums = List.of(1, 2);
				List<Object> expected = List.of(1, 2);
				List<Object> actual = OrderByPoints.orderByPoints(nums);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The input list contains three elements.
		* The expected result is the same list.
		*/
		@Test
		void testOrderByPoints_4() {
				List<Object> nums = List.of(1, 2, 3);
				List<Object> expected = List.of(1, 2, 3);
				List<Object> actual = OrderByPoints.orderByPoints(nums);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The input list contains four elements.
		* The expected result is the same list.
		*/
		@Test
		void testOrderByPoints_5() {
				List<Object> nums = List.of(1, 2, 3, 4);
				List<Object> expected = List.of(1, 2, 3, 4);
				List<Object> actual = OrderByPoints.orderByPoints(nums);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The input list contains five elements.
		* The expected result is the same list.
		*/
		@Test
		void testOrderByPoints_6() {
				List<Object> nums = List.of(1, 2, 3, 4, 5);
				List<Object> expected = List.of(1, 2, 3, 4, 5);
				List<Object> actual = OrderByPoints.orderByPoints(nums);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The input list contains six elements.
		* The expected result is the same list.
		*/
		@Test
		void testOrderByPoints_7() {
				List<Object> nums = List.of(1, 2, 3, 4, 5, 6);
				List<Object> expected = List.of(1, 2, 3, 4, 5, 6);
				List<Object> actual = OrderByPoints.orderByPoints(nums);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The input list contains seven elements.
		* The expected result is the same list.
		*/
		@Test
		void testOrderByPoints_8() {
				List<Object> nums = List.of(1, 2, 3, 4, 5, 6, 7);
				List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7);
				List<Object> actual = OrderByPoints.orderByPoints(nums);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The input list contains eight elements.
		* The expected result is the same list.
		*/
		@Test
		void testOrderByPoints_9() {
				List<Object> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8);
				List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8);
				List<Object> actual = OrderByPoints.orderByPoints(nums);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The input list contains nine elements.
		* The expected result is the same list.
		*/
		@Test
		void testOrderByPoints_10() {
				List<Object> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				List<Object> actual = OrderByPoints.orderByPoints(nums);
				assertEquals(expected, actual);
		}
}