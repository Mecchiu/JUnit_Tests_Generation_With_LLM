// DerivativeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Derivative}.
* It contains ten unit test cases for the {@link Derivative#derivative(List)} method.
*/
class DerivativeTest {

	@Test
	void testDerivative() {
		List<Integer> xs = List.of(3, 1, 2, 4, 5);
		List<Integer> expected = List.of(1, 4, 12, 20);
		assertEquals(expected, Derivative.derivative(xs));
		
		xs = List.of(1, 2, 3);
		expected = List.of(2, 6);
		assertEquals(expected, Derivative.derivative(xs));
		
		xs = List.of(3, 2, 1);
		expected = List.of(2, 2);
		assertEquals(expected, Derivative.derivative(xs));
		
		xs = List.of(3, 2, 1, 0, 4);
		expected = List.of(2, 2, 0, 16);
		assertEquals(expected, Derivative.derivative(xs));
		
		xs = List.of(1);
		expected = List.of();
		assertEquals(expected, Derivative.derivative(xs));
		
		xs = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		expected = List.of(2, 6, 12, 20, 30, 42, 56, 72, 90);
		assertEquals(expected, Derivative.derivative(xs));
		
		xs = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		expected = List.of(2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240, 272, 306, 342, 380, 420);
		assertEquals(expected, Derivative.derivative(xs));
		
		xs = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30);
		expected = List.of(2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240, 272, 306, 342, 380, 420, 462, 506, 552, 600, 650, 702, 756, 812, 870, 930);
		assertEquals(expected, Derivative.derivative(xs));
		
		xs = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40);
		expected = List.of(2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240, 272, 306, 342, 380, 420, 462, 506, 552, 600, 650, 702, 756, 812, 870, 930, 992, 1056, 1122, 1190, 1260, 1332, 1406, 1482, 1560, 1640);
		assertEquals(expected, Derivative.derivative(xs));
		
		xs = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50);
		expected = List.of(2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240, 272, 306, 342, 380, 420, 462, 506, 552, 600, 650, 702, 756, 812, 870, 930, 992, 1056, 1122, 1190, 1260, 1332, 1406, 1482, 1560, 1640, 1722, 1806, 1892, 1980, 2070, 2162, 2256, 2352, 2450, 2550);
		assertEquals(expected, Derivative.derivative(xs));
	}
}