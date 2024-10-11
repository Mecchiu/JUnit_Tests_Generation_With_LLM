// MonotonicTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains ten unit test cases for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {
			/**
			* Test case for the {@link Monotonic#monotonic(List)} method.
			* It tests the case where the list is monotonically increasing.
			*/
			@Test
			void testMonotonicIncreasing() {
				List<Integer> l = List.of(1, 2, 4, 10);
				assertTrue(Monotonic.monotonic(l));
			}

			/**
			* Test case for the {@link Monotonic#monotonic(List)} method.
			* It tests the case where the list is monotonically decreasing.
			*/
			@Test
			void testMonotonicDecreasing() {
				List<Integer> l = List.of(4, 1, 0, -10);
				assertTrue(Monotonic.monotonic(l));
			}

			/**
			* Test case for the {@link Monotonic#monotonic(List)} method.
			* It tests the case where the list is not monotonically increasing or decreasing.
			*/
			@Test
			void testMonotonicNotIncreasingOrDecreasing() {
				List<Integer> l = List.of(1, 20, 4, 10);
				assertFalse(Monotonic.monotonic(l));
			}

			/**
			* Test case for the {@link Monotonic#monotonic(List)} method.
			* It tests the case where the list has two equal elements.
			*/
			@Test
			void testMonotonicTwoEqualElements() {
				List<Integer> l = List.of(9, 9, 9, 9);
				assertTrue(Monotonic.monotonic(l));
			}

			/**
			* Test case for the {@link Monotonic#monotonic(List)} method.
			* It tests the case where the list has three equal elements.
			*/
			@Test
			void testMonotonicThreeEqualElements() {
				List<Integer> l = List.of(1, 2, 2, 2, 5, 60);
				assertTrue(Monotonic.monotonic(l));
			}

			/**
			* Test case for the {@link Monotonic#monotonic(List)} method.
			* It tests the case where the list has four equal elements.
			*/
			@Test
			void testMonotonicFourEqualElements() {
				List<Integer> l = List.of(1, 2, 2, 2, 2, 5, 60);
				assertTrue(Monotonic.monotonic(l));
			}

			/**
			* Test case for the {@link Monotonic#monotonic(List)} method.
			* It tests the case where the list has five equal elements.
			*/
			@Test
			void testMonotonicFiveEqualElements() {
				List<Integer> l = List.of(1, 2, 2, 2, 2, 2, 5, 60);
				assertTrue(Monotonic.monotonic(l));
			}

			/**
			* Test case for the {@link Monotonic#monotonic(List)} method.
			* It tests the case where the list has six equal elements.
			*/
			@Test
			void testMonotonicSixEqualElements() {
				List<Integer> l = List.of(1, 2, 2, 2, 2, 2, 2, 5, 60);
				assertTrue(Monotonic.monotonic(l));
			}

			/**
			* Test case for the {@link Monotonic#monotonic(List)} method.
			* It tests the case where the list has seven equal elements.
			*/
			@Test
			void testMonotonicSevenEqualElements() {
				List<Integer> l = List.of(1, 2, 2, 2, 2, 2, 2, 2, 5, 60);
				assertTrue(Monotonic.monotonic(l));
			}

			/**
			* Test case for the {@link Monotonic#monotonic(List)} method.
			* It tests the case where the list has eight equal elements.
			*/
			@Test
			void testMonotonicEightEqualElements() {
				List<Integer> l = List.of(1, 2, 2, 2, 2, 2, 2, 2, 2, 5, 60);
				assertTrue(Monotonic.monotonic(l));
			}
}