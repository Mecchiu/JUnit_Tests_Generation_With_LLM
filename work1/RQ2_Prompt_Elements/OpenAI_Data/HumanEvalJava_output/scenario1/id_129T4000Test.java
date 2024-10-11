// MinpathTest.java
package scenario1;

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
	* The input grid is empty.
	* The expected output is an empty list.
	*/
	@Test
	void testCase1() {
		List<List<Integer>> grid = new ArrayList<>();
		int k = 1;
		List<Integer> expected = new ArrayList<>();
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input grid is a 1x1 matrix.
	* The expected output is a list containing only 1.
	*/
	@Test
	void testCase2() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row = new ArrayList<>();
		row.add(1);
		grid.add(row);
		int k = 1;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input grid is a 2x2 matrix.
	* The expected output is a list containing only 1.
	*/
	@Test
	void testCase3() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(1);
		List<Integer> row2 = new ArrayList<>();
		row2.add(1);
		row2.add(1);
		grid.add(row1);
		grid.add(row2);
		int k = 1;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input grid is a 3x3 matrix.
	* The expected output is a list containing only 1.
	*/
	@Test
	void testCase4() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(1);
		row1.add(1);
		List<Integer> row2 = new ArrayList<>();
		row2.add(1);
		row2.add(1);
		row2.add(1);
		List<Integer> row3 = new ArrayList<>();
		row3.add(1);
		row3.add(1);
		row3.add(1);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		int k = 1;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input grid is a 3x3 matrix.
	* The expected output is a list containing only 1.
	*/
	@Test
	void testCase5() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(1);
		row1.add(1);
		List<Integer> row2 = new ArrayList<>();
		row2.add(1);
		row2.add(1);
		row2.add(1);
		List<Integer> row3 = new ArrayList<>();
		row3.add(1);
		row3.add(1);
		row3.add(1);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		int k = 2;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(1);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input grid is a 3x3 matrix.
	* The expected output is a list containing only 1.
	*/
	@Test
	void testCase6() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(1);
		row1.add(1);
		List<Integer> row2 = new ArrayList<>();
		row2.add(1);
		row2.add(1);
		row2.add(1);
		List<Integer> row3 = new ArrayList<>();
		row3.add(1);
		row3.add(1);
		row3.add(1);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		int k = 3;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(1);
		expected.add(1);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input grid is a 3x3 matrix.
	* The expected output is a list containing only 1.
	*/
	@Test
	void testCase7() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(1);
		row1.add(1);
		List<Integer> row2 = new ArrayList<>();
		row2.add(1);
		row2.add(1);
		row2.add(1);
		List<Integer> row3 = new ArrayList<>();
		row3.add(1);
		row3.add(1);
		row3.add(1);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		int k = 4;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input grid is a 3x3 matrix.
	* The expected output is a list containing only 1.
	*/
	@Test
	void testCase8() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(1);
		row1.add(1);
		List<Integer> row2 = new ArrayList<>();
		row2.add(1);
		row2.add(1);
		row2.add(1);
		List<Integer> row3 = new ArrayList<>();
		row3.add(1);
		row3.add(1);
		row3.add(1);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		int k = 5;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input grid is a 3x3 matrix.
	* The expected output is a list containing only 1.
	*/
	@Test
	void testCase9() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(1);
		row1.add(1);
		List<Integer> row2 = new ArrayList<>();
		row2.add(1);
		row2.add(1);
		row2.add(1);
		List<Integer> row3 = new ArrayList<>();
		row3.add(1);
		row3.add(1);
		row3.add(1);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		int k = 6;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input grid is a 3x3 matrix.
	* The expected output is a list containing only 1.
	*/
	@Test
	void testCase10() {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(1);
		row1.add(1);
		List<Integer> row2 = new ArrayList<>();
		row2.add(1);
		row2.add(1);
		row2.add(1);
		List<Integer> row3 = new ArrayList<>();
		row3.add(1);
		row3.add(1);
		row3.add(1);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		int k = 7;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		List<Integer> actual = Minpath.minpath(grid, k);
		assertEquals(expected, actual);
	}
}