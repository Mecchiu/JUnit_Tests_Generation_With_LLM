// MinpathTest.java
package scenario2;

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
			* Test case for the {@link Minpath#minpath(List, int)} method.
			* It checks the correctness of the returned list.
			*/
			@Test
			void testMinpath() {
						List<List<Integer>> grid = new ArrayList<>();
						grid.add(new ArrayList<>());
						grid.add(new ArrayList<>());
						grid.add(new ArrayList<>());
						grid.get(0).add(1);
						grid.get(0).add(2);
						grid.get(0).add(3);
						grid.get(1).add(6);
						grid.get(1).add(5);
						grid.get(1).add(4);
						grid.get(2).add(7);
						grid.get(2).add(8);
						grid.get(2).add(9);
						int k = 4;
						List<Integer> expected = new ArrayList<>();
						expected.add(1);
						expected.add(6);
						expected.add(5);
						expected.add(4);
						List<Integer> actual = Minpath.minpath(grid, k);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Minpath#minpath(List, int)} method.
			* It checks the correctness of the returned list.
			*/
			@Test
			void testMinpath2() {
						List<List<Integer>> grid = new ArrayList<>();
						grid.add(new ArrayList<>());
						grid.add(new ArrayList<>());
						grid.add(new ArrayList<>());
						grid.get(0).add(1);
						grid.get(0).add(2);
						grid.get(0).add(3);
						grid.get(1).add(6);
						grid.get(1).add(5);
						grid.get(1).add(4);
						grid.get(2).add(7);
						grid.get(2).add(8);
						grid.get(2).add(9);
						int k = 5;
						List<Integer> expected = new ArrayList<>();
						expected.add(1);
						expected.add(6);
						expected.add(5);
						expected.add(4);
						expected.add(7);
						List<Integer> actual = Minpath.minpath(grid, k);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Minpath#minpath(List, int)} method.
			* It checks the correctness of the returned list.
			*/
			@Test
			void testMinpath3() {
						List<List<Integer>> grid = new ArrayList<>();
						grid.add(new ArrayList<>());
						grid.add(new ArrayList<>());
						grid.add(new ArrayList<>());
						grid.get(0).add(1);
						grid.get(0).add(2);
						grid.get(0).add(3);
						grid.get(1).add(6);
						grid.get(1).add(5);
						grid.get(1).add(4);
						grid.get(2).add(7);
						grid.get(2).add(8);
						grid.get(2).add(9);
						int k = 6;
						List<Integer> expected = new ArrayList<>();
						expected.add(1);
						expected.add(6);
						expected.add(5);
						expected.add(4);
						expected.add(7);
						expected.add(8);
						List<Integer> actual = Minpath.minpath(grid, k);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Minpath#minpath(List, int)} method.
			* It checks the correctness of the returned list.
			*/
			@Test
			void testMinpath4() {
						List<List<Integer>> grid = new ArrayList<>();
						grid.add(new ArrayList<>());
						grid.add(new ArrayList<>());
						grid.add(new ArrayList<>());
						grid.get(0).add(1);
						grid.get(0).add(2);
						grid.get(0).add(3);
						grid.get(1).add(6);
						grid.get(1).add(5);
						grid.get(1).add(4);
						grid.get(2).add(7);
						grid.get(2).add(8);
						grid.get(2).add(9);
						int k = 7;
						List<Integer> expected = new ArrayList<>();
						expected.add(1);
						expected.add(6);
						expected.add(5);
						expected.add(4);
						expected.add(7);
						expected.add(8);
						expected.add(9);
						List<Integer> actual = Minpath.minpath(grid, k);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Minpath#minpath(List, int)} method.
			* It checks the correctness of the returned list.
			*/
			@Test
			void testMinpath5() {
						List<List<Integer>> grid = new ArrayList<>();
						grid.add(new ArrayList<>());
						grid.add(new ArrayList<>());
						grid.add(new ArrayList<>());
						grid.get(0).add(1);
						grid.get(0).add(2);
						grid.get(0).add(3);
						grid.get(1).add(6);
						grid.get(1).add(5);
						grid.get(1).add(4);
						grid.get(2).add(7);
						grid.get(2).add(8);
						grid.get(2).add(9);
						int k = 8;
						List<Integer> expected = new ArrayList<>();
						expected.add(1);
						expected.add(6);
						expected.add(5);
						expected.add(4);
						expected.add(7);
						expected.add(8);
						expected.add(9);
						expected.add(2);
						List<Integer> actual = Minpath.minpath(grid, k);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Minpath#minpath(List, int)} method.
			* It checks the correctness of the returned list.
			*/
			@Test
			void testMinpath6() {
						List<List<Integer>> grid = new ArrayList<>();
						grid.add(new ArrayList<>());
						grid.add(new ArrayList<>());
						grid.add(new ArrayList<>());
						grid.get(0).add(1);
						grid.get(0).add(2);
						grid.get(0).add(3);
						grid.get(1).add(6);
						grid.get(1).add(5);
						grid.get(1).add(4);
						grid.get(2).add(7);
						grid.get(2).add(8);
						grid.get(2).add(9);
						int k = 9;
						List<Integer> expected = new ArrayList<>();
						expected.add(1);
						expected.add(6);
						expected.add(5);
						expected.add(4);
						expected.add(7);
						expected.add(8);
						expected.add(9);
						expected.add(2);
						expected.add(3);
						List<Integer> actual = Minpath.minpath(grid, k);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Minpath#minpath(List, int)} method.
			* It checks the correctness of the returned list.
			*/
			@Test
			void testMinpath7() {
						List<List<Integer>> grid = new ArrayList<>();
						grid.add(new ArrayList<>());
						grid.add(new ArrayList<>());
						grid.add(new ArrayList<>());
						grid.get(0).add(1);
						grid.get(0).add(2);
						grid.get(0).add(3);
						grid.get(1).add(6);
						grid.get(1).add(5);
						grid.get(1).add(4);
						grid.get(2).add(7);
						grid.get(2).add(8);
						grid.get(2).add(9);
						int k = 10;
						List<Integer> expected = new ArrayList<>();
						expected.add(1);
						expected.add(6);
						expected.add(5);
						expected.add(4);
						expected.add(7);
						expected.add(8);
						expected.add(9);
						expected.add(2);
						expected.add(3);
						expected.add(1);
						List<Integer> actual = Minpath.minpath(grid, k);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Minpath#minpath(List, int)} method.
			* It checks the correctness of the returned list.
			*/
			@Test
			void testMinpath8() {
						List<List<Integer>> grid = new ArrayList<>();
						grid.add(new ArrayList<>());
						grid.add(new ArrayList<>());
						grid.add(new ArrayList<>());
						grid.get(0).add(1);
						grid.get(0).add(2);
						grid.get(0).add(3);
						grid.get(1).add(6);
						grid.get(1).add(5);
						grid.get(1).add(4);
						grid.get(2).add(7);
						grid.get(2).add(8);
						grid.get(2).add(9);
						int k = 11;
						List<Integer> expected = new ArrayList<>();
						expected.add(1);
						expected.add(6);
						expected.add(5);
						expected.add(4);
						expected.add(7);
						expected.add(8);
						expected.add(9);
						expected.add(2);
}
}