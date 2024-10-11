// DoubleTheDifferenceTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DoubleTheDifference}.
* It contains ten unit test cases for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
*/
class DoubleTheDifferenceTest {
	/**
			* Test case for the method {@link DoubleTheDifference#doubleTheDifference(List)}.
			* It tests the case when the input list is empty.
			*/
			@Test
			void testEmptyList() {
				List<Object> lst = List.of();
				assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
			}

			/**
			* Test case for the method {@link DoubleTheDifference#doubleTheDifference(List)}.
			* It tests the case when the input list contains only one element.
			*/
			@Test
			void testOneElementList() {
				List<Object> lst = List.of(0);
				assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
			}

			/**
			* Test case for the method {@link DoubleTheDifference#doubleTheDifference(List)}.
			* It tests the case when the input list contains only two elements.
			*/
			@Test
			void testTwoElementList() {
				List<Object> lst = List.of(5, 4);
				assertEquals(25, DoubleTheDifference.doubleTheDifference(lst));
			}

			/**
			* Test case for the method {@link DoubleTheDifference#doubleTheDifference(List)}.
			* It tests the case when the input list contains only three elements.
			*/
			@Test
			void testThreeElementList() {
				List<Object> lst = List.of(0.1, 0.2, 0.3);
				assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
			}

			/**
			* Test case for the method {@link DoubleTheDifference#doubleTheDifference(List)}.
			* It tests the case when the input list contains only four elements.
			*/
			@Test
			void testFourElementList() {
				List<Object> lst = List.of(-10, -20, -30);
				assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
			}

			/**
			* Test case for the method {@link DoubleTheDifference#doubleTheDifference(List)}.
			* It tests the case when the input list contains only five elements.
			*/
			@Test
			void testFiveElementList() {
				List<Object> lst = List.of(-1, -2, 8);
				assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
			}

			/**
			* Test case for the method {@link DoubleTheDifference#doubleTheDifference(List)}.
			* It tests the case when the input list contains only six elements.
			*/
			@Test
			void testSixElementList() {
				List<Object> lst = List.of(0.2, 3, 5);
				assertEquals(34, DoubleTheDifference.doubleTheDifference(lst));
			}

			/**
			* Test case for the method {@link DoubleTheDifference#doubleTheDifference(List)}.
			* It tests the case when the input list contains only odd numbers.
			*/
			@Test
			void testOddNumbersList() {
				List<Object> lst = List.of(-99, -97, -95, -93, -91, -89, -87, -85, -83, -81, -79, -77, -75, -73, -71, -69, -67, -65, -63, -61, -59, -57, -55, -53, -51, -49, -47, -45, -43, -41, -39, -37, -35, -33, -31, -29, -27, -25, -23, -21, -19, -17, -15, -13, -11, -9, -7, -5, -3, -1, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99);
				assertEquals(166650, DoubleTheDifference.doubleTheDifference(lst));
			}

			/**
			* Test case for the method {@link DoubleTheDifference#doubleTheDifference(List)}.
			* It tests the case when the input list contains only even numbers.
			*/
			@Test
			void testEvenNumbersList() {
				List<Object> lst = List.of(-100, -98, -96, -94, -92, -90, -88, -86, -84, -82, -80, -78, -76, -74, -72, -70, -68, -66, -64, -62, -60, -58, -56, -54, -52, -50, -48, -46, -44, -42, -40, -38, -36, -34, -32, -30, -28, -26, -24, -22, -20, -18, -16, -14, -12, -10, -8, -6, -4, -2, 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100);
				assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
			}

			/**
			* Test case for the method {@link DoubleTheDifference#doubleTheDifference(List)}.
			* It tests the case when the input list contains both odd and even numbers.
			*/
			@Test
			void testMixedNumbersList() {
				List<Object> lst = List.of(-100, -98, -96, -94, -92, -90, -88, -86, -84, -82, -80, -78, -76, -74, -72, -70, -68, -66, -64, -62, -60, -58, -56, -54, -52, -50, -48, -46, -44, -42, -40, -38, -36, -34, -32, -30, -28, -26, -24, -22, -20, -18, -16, -14, -12, -10, -8, -6, -4, -2, 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100);
				assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
			}
}
