// MaxFillTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxFill}.
* It contains ten unit test cases for the {@link MaxFill#maxFill(List, int)} method.
*/
class MaxFillTest {
	/**
			* Test case #1.
			* Input: grid = [[1,0,0],[1,0,0],[1,0,0]], capacity = 1
			* Output: 3
			*/
			@Test
			void testMaxFill1() {
				List<List<Integer>> grid = List.of(
					List.of(1, 0, 0),
					List.of(1, 0, 0),
					List.of(1, 0, 0)
				);
				int capacity = 1;
				int expected = 3;
				int actual = MaxFill.maxFill(grid, capacity);
				assertEquals(expected, actual);
			}

			/**
			* Test case #2.
			* Input: grid = [[1,1,1],[1,1,1],[1,1,1]], capacity = 1
			* Output: 9
			*/
			@Test
			void testMaxFill2() {
				List<List<Integer>> grid = List.of(
					List.of(1, 1, 1),
					List.of(1, 1, 1),
					List.of(1, 1, 1)
				);
				int capacity = 1;
				int expected = 9;
				int actual = MaxFill.maxFill(grid, capacity);
				assertEquals(expected, actual);
			}

			/**
			* Test case #3.
			* Input: grid = [[1,1,1],[1,1,1],[1,1,1]], capacity = 2
			* Output: 5
			*/
			@Test
			void testMaxFill3() {
				List<List<Integer>> grid = List.of(
					List.of(1, 1, 1),
					List.of(1, 1, 1),
					List.of(1, 1, 1)
				);
				int capacity = 2;
				int expected = 5;
				int actual = MaxFill.maxFill(grid, capacity);
				assertEquals(expected, actual);
			}

			/**
			* Test case #4.
			* Input: grid = [[1,1,1],[1,1,1],[1,1,1]], capacity = 3
			* Output: 3
			*/
			@Test
			void testMaxFill4() {
				List<List<Integer>> grid = List.of(
					List.of(1, 1, 1),
					List.of(1, 1, 1),
					List.of(1, 1, 1)
				);
				int capacity = 3;
				int expected = 3;
				int actual = MaxFill.maxFill(grid, capacity);
				assertEquals(expected, actual);
			}

			/**
			* Test case #5.
			* Input: grid = [[1,1,1],[1,1,1],[1,1,1]], capacity = 4
			* Output: 2
			*/
			@Test
			void testMaxFill5() {
				List<List<Integer>> grid = List.of(
					List.of(1, 1, 1),
					List.of(1, 1, 1),
					List.of(1, 1, 1)
				);
				int capacity = 4;
				int expected = 2;
				int actual = MaxFill.maxFill(grid, capacity);
				assertEquals(expected, actual);
			}

			/**
			* Test case #6.
			* Input: grid = [[1,1,1],[1,1,1],[1,1,1]], capacity = 5
			* Output: 2
			*/
			@Test
			void testMaxFill6() {
				List<List<Integer>> grid = List.of(
					List.of(1, 1, 1),
					List.of(1, 1, 1),
					List.of(1, 1, 1)
				);
				int capacity = 5;
				int expected = 2;
				int actual = MaxFill.maxFill(grid, capacity);
				assertEquals(expected, actual);
			}

			/**
			* Test case #7.
			* Input: grid = [[1,1,1],[1,1,1],[1,1,1]], capacity = 6
			* Output: 2
			*/
			@Test
			void testMaxFill7() {
				List<List<Integer>> grid = List.of(
					List.of(1, 1, 1),
					List.of(1, 1, 1),
					List.of(1, 1, 1)
				);
				int capacity = 6;
				int expected = 2;
				int actual = MaxFill.maxFill(grid, capacity);
				assertEquals(expected, actual);
			}

			/**
			* Test case #8.
			* Input: grid = [[1,1,1],[1,1,1],[1,1,1]], capacity = 7
			* Output: 2
			*/
			@Test
			void testMaxFill8() {
				List<List<Integer>> grid = List.of(
					List.of(1, 1, 1),
					List.of(1, 1, 1),
					List.of(1, 1, 1)
				);
				int capacity = 7;
				int expected = 2;
				int actual = MaxFill.maxFill(grid, capacity);
				assertEquals(expected, actual);
			}

			/**
			* Test case #9.
			* Input: grid = [[1,1,1],[1,1,1],[1,1,1]], capacity = 8
			* Output: 2
			*/
			@Test
			void testMaxFill9() {
				List<List<Integer>> grid = List.of(
					List.of(1, 1, 1),
					List.of(1, 1, 1),
					List.of(1, 1, 1)
				);
				int capacity = 8;
				int expected = 2;
				int actual = MaxFill.maxFill(grid, capacity);
				assertEquals(expected, actual);
			}

			/**
			* Test case #10.
			* Input: grid = [[1,1,1],[1,1,1],[1,1,1]], capacity = 9
			* Output: 2
			*/
			@Test
			void testMaxFill10() {
				List<List<Integer>> grid = List.of(
					List.of(1, 1, 1),
					List.of(1, 1, 1),
					List.of(1, 1, 1)
				);
				int capacity = 9;
				int expected = 2;
				int actual = MaxFill.maxFill(grid, capacity);
				assertEquals(expected, actual);
			}
}
