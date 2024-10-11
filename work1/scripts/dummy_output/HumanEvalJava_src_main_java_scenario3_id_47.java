// MedianTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Median}.
* It contains ten unit test cases for the {@link Median#median(List)} method.
*/
class MedianTest {
			// Test case 1: Test median of a list with odd number of elements
			@Test
			void testMedianOdd() {
				List<Integer> l = List.of(3, 1, 2, 4, 5);
				assertEquals(3, Median.median(l));
			}

			// Test case 2: Test median of a list with even number of elements
			@Test
			void testMedianEven() {
				List<Integer> l = List.of(-10, 4, 6, 1000, 10, 20);
				assertEquals(8.0, Median.median(l));
			}

			// Test case 3: Test median of a list with one element
			@Test
			void testMedianOne() {
				List<Integer> l = List.of(5);
				assertEquals(5, Median.median(l));
			}

			// Test case 4: Test median of a list with two elements
			@Test
			void testMedianTwo() {
				List<Integer> l = List.of(6, 5);
				assertEquals(5.5, Median.median(l));
			}

			// Test case 5: Test median of a list with repeated elements
			@Test
			void testMedianRepeated() {
				List<Integer> l = List.of(8, 1, 3, 9, 9, 2, 7);
				assertEquals(7, Median.median(l));
			}

			// Test case 6: Test median of a list with negative elements
			@Test
			void testMedianNegative() {
				List<Integer> l = List.of(-5, -10, -3, -1, -2);
				assertEquals(-3, Median.median(l));
			}

			// Test case 7: Test median of a list with positive elements
			@Test
			void testMedianPositive() {
				List<Integer> l = List.of(5, 10, 3, 1, 2);
				assertEquals(3, Median.median(l));
			}

			// Test case 8: Test median of a list with zero
			@Test
			void testMedianZero() {
				List<Integer> l = List.of(0, 0, 0, 0, 0);
				assertEquals(0, Median.median(l));
			}

			// Test case 9: Test median of a list with null elements
			@Test
			void testMedianNull() {
				List<Integer> l = List.of(null, null, null, null, null);
				assertEquals(null, Median.median(l));
			}

			// Test case 10: Test median of an empty list
			@Test
			void testMedianEmpty() {
				List<Integer> l = List.of();
				assertEquals(null, Median.median(l));
			}
}