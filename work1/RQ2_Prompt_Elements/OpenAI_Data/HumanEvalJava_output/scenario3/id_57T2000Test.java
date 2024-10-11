// MonotonicTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains ten unit test cases for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {
	// Test case 1: List elements are monotonically increasing
			@Test
			void testMonotonic1() {
				List<Integer> l = List.of(1, 2, 4, 10);
				assertTrue(Monotonic.monotonic(l));
			}

			// Test case 2: List elements are monotonically increasing
			@Test
			void testMonotonic2() {
				List<Integer> l = List.of(1, 2, 4, 20);
				assertTrue(Monotonic.monotonic(l));
			}

			// Test case 3: List elements are not monotonically increasing
			@Test
			void testMonotonic3() {
				List<Integer> l = List.of(1, 20, 4, 10);
				assertFalse(Monotonic.monotonic(l));
			}

			// Test case 4: List elements are monotonically decreasing
			@Test
			void testMonotonic4() {
				List<Integer> l = List.of(4, 1, 0, -10);
				assertTrue(Monotonic.monotonic(l));
			}

			// Test case 5: List elements are monotonically decreasing
			@Test
			void testMonotonic5() {
				List<Integer> l = List.of(4, 1, 1, 0);
				assertTrue(Monotonic.monotonic(l));
			}

			// Test case 6: List elements are not monotonically decreasing
			@Test
			void testMonotonic6() {
				List<Integer> l = List.of(1, 2, 3, 2, 5, 60);
				assertFalse(Monotonic.monotonic(l));
			}

			// Test case 7: List elements are monotonically increasing
			@Test
			void testMonotonic7() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 60);
				assertTrue(Monotonic.monotonic(l));
			}

			// Test case 8: List elements are monotonically increasing
			@Test
			void testMonotonic8() {
				List<Integer> l = List.of(9, 9, 9, 9);
				assertTrue(Monotonic.monotonic(l));
			}

			// Test case 9: List elements are monotonically increasing
			@Test
			void testMonotonic9() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				assertTrue(Monotonic.monotonic(l));
			}

			// Test case 10: List elements are not monotonically increasing
			@Test
			void testMonotonic10() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0);
				assertFalse(Monotonic.monotonic(l));
			}
}
