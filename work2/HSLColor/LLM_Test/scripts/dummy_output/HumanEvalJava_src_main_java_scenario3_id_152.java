// CompareTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Compare}.
* It contains ten unit test cases for the {@link Compare#compare(List, List)} method.
*/
class CompareTest {
			/**
			* Test case for the {@link Compare#compare(List, List)} method.
			* It checks if the method returns the correct result for the given input.
			*/
			@Test
			void testCompare() {
							List<Integer> game = List.of(1, 2, 3, 4, 5, 1);
							List<Integer> guess = List.of(1, 2, 3, 4, 2, -2);
							List<Integer> expected = List.of(0, 0, 0, 0, 3, 3);
							List<Integer> actual = Compare.compare(game, guess);
							assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Compare#compare(List, List)} method.
			* It checks if the method returns the correct result for the given input.
			*/
			@Test
			void testCompare2() {
							List<Integer> game = List.of(0, 5, 0, 0, 0, 4);
							List<Integer> guess = List.of(4, 1, 1, 0, 0, -2);
							List<Integer> expected = List.of(4, 4, 1, 0, 0, 6);
							List<Integer> actual = Compare.compare(game, guess);
							assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Compare#compare(List, List)} method.
			* It checks if the method returns the correct result for the given input.
			*/
			@Test
			void testCompare3() {
							List<Integer> game = List.of(1, 2, 3);
							List<Integer> guess = List.of(-1, -2, -3);
							List<Integer> expected = List.of(2, 4, 6);
							List<Integer> actual = Compare.compare(game, guess);
							assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Compare#compare(List, List)} method.
			* It checks if the method returns the correct result for the given input.
			*/
			@Test
			void testCompare4() {
							List<Integer> game = List.of(1, 2, 3, 5);
							List<Integer> guess = List.of(-1, 2, 3, 4);
							List<Integer> expected = List.of(2, 0, 0, 1);
							List<Integer> actual = Compare.compare(game, guess);
							assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Compare#compare(List, List)} method.
			* It checks if the method returns the correct result for the given input.
			*/
			@Test
			void testCompare5() {
							List<Integer> game = List.of(1, 2, 3, 4, 5, 1);
							List<Integer> guess = List.of(1, 2, 3, 4, 2, -2);
							List<Integer> expected = List.of(0, 0, 0, 0, 3, 3);
							List<Integer> actual = Compare.compare(game, guess);
							assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Compare#compare(List, List)} method.
			* It checks if the method returns the correct result for the given input.
			*/
			@Test
			void testCompare6() {
							List<Integer> game = List.of(0, 5, 0, 0, 0, 4);
							List<Integer> guess = List.of(4, 1, 1, 0, 0, -2);
							List<Integer> expected = List.of(4, 4, 1, 0, 0, 6);
							List<Integer> actual = Compare.compare(game, guess);
							assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Compare#compare(List, List)} method.
			* It checks if the method returns the correct result for the given input.
			*/
			@Test
			void testCompare7() {
							List<Integer> game = List.of(1, 2, 3);
							List<Integer> guess = List.of(-1, -2, -3);
							List<Integer> expected = List.of(2, 4, 6);
							List<Integer> actual = Compare.compare(game, guess);
							assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Compare#compare(List, List)} method.
			* It checks if the method returns the correct result for the given input.
			*/
			@Test
			void testCompare8() {
							List<Integer> game = List.of(1, 2, 3, 5);
							List<Integer> guess = List.of(-1, 2, 3, 4);
							List<Integer> expected = List.of(2, 0, 0, 1);
							List<Integer> actual = Compare.compare(game, guess);
							assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Compare#compare(List, List)} method.
			* It checks if the method returns the correct result for the given input.
			*/
			@Test
			void testCompare9() {
							List<Integer> game = List.of(1, 2, 3, 4, 5, 1);
							List<Integer> guess = List.of(1, 2, 3, 4, 2, -2);
							List<Integer> expected = List.of(0, 0, 0, 0, 3, 3);
							List<Integer> actual = Compare.compare(game, guess);
							assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Compare#compare(List, List)} method.
			* It checks if the method returns the correct result for the given input.
			*/
			@Test
			void testCompare10() {
							List<Integer> game = List.of(0, 5, 0, 0, 0, 4);
							List<Integer> guess = List.of(4, 1, 1, 0, 0, -2);
							List<Integer> expected = List.of(4, 4, 1, 0, 0, 6);
							List<Integer> actual = Compare.compare(game, guess);
							assertEquals(expected, actual);
			}
}