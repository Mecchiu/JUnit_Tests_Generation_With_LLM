// OrderByPointsTest.java
package original;

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
			* Test case for the {@link OrderByPoints#orderByPoints(List)} method.
			* It tests the method with the following input:
			* <ul>
			* <li>input: [1, 11, -1, -11, -12]</li>
			* <li>expected output: [-1, -11, 1, -12, 11]</li>
			* </ul>
			*/
			@Test
			void testOrderByPoints1() {
				List<Object> input = List.of(1, 11, -1, -11, -12);
				List<Object> expected = List.of(-1, -11, 1, -12, 11);
				List<Object> actual = OrderByPoints.orderByPoints(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link OrderByPoints#orderByPoints(List)} method.
			* It tests the method with the following input:
			* <ul>
			* <li>input: []</li>
			* <li>expected output: []</li>
			* </ul>
			*/
			@Test
			void testOrderByPoints2() {
				List<Object> input = Collections.emptyList();
				List<Object> expected = Collections.emptyList();
				List<Object> actual = OrderByPoints.orderByPoints(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link OrderByPoints#orderByPoints(List)} method.
			* It tests the method with the following input:
			* <ul>
			* <li>input: [1234, 423, 463, 145, 2, 423, 423, 53, 6, 37, 3457, 3, 56, 0, 46]</li>
			* <li>expected output: [0, 2, 3, 6, 53, 423, 423, 423, 1234, 145, 37, 46, 56, 463, 3457]</li>
			* </ul>
			*/
			@Test
			void testOrderByPoints3() {
				List<Object> input = List.of(1234, 423, 463, 145, 2, 423, 423, 53, 6, 37, 3457, 3, 56, 0, 46);
				List<Object> expected = List.of(0, 2, 3, 6, 53, 423, 423, 423, 1234, 145, 37, 46, 56, 463, 3457);
				List<Object> actual = OrderByPoints.orderByPoints(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link OrderByPoints#orderByPoints(List)} method.
			* It tests the method with the following input:
			* <ul>
			* <li>input: [1, -11, -32, 43, 54, -98, 2, -3]</li>
			* <li>expected output: [-3, -32, -98, -11, 1, 2, 43, 54]</li>
			* </ul>
			*/
			@Test
			void testOrderByPoints4() {
				List<Object> input = List.of(1, -11, -32, 43, 54, -98, 2, -3);
				List<Object> expected = List.of(-3, -32, -98, -11, 1, 2, 43, 54);
				List<Object> actual = OrderByPoints.orderByPoints(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link OrderByPoints#orderByPoints(List)} method.
			* It tests the method with the following input:
			* <ul>
			* <li>input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]</li>
			* <li>expected output: [1, 10, 2, 11, 3, 4, 5, 6, 7, 8, 9]</li>
			* </ul>
			*/
			@Test
			void testOrderByPoints5() {
				List<Object> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
				List<Object> expected = List.of(1, 10, 2, 11, 3, 4, 5, 6, 7, 8, 9);
				List<Object> actual = OrderByPoints.orderByPoints(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link OrderByPoints#orderByPoints(List)} method.
			* It tests the method with the following input:
			* <ul>
			* <li>input: [0, 6, 6, -76, -21, 23, 4]</li>
			* <li>expected output: [-76, -21, 0, 4, 23, 6, 6]</li>
			* </ul>
			*/
			@Test
			void testOrderByPoints6() {
				List<Object> input = List.of(0, 6, 6, -76, -21, 23, 4);
				List<Object> expected = List.of(-76, -21, 0, 4, 23, 6, 6);
				List<Object> actual = OrderByPoints.orderByPoints(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link OrderByPoints#orderByPoints(List)} method.
			* It tests the method with the following input:
			* <ul>
			* <li>input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]</li>
			* <li>expected output: [1, 10, 2, 11, 3, 4, 5, 6, 7, 8, 9]</li>
			* </ul>
			*/
			@Test
			void testOrderByPoints7() {
				List<Object> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
				List<Object> expected = List.of(1, 10, 2, 11, 3, 4, 5, 6, 7, 8, 9);
				List<Object> actual = OrderByPoints.orderByPoints(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link OrderByPoints#orderByPoints(List)} method.
			* It tests the method with the following input:
			* <ul>
			* <li>input: [0, 6, 6, -76, -21, 23, 4]</li>
			* <li>expected output: [-76, -21, 0, 4, 23, 6, 6]</li>
			* </ul>
			*/
			@Test
			void testOrderByPoints8() {
				List<Object> input = List.of(0, 6, 6, -76, -21, 23, 4);
				List<Object> expected = List.of(-76, -21, 0, 4, 23, 6, 6);
				List<Object> actual = OrderByPoints.orderByPoints(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link OrderByPoints#orderByPoints(List)} method.
			* It tests the method with the following input:
			* <ul>
			* <li>input: [1, 11, -1, -11, -12]</li>
			* <li>expected output: [-1, -11, 1, -12, 11]</li>
			* </ul>
			*/
			@Test
			void testOrderByPoints9() {
				List<Object> input = List.of(1, 11, -1, -11, -12);
				List<Object> expected = List.of(-1, -11, 1, -12, 11);
				List<Object> actual = OrderByPoints.orderByPoints(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link OrderByPoints#orderByPoints(List)} method.
			* It tests the method with the following input:
			* <ul>
			* <li>input: []</li>
			* <li>expected output: []</li>
			* </ul