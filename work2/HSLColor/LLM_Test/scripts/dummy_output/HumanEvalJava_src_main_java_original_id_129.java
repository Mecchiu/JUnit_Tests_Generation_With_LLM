// MinpathTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
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
				List<List<Integer>> grid = new ArrayList<>();
				grid.add(new ArrayList<>());
				grid.add(new ArrayList<>());
				grid.add(new ArrayList<>());
				grid.get(0).add(1);
				grid.get(0).add(2);
				grid.get(0).add(3);
				grid.get(1).add(4);
				grid.get(1).add(5);
				grid.get(1).add(6);
				grid.get(2).add(7);
				grid.get(2).add(8);
				grid.get(2).add(9);
				int k = 3;
				List<Integer> expected = new ArrayList<>();
				expected.add(1);
				expected.add(2);
				expected.add(1);
				List<Integer> actual = Minpath.minpath(grid, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 2: grid = [ [5,9,3], [4,1,6], [7,8,2]], k = 1
			* Expected output: [1]
			*/
			@Test
			void testCase2() {
				List<List<Integer>> grid = new ArrayList<>();
				grid.add(new ArrayList<>());
				grid.add(new ArrayList<>());
				grid.add(new ArrayList<>());
				grid.get(0).add(5);
				grid.get(0).add(9);
				grid.get(0).add(3);
				grid.get(1).add(4);
				grid.get(1).add(1);
				grid.get(1).add(6);
				grid.get(2).add(7);
				grid.get(2).add(8);
				grid.get(2).add(2);
				int k = 1;
				List<Integer> expected = new ArrayList<>();
				expected.add(1);
				List<Integer> actual = Minpath.minpath(grid, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 3: grid = [ [1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]], k = 4
			* Expected output: [1, 2, 1, 2]
			*/
			@Test
			void testCase3() {
				List<List<Integer>> grid = new ArrayList<>();
				grid.add(new ArrayList<>());
				grid.add(new ArrayList<>());
				grid.add(new ArrayList<>());
				grid.add(new ArrayList<>());
				grid.get(0).add(1);
				grid.get(0).add(2);
				grid.get(0).add(3);
				grid.get(0).add(4);
				grid.get(1).add(5);
				grid.get(1).add(6);
				grid.get(1).add(7);
				grid.get(1).add(8);
				grid.get(2).add(9);
				grid.get(2).add(10);
				grid.get(2).add(11);
				grid.get(2).add(12);
				grid.get(3).add(13);
				grid.get(3).add(14);
				grid.get(3).add(15);
				grid.get(3).add(16);
				int k = 4;
				List<Integer> expected = new ArrayList<>();
				expected.add(1);
				expected.add(2);
				expected.add(1);
				expected.add(2);
				List<Integer> actual = Minpath.minpath(grid, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 4: grid = [ [6, 4, 13, 10], [5, 7, 12, 1], [3, 16, 11, 15], [8, 14, 9, 2]], k = 7
			* Expected output: [1, 10, 1, 10, 1, 10, 1]
			*/
			@Test
			void testCase4() {
				List<List<Integer>> grid = new ArrayList<>();
				grid.add(new ArrayList<>());
				grid.add(new ArrayList<>());
				grid.add(new ArrayList<>());
				grid.add(new ArrayList<>());
				grid.get(0).add(6);
				grid.get(0).add(4);
				grid.get(0).add(13);
				grid.get(0).add(10);
				grid.get(1).add(5);
				grid.get(1).add(7);
				grid.get(1).add(12);
				grid.get(1).add(1);
				grid.get(2).add(3);
				grid.get(2).add(16);
				grid.get(2).add(11);
				grid.get(2).add(15);
				grid.get(3).add(8);
				grid.get(3).add(14);
				grid.get(3).add(9);
				grid.get(3).add(2);
				int k = 7;
				List<Integer> expected = new ArrayList<>();
				expected.add(1);
				expected.add(10);
				expected.add(1);
				expected.add(10);
				expected.add(1);
				expected.add(10);
				expected.add(1);
				List<Integer> actual = Minpath.minpath(grid, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 5: grid = [ [8, 14, 9, 2], [6, 4, 13, 15], [5, 7, 1, 12], [3, 10, 11, 16]], k = 5
			* Expected output: [1, 7, 1, 7, 1]
			*/
			@Test
			void testCase5() {
				List<List<Integer>> grid = new ArrayList<>();
				grid.add(new ArrayList<>());
				grid.add(new ArrayList<>());
				grid.add(new ArrayList<>());
				grid.add(new ArrayList<>());
				grid.get(0).add(8);
				grid.get(0).add(14);
				grid.get(0).add(9);
				grid.get(0).add(2);
				grid.get(1).add(6);
				grid.get(1).add(4);
				grid.get(1).add(13);
				grid.get(1).add(15);
				grid.get(2).add(5);
				grid.get(2).add(7);
				grid.get(2).add(1);
				grid.get(2).add(12);
				grid.get(3).add(3);
				grid.get(3).add(10);
				grid.get(3).add(11);
				grid.get(3).add(16);
				int k = 5;
				List<Integer> expected = new ArrayList<>();
				expected.add(1);
				expected.add(7);
				expected.add(1);
				expected.add(7);
				expected.add(1);
				List<Integer> actual = Minpath.minpath(grid, k);
				assertEquals(expected, actual);
			}

			/**
			* Test case 6: grid = [ [11, 8, 7, 2], [5, 16, 14, 4], [9, 3, 15, 6], [12, 13, 10, 1]], k = 9
			* Expected output: [1, 6, 1, 6, 1, 6, 1, 6, 1]
			*/
			@Test
			void testCase6() {
				List<List<Integer>> grid = new ArrayList<>();
				grid.add(new ArrayList<>());
				grid.add(new ArrayList<>());
				grid.add(new ArrayList<>());
				grid.add(new ArrayList<>());
				grid.get(0).add(11);
				grid.get(0).add(8);
				grid.get(0).add(7);
				grid.get(0).add(2);
				grid.get(1).add(5);
				grid.get(1).add(16);
				grid.get(1).add(14);
				grid.get(1).add(4);
				grid.get(2).add(9);
				grid.get(2).add(3);
				grid.get(2).add(15);
				grid.get(2).add(6);
				grid.get(3).add(12);
				grid.get(3).add(13);
				grid.get(3).add(10);
				grid.get(3).add(1);
				int k = 9;
				List<Integer> expected = new ArrayList<>();
				expected.add(1);
				expected.add(6);
				expected.add(1);
				expected.add(6);
				expected.add(1);
				expected.add(6);
				expected.add(1);
				expected.add(6);
				expected.add(1);
				List<Integer> actual = Minpath.minpath(grid, k);
				assertEquals(expected, actual);
			}

}