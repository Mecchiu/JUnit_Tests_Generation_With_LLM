// DoubleTheDifferenceTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DoubleTheDifference}.
* It contains ten unit test cases for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
*/
class DoubleTheDifferenceTest {
	@Test
			void testEmptyList() {
				List<Object> lst = List.of();
				assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
			}

			@Test
			void testOneElementList() {
				List<Object> lst = List.of(0);
				assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
			}

			@Test
			void testTwoElementList() {
				List<Object> lst = List.of(5, 4);
				assertEquals(25, DoubleTheDifference.doubleTheDifference(lst));
			}

			@Test
			void testThreeElementList() {
				List<Object> lst = List.of(0.1, 0.2, 0.3);
				assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
			}

			@Test
			void testNegativeElementList() {
				List<Object> lst = List.of(-10, -20, -30);
				assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
			}

			@Test
			void testNegativeAndPositiveElementList() {
				List<Object> lst = List.of(-1, -2, 8);
				assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
			}

			@Test
			void testPositiveElementList() {
				List<Object> lst = List.of(0.2, 3, 5);
				assertEquals(34, DoubleTheDifference.doubleTheDifference(lst));
			}

			@Test
			void testLargeElementList() {
				List<Object> lst = List.of(-99, -97, -95, -93, -91, -89, -87, -85, -83, -81, -79, -77, -75, -73, -71, -69, -67, -65, -63, -61, -59, -57, -55, -53, -51, -49, -47, -45, -43, -41, -39, -37, -35, -33, -31, -29, -27, -25, -23, -21, -19, -17, -15, -13, -11, -9, -7, -5, -3, -1, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99);
				assertEquals(166650, DoubleTheDifference.doubleTheDifference(lst));
			}

			@Test
			void testNullList() {
				List<Object> lst = null;
				assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
			}
}
