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
	* Test case 1.
	* The grid is:
	* 1 2 3
	* 4 5 6
	* 7 8 9
	* The value of k is 3.
	* The expected result is [1, 2, 3].
	*/
	@Test
	void testCase1() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Integer> row2 = new ArrayList<>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Integer> row3 = new ArrayList<>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		int k = 3;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The grid is:
	* 1 2 3
	* 4 5 6
	* 7 8 9
	* The value of k is 4.
	* The expected result is [1, 2, 3, 4].
	*/
	@Test
	void testCase2() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Integer> row2 = new ArrayList<>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Integer> row3 = new ArrayList<>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		int k = 4;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The grid is:
	* 1 2 3
	* 4 5 6
	* 7 8 9
	* The value of k is 5.
	* The expected result is [1, 2, 3, 4, 5].
	*/
	@Test
	void testCase3() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Integer> row2 = new ArrayList<>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Integer> row3 = new ArrayList<>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		int k = 5;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The grid is:
	* 1 2 3
	* 4 5 6
	* 7 8 9
	* The value of k is 6.
	* The expected result is [1, 2, 3, 4, 5, 6].
	*/
	@Test
	void testCase4() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Integer> row2 = new ArrayList<>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Integer> row3 = new ArrayList<>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		int k = 6;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The grid is:
	* 1 2 3
	* 4 5 6
	* 7 8 9
	* The value of k is 7.
	* The expected result is [1, 2, 3, 4, 5, 6, 7].
	*/
	@Test
	void testCase5() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Integer> row2 = new ArrayList<>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Integer> row3 = new ArrayList<>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		int k = 7;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The grid is:
	* 1 2 3
	* 4 5 6
	* 7 8 9
	* The value of k is 8.
	* The expected result is [1, 2, 3, 4, 5, 6, 7, 8].
	*/
	@Test
	void testCase6() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Integer> row2 = new ArrayList<>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Integer> row3 = new ArrayList<>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		int k = 8;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The grid is:
	* 1 2 3
	* 4 5 6
	* 7 8 9
	* The value of k is 9.
	* The expected result is [1, 2, 3, 4, 5, 6, 7, 8, 9].
	*/
	@Test
	void testCase7() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Integer> row2 = new ArrayList<>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Integer> row3 = new ArrayList<>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		int k = 9;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The grid is:
	* 1 2 3
	* 4 5 6
	* 7 8 9
	* The value of k is 10.
	* The expected result is [1, 2, 3, 4, 5, 6, 7, 8, 9, 1].
	*/
	@Test
	void testCase8() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Integer> row2 = new ArrayList<>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Integer> row3 = new ArrayList<>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		int k = 10;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(1);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The grid is:
	* 1 2 3
	* 4 5 6
	* 7 8 9
	* The value of k is 11.
	* The expected result is [1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2].
	*/
	@Test
	void testCase9() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Integer> row2 = new ArrayList<>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Integer> row3 = new ArrayList<>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		int k = 11;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(1);
		expected.add(2);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The grid is:
	* 1 2 3
	* 4 5 6
	* 7 8 9
	* The value of k is 12.
	* The expected result is [1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3].
	*/
	@Test
	void testCase10() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Integer> row2 = new ArrayList<>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Integer> row3 = new ArrayList<>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		int k = 12;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(1);
		expected.add(2);
		expected.add(3);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
}