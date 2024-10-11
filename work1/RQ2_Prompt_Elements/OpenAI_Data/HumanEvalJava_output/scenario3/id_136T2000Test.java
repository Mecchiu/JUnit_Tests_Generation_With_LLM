// LargestSmallestIntegersTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestSmallestIntegers}.
* It contains ten unit test cases for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
*/
class LargestSmallestIntegersTest {
	@Test
			void testLargestSmallestIntegers1() {
				List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(List.of(2, 4, 1, 3, 5, 7));
				assertEquals(null, result.get(0));
				assertEquals(1, result.get(1));
			}

			@Test
			void testLargestSmallestIntegers2() {
				List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(List.of(2, 4, 1, 3, 5, 7, 0));
				assertEquals(null, result.get(0));
				assertEquals(0, result.get(1));
			}

			@Test
			void testLargestSmallestIntegers3() {
				List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(List.of(1, 3, 2, 4, 5, 6, -2));
				assertEquals(-2, result.get(0));
				assertEquals(1, result.get(1));
			}

			@Test
			void testLargestSmallestIntegers4() {
				List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(List.of(4, 5, 3, 6, 2, 7, -7));
				assertEquals(-7, result.get(0));
				assertEquals(2, result.get(1));
			}

			@Test
			void testLargestSmallestIntegers5() {
				List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(List.of(7, 3, 8, 4, 9, 2, 5, -9));
				assertEquals(-9, result.get(0));
				assertEquals(2, result.get(1));
			}

			@Test
			void testLargestSmallestIntegers6() {
				List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(List.of());
				assertEquals(null, result.get(0));
				assertEquals(null, result.get(1));
			}

			@Test
			void testLargestSmallestIntegers7() {
				List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(List.of(0));
				assertEquals(null, result.get(0));
				assertEquals(null, result.get(1));
			}

			@Test
			void testLargestSmallestIntegers8() {
				List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(List.of(-1, -3, -5, -6));
				assertEquals(-1, result.get(0));
				assertEquals(null, result.get(1));
			}

			@Test
			void testLargestSmallestIntegers9() {
				List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(List.of(-1, -3, -5, -6, 0));
				assertEquals(-1, result.get(0));
				assertEquals(null, result.get(1));
			}

			@Test
			void testLargestSmallestIntegers10() {
				List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(List.of(-6, -4, -4, -3, 1));
				assertEquals(-3, result.get(0));
				assertEquals(1, result.get(1));
			}

			@Test
			void testLargestSmallestIntegers11() {
				List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(List.of(-6, -4, -4, -3, -100, 1));
				assertEquals(-3, result.get(0));
				assertEquals(1, result.get(1));
			}
}