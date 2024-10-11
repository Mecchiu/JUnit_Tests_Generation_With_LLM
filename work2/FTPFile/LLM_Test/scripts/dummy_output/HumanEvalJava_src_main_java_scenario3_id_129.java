// MinpathTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minpath}.
* It contains ten unit test cases for the {@link Minpath#minpath(List, int)} method.
*/
class MinpathTest {
			/**
			* Test case 1: grid = [ [1,2,3], [4,5,6], [7,8,9]], k = 3
			* Expected output: [1, 2, 1]
			*/
			@Test
			void testCase1() {
				List<List<Integer>> grid = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
				int k = 3;
				List<Integer> expected = List.of(1, 2, 1);
				List<Integer> actual = Minpath.minpath(grid, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 2: grid = [ [5,9,3], [4,1,6], [7,8,2]], k = 1
			* Expected output: [1]
			*/
			@Test
			void testCase2() {
				List<List<Integer>> grid = List.of(List.of(5, 9, 3), List.of(4, 1, 6), List.of(7, 8, 2));
				int k = 1;
				List<Integer> expected = List.of(1);
				List<Integer> actual = Minpath.minpath(grid, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 3: grid = [ [1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]], k = 4
			* Expected output: [1, 2, 1, 2]
			*/
			@Test
			void testCase3() {
				List<List<Integer>> grid = List.of(List.of(1, 2, 3, 4), List.of(5, 6, 7, 8), List.of(9, 10, 11, 12), List.of(13, 14, 15, 16));
				int k = 4;
				List<Integer> expected = List.of(1, 2, 1, 2);
				List<Integer> actual = Minpath.minpath(grid, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 4: grid = [ [6, 4, 13, 10], [5, 7, 12, 1], [3, 16, 11, 15], [8, 14, 9, 2]], k = 7
			* Expected output: [1, 10, 1, 10, 1, 10, 1]
			*/
			@Test
			void testCase4() {
				List<List<Integer>> grid = List.of(List.of(6, 4, 13, 10), List.of(5, 7, 12, 1), List.of(3, 16, 11, 15), List.of(8, 14, 9, 2));
				int k = 7;
				List<Integer> expected = List.of(1, 10, 1, 10, 1, 10, 1);
				List<Integer> actual = Minpath.minpath(grid, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 5: grid = [ [8, 14, 9, 2], [6, 4, 13, 15], [5, 7, 1, 12], [3, 10, 11, 16]], k = 5
			* Expected output: [1, 7, 1, 7, 1]
			*/
			@Test
			void testCase5() {
				List<List<Integer>> grid = List.of(List.of(8, 14, 9, 2), List.of(6, 4, 13, 15), List.of(5, 7, 1, 12), List.of(3, 10, 11, 16));
				int k = 5;
				List<Integer> expected = List.of(1, 7, 1, 7, 1);
				List<Integer> actual = Minpath.minpath(grid, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 6: grid = [ [11, 8, 7, 2], [5, 16, 14, 4], [9, 3, 15, 6], [12, 13, 10, 1]], k = 9
			* Expected output: [1, 6, 1, 6, 1, 6, 1, 6, 1]
			*/
			@Test
			void testCase6() {
				List<List<Integer>> grid = List.of(List.of(11, 8, 7, 2), List.of(5, 16, 14, 4), List.of(9, 3, 15, 6), List.of(12, 13, 10, 1));
				int k = 9;
				List<Integer> expected = List.of(1, 6, 1, 6, 1, 6, 1, 6, 1);
				List<Integer> actual = Minpath.minpath(grid, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 7: grid = [ [12, 13, 10, 1], [9, 3, 15, 6], [5, 16, 14, 4], [11, 8, 7, 2]], k = 12
			* Expected output: [1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6]
			*/
			@Test
			void testCase7() {
				List<List<Integer>> grid = List.of(List.of(12, 13, 10, 1), List.of(9, 3, 15, 6), List.of(5, 16, 14, 4), List.of(11, 8, 7, 2));
				int k = 12;
				List<Integer> expected = List.of(1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6);
				List<Integer> actual = Minpath.minpath(grid, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 8: grid = [ [2, 7, 4], [3, 1, 5], [6, 8, 9]], k = 8
			* Expected output: [1, 3, 1, 3, 1, 3, 1, 3]
			*/
			@Test
			void testCase8() {
				List<List<Integer>> grid = List.of(List.of(2, 7, 4), List.of(3, 1, 5), List.of(6, 8, 9));
				int k = 8;
				List<Integer> expected = List.of(1, 3, 1, 3, 1, 3, 1, 3);
				List<Integer> actual = Minpath.minpath(grid, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 9: grid = [ [6, 1, 5], [3, 8, 9], [2, 7, 4]], k = 8
			* Expected output: [1, 5, 1, 5, 1, 5, 1, 5]
			*/
			@Test
			void testCase9() {
				List<List<Integer>> grid = List.of(List.of(6, 1, 5), List.of(3, 8, 9), List.of(2, 7, 4));
				int k = 8;
				List<Integer> expected = List.of(1, 5, 1, 5, 1, 5, 1, 5);
				List<Integer> actual = Minpath.minpath(grid, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 10: grid = [ [1, 2], [3, 4]], k = 10
			* Expected output: [1, 2, 1, 2, 1, 2, 1, 2, 1, 2]
			*/
			@Test
			void testCase10() {
				List<List<Integer>> grid = List.of(List.of(1, 2), List.of(3, 4));
				int k = 10;
}
}